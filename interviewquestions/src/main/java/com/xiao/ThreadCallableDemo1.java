package com.xiao;

import java.util.concurrent.*;

/**
 * 实现Callable的方式
 *
 * 当我们执行线程需要返回值的时候那么就必须选用实现Callable类的方式，
 * 因为目前只有这种方式能返回值。当然这种方式我们也可以不需要获取返回值。
 *
 * 这种方式是通过FutureTask的get()方法（下面代码的第22行）
 * 或者get(long timeout, TimeUnit unit)（下面代码的第28行）
 * 方法获取返回值。当我们看Callable的接口定义的源码会发现“public interface Callable<V> ” ，
 * 我们实现的时候是需要定义返回类型，如下面代码所示。
 *
 * 除此之外我们还需要注意的是：当我们通过FutureTask的get()方法去获取线程的
 * 返回值的时候是要等到线程call()内容都执行完毕之后才能获取得到，并且get()方法
 * 后面的代码必须等待，说明这一定是同步的，所以我们可以在真正需要线程返回值的时候才
 * 通过get()方法去获取，以免被阻塞。当我们通过get(long timeout, TimeUnit unit)方式
 * 去获取的时候可以设置超时时间，如果超过所设置的超时时间都没有获取到线程返回的值则会
 * 抛出 java.util.concurrent.TimeoutException 异常，
 * 当然如果在get(long timeout, TimeUnit unit)之前用get()方式获取了的话就不会抛异常。
 *
 * 实现Callable还有个好处就是可以线程可以抛异常，如果我们需要在线程里抛出异常的话也可以选用这种方式，
 * 其他两种方式只能捕获异常信息。
 */
public class ThreadCallableDemo1 implements Callable<Integer> {

    /** 计数变量 */
    private int count = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadCallableDemo1 threadCallableDemo1 = new ThreadCallableDemo1();

        //通过FutureTask获取返回值
        FutureTask<Integer> taskA = new FutureTask<>(threadCallableDemo1);

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
