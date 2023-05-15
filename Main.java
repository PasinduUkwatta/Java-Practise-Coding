import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;


public class Main {
    public static final String EOF ="EOF";
    public static void main(String[] args) {
        ArrayBlockingQueue<> buffer =new ArrayBlockingQueue<>();
        ReentrantLock bufferLock =new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyProducer producer =new MyProducer(buffer,ThreadColor.ANSI_CYAN);
        MyConsumer consumer1 =new MyConsumer(buffer,ThreadColor.ANSI_PURPLE);
        MyConsumer consumer2 =new MyConsumer(buffer,ThreadColor.ANSI_GREEN);

      executorService.execute(producer);
      executorService.execute(consumer1);
      executorService.execute(consumer2);

      executorService.shutdown();
    }
}

class MyProducer implements Runnable{

    private ArrayBlockingQueue<String> buffer;
    private String color;

    public MyProducer(ArrayBlockingQueue buffer, String color) {
        this.buffer = buffer;
        this.color=color;
    }

    @Override
    public void run() {
        Random random =new Random();
        String [] nums ={"1","2","3","4","5"};
        for (String num:nums){
            try {
                System.out.println(color+"Adding ..."+num);
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));

            }catch (InterruptedException e){
                System.out.println("Producer was interuppted");
            }
        }

        System.out.println(color +" Adding EOF and exit..");
        try {
            buffer.put("EOF");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

        }

    }
}

class MyConsumer implements Runnable{

    private ArrayBlockingQueue buffer;
    private String color;

    public MyConsumer(ArrayBlockingQueue buffer, String color) {
        this.buffer = buffer;
        this.color=color;
    }

    @Override
    public void run() {
    while (true){
        synchronized (buffer){
            try {

                if(buffer.isEmpty()){
                    continue;
                }
                if(buffer.peek().equals("EOF")){
                    System.out.println(color +"Exiting");
                    break;
                }else {
                    System.out.println(color+ "Removed " +buffer.remove(0));
                }
            }finally {

            }
        }


    }
    }
}