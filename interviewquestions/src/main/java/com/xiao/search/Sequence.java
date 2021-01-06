package com.xiao.search;

/**
 * 1. 顺序查找
 *         说明：顺序查找适合于存储结构为顺序存储或链接存储的线性表。
 *
 * 基本思想：顺序查找也称为线形查找，属于无序查找算法。从数据结构线形表的一端开始，
 * 顺序扫描，依次将扫描到的结点关键字与给定值k相比较，若相等则表示查找成功；
 * 若扫描结束仍没有找到关键字等于k的结点，表示查找失败。
 *
 * 复杂度分析：　
 *
 * 　　查找成功时的平均查找长度为：（假设每个数据元素的概率相等）
 * ASL = 1/n(1+2+3+…+n) = (n+1)/2 ;
 * 　　当查找不成功时，需要n+1次比较，时间复杂度为O(n);
 *
 * 　　所以，顺序查找的时间复杂度为O(n)。
 */
public class Sequence{

    public static  boolean SequenceSearch(int a[],int k,int value){
        for(int i=0; i<k; i++){
            if(value == a[i])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a[] = {8,2,4,5,3,10,11,6,9};
        System.out.println(SequenceSearch(a,a.length,11));

    }

}
