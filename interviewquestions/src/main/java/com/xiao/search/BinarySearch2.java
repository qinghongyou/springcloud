package com.xiao.search;

public class BinarySearch2{


    public static int binarysearch(int[] a,int value,int low,int high){
        int mid = (low + high)/2;
        if(value == a[mid])
            return mid;
        mid = (low + high)/2;
        if(value < a[mid])
            return binarysearch(a,value,low,mid - 1);
        if(value > a[mid])
            return binarysearch(a,value,mid + 1,high);
        return -1;
    }

    public static void main(String[] args) {
        //int[] a = {1,4,2,9,8,6,7,0,3,5}
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarysearch(a,4,0,a.length-1));

    }

}
