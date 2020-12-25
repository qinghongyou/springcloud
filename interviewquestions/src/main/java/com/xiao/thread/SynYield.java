package com.xiao.thread;

public class SynYield {
    public static void main(String[] args) {
        YieldDemo ms = new YieldDemo();
        Thread t1 = new Thread(ms,"张三吃完还剩");
        Thread t2 = new Thread(ms,"李四吃完还剩");
        Thread t3 = new Thread(ms,"王五吃完还剩");
        t1.start();
        t2.start();
        t3.start();
    }
}
class YieldDemo implements Runnable{
    int count = 20;
    boolean flag = true;
    public void run() {
        while (flag) {
            if(count>0){
                System.out.println(Thread.currentThread().getName() + count-- + "个瓜");
                if(count % 2 == 0){
                    Thread.yield();//线程让步
                }
            }
            if(count==0){
                flag = false;
            }
        }
    }
}
