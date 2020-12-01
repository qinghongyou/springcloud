package com.xiao.listset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * 运行结果:
 * Ordering in HashSet :[A, B, C, D, E] (无顺序)
 * Order of element in LinkedHashSet :[B, E, D, C, A] (FIFO插入有序)
 * Order of objects in TreeSet :[A, B, C, D, E] (排序)
 */

public class TestSet {

    public static void main(String args[]) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String data : Arrays.asList("B", "E", "D", "C", "A")) {
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
        }

        //不保证有序
        System.out.println("Ordering in HashSet :" + hashSet);
        //FIFO保证安装插入顺序排序
        System.out.println("Order of element in LinkedHashSet :" + linkedHashSet);
        //内部实现排序
        System.out.println("Order of objects in TreeSet :" + treeSet);
    }
}
