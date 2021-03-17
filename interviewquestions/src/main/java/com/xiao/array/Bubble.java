package com.xiao.array;

import java.util.Arrays;

public class Bubble {

    public static void bubble(int[] arr){

        int temp;
        //根据角标进行比较，
        for(int i = 0; i<arr.length; i++){
            //j是数组的最后一个角标
            for (int j = arr.length-1; j > i; j--) {

                if (arr[j] < arr[j - 1]) {
                    //从后往前进行比较，小数往前，一轮之后最小数就在最前面了
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3,22,5,3,66,2,9};

        bubble(arr);

        //使用foreach循环输出
        for(int x : arr){
            System.out.println(x);
        }
        //使用字符串表达形式输出，输出形式更为直观
        System.out.println(Arrays.toString(arr));
    }
}
