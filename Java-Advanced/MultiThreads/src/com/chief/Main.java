package com.chief;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyThread thread1=new MyThread();


        MyRunnable runnable2=new MyRunnable();
        Thread thread2=new Thread(runnable2);

       thread1.start();
       thread1.join(); //this method forces thread 2 to wait for thread 1 to die to start
       thread2.start();
    }
}
