package com.xiao.array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] arr = {4, 3, 5, 1, 7, 9, 3};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
