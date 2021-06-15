package com.codewithrishi;

import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool implements MyExecutorService {

    static int capacity;
    static int currentCapacity;
    static LinkedBlockingQueue<Runnable> linkedBlockingQueue;
    static Execution execution;

    public MyThreadPool(int capacity) {
        this.capacity=capacity;
        currentCapacity=0;
        linkedBlockingQueue=new LinkedBlockingQueue<>();
        execution=new Execution();
    }


    @Override
    public void submit(Runnable r) {
        linkedBlockingQueue.add(r);
        execution.executeMyMethod();
    }
}
