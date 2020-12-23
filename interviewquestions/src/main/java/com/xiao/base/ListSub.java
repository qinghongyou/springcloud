package com.xiao.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSub {
    public static void main(String[] args){
        System.out.println("go .......");
        List<String> list = new ArrayList<String>();
        for(int i=0;i<1500;i++){
            User1 user = new User1(i, "name"+i, i, "man");

            list.add(user.toString());
        }
          //向列表中添加数据
        //list.add("Java编程词典");  //向列表中添加数据
        //list.add("C#编程词典");  //向列表中添加数据
        //list.add("ASP.NET编程词典");  //向列表中添加数据
        //list.add("VC编程词典");  //向列表中添加数据
        //list.add("SQL编程词典");  //向列表中添加数据
        Iterator<String> its = list.iterator();  //获取集合迭代器
        System.out.println("集合中所有元素对象:");
        while(its.hasNext()){  //循环遍历集合
            System.out.print(its.next()+"、");  //输出集合内容
        }
        long startTime = System.currentTimeMillis();
        List<String> subList = list.subList(0,1000);  //获取子列表
        long endTime = System.currentTimeMillis();
        System.out.println("time :"+(endTime-startTime));
        System.out.println("\n截取集合中部分元素:");
        Iterator it = subList.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"、");
        }
        System.out.println("time ......");
    }
}
