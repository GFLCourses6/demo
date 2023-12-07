package com.example.demo.executorExample;

import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.
                scheduleAtFixedRate(() -> {
                            System.out.println("Hello World");
                            countDownLatch.countDown();
                        },
                        2, 1, TimeUnit.SECONDS);
        countDownLatch.await(4, TimeUnit.SECONDS);
        scheduledFuture.cancel(true);
    }
}
