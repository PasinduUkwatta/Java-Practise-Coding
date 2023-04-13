import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;


public class Main {
    public static final String EOF ="EOF";
    public static void main(String[] args) {
        List<String> buffer =new ArrayList<String>();
        ReentrantLock bufferLock =new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyProducer producer =new MyProducer(buffer,ThreadColor.ANSI_CYAN,bufferLock);
        MyConsumer consumer1 =new MyConsumer(buffer,ThreadColor.ANSI_PURPLE,bufferLock);
        MyConsumer consumer2 =new MyConsumer(buffer,ThreadColor.ANSI_GREEN,bufferLock);

      executorService.execute(producer);
      executorService.execute(consumer1);
      executorService.execute(consumer2);

      executorService.shutdown();
    }
}

class MyProducer implements Runnable{

    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
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
                bufferLock.lock();
                try {
                    buffer.add(num);

                }finally {
                    bufferLock.unlock();

                }

                Thread.sleep(random.nextInt(1000));

            }catch (InterruptedException e){
                System.out.println("Producer was interuppted");
            }
        }

        System.out.println(color +" Adding EOF and exit..");
        bufferLock.lock();
        try {
            buffer.add("EOF");

        }finally {
            bufferLock.unlock();

        }

    }
}

class MyConsumer implements Runnable{

    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyConsumer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color=color;
    }

    @Override
    public void run() {
    while (true){
bufferLock.lock();
try {

    if(buffer.isEmpty()){
        continue;
    }
    if(buffer.get(0).equals("EOF")){
        System.out.println(color +"Exiting");
        break;
    }else {
        System.out.println(color+ "Removed " +buffer.remove(0));
    }
}finally {
    bufferLock.unlock();

}

    }
    }
}