package com.xiao.array;

import java.util.Arrays;

public class ArraySort2 {

    public static void main(String[] args) {

        int[] arr = {4,3,5,1,2,9,3,0};

        Arrays.sort(arr,1,4);

        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
