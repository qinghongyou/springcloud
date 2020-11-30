package com.xiao;

/**
 * 继承Thread的方式
 *
 * Thread类实际上也是实现Runnable接口，所以当我们继承Thread的时候我们即使不实现run()方法也不会报错，
 * 这种方式也经常用。
 *
 * 下面我写了两种不同继承Thread的代码，大家可以看一下区别，我在网上看到很多人说
 * 继承Thread实现多线程，线程间不能共享数据，但是我用下面的代码1方式似乎也可以共享哇，
 * 欢迎大家提出质疑。
 */
public class ThreadThreadDemo2 extends Thread{

    /** 计数变量 */
    private int count = 0;

    public static void main(String[] args) throws InterruptedException {

        ThreadThreadDemo2  threadThreadDemo2 = new ThreadThreadDemo2();

        //实例化线程
        Thread thread = new Thread(threadThreadDemo2, "threadThreadDemoA");
        System.out.println(String.format("线程状态preStart: %s", thread.getState()));

        //启动线程
        thread.start();
        System.out.println(String.format("线程状态afterStart: %s", thread.getState()));

        //主线程休眠1000s
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
