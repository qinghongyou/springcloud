package com.xiao.thread;

public class StopThread {

    public static void main(String[] args) {
        int num = 0;
        StopTh st = new StopTh();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        t1.start();
        t2.start();
        //设置主线程执行50次，执行结束之后停止线程
        while (true) {
            if(num++ == 50){
                st.flagChange();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "..." + num);
        }
    }
}

class StopTh implements Runnable{

    private boolean flag = true;
    public void run() {
        while(flag){
            System.out.println(Thread.currentThread().getName() + " stop run" );
        }
    }
    public void flagChange(){
        flag = false;
    }
}
