package com.examples.multi;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {

    Integer integer;

    public CallableExample(Integer integer) {
        this.integer = integer;
    }

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int i = random.nextInt(integer);
        Thread.sleep(i * 1000);
        return i;
    }
}
