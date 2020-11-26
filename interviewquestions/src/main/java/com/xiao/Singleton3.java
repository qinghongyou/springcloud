package com.xiao;

public class Singleton3 {

    public static final Singleton3 INSTANCE;

    // 静态代码块
    static {
        INSTANCE = new Singleton3();
    }

    private Singleton3(){

    }

}
