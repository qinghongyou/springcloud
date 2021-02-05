package com.xiao.thread;

public class ThreadRunnableDemo implements Runnable{

    /** 计数变量 */
    private int count = 0;

    public static void main(String[] args) throws InterruptedException {
        ThreadRunnableDemo threadRunnableDemo = new ThreadRunnableDemo();
        //实例化线程
        Thread thread = new Thread(threadRunnableDemo, "threadRunnableDemoA");
        System.out.println(String.format("线程状态preStart: %s", thread.getState()));

        //启动线程
        thread.start();
        System.out.println(String.format("线程状态afterStart: %s", thread.getState()));

        //主线程休眠1000ms
        Thread.sleep(1000);
        System.out.println(String.format("线程状态after1000ms: %s", thread.getState()));

    }

    @Override
    public void run() {
        count++;
        System.out.println(String.format("线程名称：%s, 线程状态：%s, count：%s",
                Thread.currentThread().getName(), Thread.currentThread().getState(), count));
    }
}
