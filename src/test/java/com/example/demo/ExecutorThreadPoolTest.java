package com.example.demo;

import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecutorThreadPoolTest {

    @Test
    public void fixedThreadPoolExecutorTest() {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        });

        assertEquals(2, executorService.getPoolSize());
        assertEquals(1, executorService.getQueue().size());
    }

    @Test
    public void fixedThreadPoolExecutorGetResultTest() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> submit = executorService.submit(() -> "Hello World");
        String s = submit.get();
        assertEquals("Hello World", s);
    }

    @Test
    public void cachedThreadPoolExecutorGetResultTest() {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return null;
        });
        assertEquals(4, executorService.getPoolSize());
        assertEquals(0, executorService.getQueue().size());
    }

    @Test
    public void atomicThreadPoolExecutorGetResultTest() throws ExecutionException, InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger();
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        Future<?> submit = executorService.submit(() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            atomicInteger.set(1);
        });
        submit.get();
        Future<?> submit3 = executorService.submit(() -> {
            atomicInteger.compareAndSet(0, 3);
        });
        submit3.get();
        Future<Boolean> submit1 = executorService.submit(() ->
                atomicInteger.compareAndSet(1, 2)
        );
//        submit3.get();
//        submit.get();
        submit1.get();
        assertEquals(2, atomicInteger.get());
    }
}
