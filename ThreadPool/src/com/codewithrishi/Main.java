package com.codewithrishi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // One Liner Code for Simple Thread pool -{ ExecutorService executorService=Executors.newFixedThreadPool(no of threads) }

        // Custom Thread Pool
        MyExecutorService myExecutorService=MyExecutors.myNewFixedThreadPool(5);
        for(int i=0;i<10;i++){
            myExecutorService.submit(new MyTask());
        }
    }
}
