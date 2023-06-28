package com.multi;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i =20;i>=0;i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("# process #2- complete!");
    }
}
