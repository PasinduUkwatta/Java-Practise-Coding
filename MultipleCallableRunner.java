package org.example;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List.of(new CallableTask("pasindu"));
        Future<String> welcome =executorService.submit(new CallableTask("pasindu"));

        System.out.println(welcome.get());
        executorService.shutdown();
    }
}
