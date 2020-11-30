package com.xiao;

public class ThreadThreadDemo3 extends Thread{

    /** 计数变量 */
    private int count = 0;

    public static void main(String[] args) throws InterruptedException {

        ThreadThreadDemo3  threadThreadDemo3 = new ThreadThreadDemo3();

        //实例化线程
        System.out.println(String.format("线程状态preStart: %s", threadThreadDemo3.getState()));

        //启动线程
        threadThreadDemo3.start();
        System.out.println(String.format("线程状态afterStart: %s", threadThreadDemo3.getState()));

        //主线程休眠1000s
        Thread.sleep(1000);
        System.out.println(String.format("线程状态after1000ms: %s", threadThreadDemo3.getState()));
    }

    @Override
    public void run() {

        count++;

        System.out.println(String.format("线程名称：%s, 线程状态：%s, count：%s",
                Thread.currentThread().getName(), Thread.currentThread().getState(), count));
    }
}
