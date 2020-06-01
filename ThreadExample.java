


public class ThreadExample implements Runnable{
    public static void main(String[] args) {
      Thread t = new Thread(new ThreadExample());
      t.start();
    }

    public void run(){
        System.out.println("Thread created from implementing Runnable Interface");
    }

}






