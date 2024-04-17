package org.example;


import java.util.concurrent.*;

class CallableTask implements Callable<String>{


    public CallableTask(String name) {

    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello";
    }
}
public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcome =executorService.submit(new CallableTask("pasindu"));

        System.out.println(welcome.get());
        executorService.shutdown();
    }
}
