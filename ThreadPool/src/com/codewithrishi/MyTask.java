package com.codewithrishi;

public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello "+Thread.currentThread().getName());
    }
}
