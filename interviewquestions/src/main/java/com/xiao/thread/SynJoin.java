package com.xiao.thread;

public class SynJoin {
    public static void main(String[] args) throws InterruptedException {
        YieldDemo ms = new YieldDemo();
        Thread t1 = new Thread(ms,"张三吃完还剩");
        Thread t2 = new Thread(ms,"李四吃完还剩");
        Thread t3 = new Thread(ms,"王五吃完还剩");
        t1.start();
        t1.join();
        t2.start();

        t3.start();



        System.out.println( "主线程");
    }

}
