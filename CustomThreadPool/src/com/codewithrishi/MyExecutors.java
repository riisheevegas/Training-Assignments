package com.codewithrishi;

public class MyExecutors {
    int capacity;

    public static MyExecutorService myNewFixedThreadPool(int capacity) {
        return new MyThreadPool(capacity);
    }
}
