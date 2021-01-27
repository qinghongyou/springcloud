package com.xiao.thread;

public class SynchronizedTest {

    private static  int i = 0;
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        synchronized (SynchronizedTest.class){
            synchronized (SynchronizedTest.class){
                i++;
            }
        }
    }


}
