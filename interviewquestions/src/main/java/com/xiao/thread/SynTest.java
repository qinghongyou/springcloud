package com.xiao.thread;

public class SynTest {
    public static void main(String[] args) {
        new Thread(new CountDown(),"倒计时").start();
    }
}

class CountDown implements Runnable{
    int time = 10;
    boolean flag = true;
    public void run() {
        while (flag) {
            if(time>=0){
                System.out.println(Thread.currentThread().getName() + ":" + time--);
                try {
                    Thread.sleep(1000);                                                    //睡眠时间为1秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("run....");
            if(time==0){
                flag = false;
            }
        }

    }
}
