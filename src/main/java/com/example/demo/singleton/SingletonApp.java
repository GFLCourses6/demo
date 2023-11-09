package com.example.demo.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            Singleton test1 = Singleton.getInstance("Test");
            System.out.println(test1.getValue());
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            Singleton test2 = Singleton.getInstance("qweqwe");
            System.out.println(test2.getValue());
        }
    }
}
