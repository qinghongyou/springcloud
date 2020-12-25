package com.xiao.thread;

public class SynTestLock {
    public static void main(String[] args) {
        //定义三个线程，
        MySyn ms = new MySyn();
        Thread t1 = new Thread(ms,"线程1输出：");
        Thread t2 = new Thread(ms,"线程2输出：");
        Thread t3 = new Thread(ms,"线程3输出：");
        t1.start();
        t2.start();
        t3.start();
    }
}

class MySyn implements Runnable{

    int tick = 10;                                        //共执行10次线程
//    public void run() {
//        while(true){
//            if(tick>0){
//                try {
//                    Thread.sleep(100);                                //执行中让线程睡眠10毫秒，
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " " + tick--);
//            }
//        }
//    }
    public void run() {
        while(true){
            synchronized (this) { //同步代码块
                if(tick>0){
                    try {
                        Thread.sleep(10); //执行中让线程睡眠10毫秒，
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " " + tick--);
                }
            }
        }
    }
}
