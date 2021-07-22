package com.dovalle.util;

import java.util.ArrayList;
import java.util.List;

/**
 * To code a thread, it's possible:
 *      extends Thread ;  OR
 *      implements Runnable;
 */
public class MyThread extends Thread{
    private List<MyThread> simpleThreads = new ArrayList<>();

    @Override
    public void run() {
        super.run();
        System.out.println(String.format("\nThread running ID: %s, Name: %s", this.getId(), this.getName()));
    }

    public void showSimpleThreads(){
        MyThread threadAux;
        for (int count = 1; count < 5; count++) {
            threadAux = new MyThread();
            threadAux.setName("My simple thread number " + count);
            this.simpleThreads.add(threadAux);
        }
        //Run all simple threads contained into list
        this.simpleThreads.stream().forEach(thread -> thread.run());

    }
}
