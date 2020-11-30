package com.xiao;

public class TestStep {

    /**
     * 递归
     * @param n
     * @return
     */
    public static int f(int n){
        if(n<1){
            throw new IllegalArgumentException(n+"不能小于1");
        }
        if(n==1 || n==2){
            return n;
        }
        return f(n-2)+f(n-1);
    }

    public static int f1(int n){
        int one = 1;
        int two = 2;
        int sum = 0;
        for(int i=3; i<=n; i++){
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(f1(5));
    }
}
