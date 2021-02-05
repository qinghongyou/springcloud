package com.xiao.thread;

import java.util.concurrent.*;

public class ThreadCallableDemo implements Callable<Integer> {

    /** 计数变量 */
    private int count = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadCallableDemo threadCallableDemo = new ThreadCallableDemo();
        //通过FutureTask获取返回值
        FutureTask<Integer> taskA = new FutureTask<>(threadCallableDemo);

        //实例化线程
        Thread thread = new Thread(taskA, "threadCallableDemoA");
        System.out.println(String.format("线程状态preStart: %s", thread.getState()));

        //启动线程
        thread.start();
        System.out.println(String.format("线程状态afterStart: %s", thread.getState()));

        //通过FutureTask的get()方法获取返回值
        int result = taskA.get();
        System.out.println("是否同步测试....");
        System.out.println(String.format("result: %s", result));
        System.out.println(String.format("线程状态afterGetResult1: %s", thread.getState()));

        //通过FutureTask的get()方法获取返回值 设置超时时间 单位为ms
        int resultWithTime = taskA.get(100, TimeUnit.MILLISECONDS);
        System.out.println(String.format("resultWithTime: %s", resultWithTime));
        System.out.println(String.format("线程状态afterGetResult2: %s", thread.getState()));

    }

    /**
     * 实现Callable的call类
     */
    @Override
    public Integer call() throws Exception {
        //自增
        count++;
        System.out.println(String.format("线程名称：%s, 线程状态：%s, count：%s",
                Thread.currentThread().getName(), Thread.currentThread().getState(), count));
        System.out.println("休眠1000ms....");
        Thread.currentThread().sleep(1000);
        return count;
    }
}
