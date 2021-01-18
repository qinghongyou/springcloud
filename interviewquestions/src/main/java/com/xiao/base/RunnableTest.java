package com.xiao.base;

import java.util.ArrayList;
import java.util.List;

/**
  * 使用Runnable接口模拟4个售票窗口共同卖100张火车票的程序
  * 
  * 共享数据，4个线程共同卖这100张火车票
  * @author jiqinlin
  *
  */
public class RunnableTest {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        for(int i =0;i<3000;i++){
            list.add(i);
        }
        //System.out.println(list);

        MyThread runnable=new MyThread();
        int sum = list.size();
        int threadNum = sum/500 +1;
        List<String> cutList = null;
        for(int j=0;j<threadNum;j++){

            if (j == threadNum - 1) {
                cutList = list.subList(500 * j, sum);
            } else {
                cutList = list.subList(500 * j, 500 * (j + 1));
            }
            System.out.println("main:"+cutList);
            runnable.setCutList(cutList);
            new Thread(runnable).start();

        }



    }

    public static class MyThread implements Runnable{

        List<String> cutList = null;

        public List<String> getCutList() {
            return cutList;
        }

        public void setCutList(List<String> cutList) {
            this.cutList = cutList;
        }

        //车票数量
        private int tickets=100;
        public void run() {
            System.out.println(cutList);
            //while(tickets>0){
            //    System.out.println(Thread.currentThread().getName()+"卖出第【"+tickets--+"】张火车票");
           // }
        }
    }
}
