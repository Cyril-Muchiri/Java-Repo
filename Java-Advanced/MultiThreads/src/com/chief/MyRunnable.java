package com.chief;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.print("Thread #2 :process -"+ i+" \n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 : complete");
    }
}
