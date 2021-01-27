package com.xiao.thread;

import java.util.concurrent.CountDownLatch;

public class SynchronizedTestMethod {

    static int n = 100;
    final static CountDownLatch start = new CountDownLatch(n);
    private static  int i = 0;
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < n; j++) {
            Thread thread = new Thread(new addSynchronized());
            thread.start();
        }
        start.await();
        System.out.println(i);
    }

    public static class addSynchronized implements Runnable{
        @Override
        public void run() {
            addSynchronized();
        }
        public static synchronized void addSynchronized(){
            for (int j = 0; j < 1000; j++) {
                i++;
            }
            start.countDown();
        }
    }
}
