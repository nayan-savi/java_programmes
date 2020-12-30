package com.examples.multi;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class PCDemo {

    public static void main(String[] args) throws InterruptedException {
        PC pc = new PC();

        Thread t1 = new Thread(()-> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()-> {
            try {
                pc.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        int numOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(numOfCores);
    }
}
