package com.xiao.listset;

import java.util.TreeSet;

public class MyClass3 {

    public static void main(String[] args) {
        //创建集合对象
        //TreeSet(Comparator<? super E> comparator) 构造一个新的空 TreeSet，它根据指定比较器进行排序。
        TreeSet<Student1> ts=new TreeSet<Student1>(new MyComparator());

        //创建元素对象
        Student1 s1=new Student1("zhangsan",20);
        Student1 s2=new Student1("lis",22);
        Student1 s3=new Student1("wangwu",24);
        Student1 s4=new Student1("chenliu",26);
        Student1 s5=new Student1("zhangsan",22);
        Student1 s6=new Student1("qianqi",24);

        //将元素对象添加到集合对象中
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历
        for(Student1 s:ts){
            System.out.println(s.getName()+"-----------"+s.getAge());
        }
    }
}


