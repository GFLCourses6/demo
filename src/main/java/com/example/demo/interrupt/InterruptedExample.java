package com.example.demo.interrupt;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class InterruptedExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch mainCDL = new CountDownLatch(1);
        CountDownLatch awaitCDL = new CountDownLatch(2);

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("Interrupted status on startup = " + Thread.currentThread().isInterrupted());
                int i = 0;
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        System.out.println("Do some work...." + i++);
                        awaitCDL.countDown();
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted exception");
                        System.out.println("Thread name = " + Thread.currentThread().getName());
                        System.out.println("Interrupted status after exception = " + Thread.currentThread().isInterrupted());
                        Thread.currentThread().interrupt();
                        System.out.println("Interrupted status after change status = " + Thread.currentThread().isInterrupted());
                    }
                }
                mainCDL.countDown();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("MAIN Thread name = " + thread.getName());
        awaitCDL.await();
        thread.interrupt();
        System.out.println("MAIN Interrupted status after change status = " + thread.isInterrupted());
        mainCDL.await();
        System.out.println("Application completed");
    }
}
