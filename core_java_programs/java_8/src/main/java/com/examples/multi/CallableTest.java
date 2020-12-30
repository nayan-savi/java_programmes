package com.examples.multi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] future = new FutureTask[5];

        for (int i = 0; i < 5; i++) {
            CallableExample callableExample = new CallableExample(5);
            future[i] = new FutureTask(callableExample);

            Thread thread = new Thread(future[i]);
            thread.start();
        }

        for (int i = 0; i < 5; i++) {
           // System.out.println(future[i].get());
        }

        List<Future<Integer>> futures = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 5; i++) {
            Future<Integer> submit = executorService.submit(new CallableExample(5));
            futures.add(submit);
        }

        futures.forEach(f-> {
            try {
                System.out.println(f.get()+" --> "+ "Task is completed: "+ f.isDone());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();

    }
}
