package org.example;

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 1 started");
        for(int i =101;i<=199;i++){
            System.out.print(i +" ");
        }
        System.out.println("\nTask 1 done");
    }
}


class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("\nTask 2 kicked off");

        for(int i =201;i<=299;i++){
            System.out.print(i +" ");
        }
        System.out.println("\nTask 2 done");
    }
}

public class ThreadBasicsRunner {
    public static void main(String[] args) throws InterruptedException {
      Task1 task1 =new Task1();
      task1.setPriority(1);
      task1.start();
      
      Task2 task2 = new Task2();
      Thread task2Thread =new Thread(task2);
      task2Thread.setPriority(10);
      task2Thread.start();

      task1.join();
      task2Thread.join();

        System.out.println("\nTask 3 kicked off");

        for(int i =301;i<=399;i++){
            System.out.print(i +" ");
        }
        System.out.println("\nTask 3 done");
        System.out.println("\nMain Method done");

    }
}
