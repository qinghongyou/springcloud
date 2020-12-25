package com.xiao.thread;

/**
 * 死锁形成的必要条件总结（都满足之后就会产生）：
 *
 * 　　　　①、互斥条件：资源不能被共享，只能被同一个进程使用；
 *
 * 　　　　②、请求与保持条件：已经得到资源的进程可以申请新的资源；
 *
 * 　　　　③、非剥夺条件：已经分配的资源不能从相应的进程中强制剥夺；
 *
 * 　　　　④、循环等待条件：系统中若干进程形成环路，该环路中每个进程都在等待相邻进程占用的资源。
 */
public class DeadLock {

    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLockTest(true));
        Thread t2 = new Thread(new DeadLockTest(false));
        t1.start();
        t2.start();
    }
}

class DeadLockTest implements Runnable{

    private boolean flag;
    static Object obj1 = new Object();
    static Object obj2 = new Object();
    public DeadLockTest(boolean flag) {
        this.flag = flag;
    }

    public void run(){
        if(flag){
            synchronized(obj1){
                System.out.println("if lock1");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2) {
                    System.out.println("if lock2");
                }
            }
        }else{
            synchronized (obj2) {
                System.out.println("else lock2");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1) {
                    System.out.println("else lock1");
                }
            }
        }
    }
}
