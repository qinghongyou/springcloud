package com.xiao.search;

/**
 * 2. 二分查找
 * 　说明：元素必须是有序的，如果是无序的则要先进行排序操作。
 *
 * 　　基本思想：也称为是折半查找，属于有序查找算法。用给定值k先与中间结点的关键字比较，
 * 中间结点把线形表分成两个子表，若相等则查找成功；
 * 若不相等，再根据k与该中间结点关键字的比较结果确定下一步查找哪个子表，
 * 这样递归进行，直到查找到或查找结束发现表中没有这样的结点。
 *
 * 　　复杂度分析：最坏情况下，关键词比较次数为log2(n+1)，且期望时间复杂度为O(log2n)；
 *
 * 　　注：折半查找的前提条件是需要有序表顺序存储，对于静态查找表，一次排序后不再变化，
 * 折半查找能得到不错的效率。
 * 但对于需要频繁执行插入或删除操作的数据集来说，维护有序的排序会带来不小的工作量，
 * 那就不建议使用。——《大话数据结构》
 */
public class BinarySearch1{


    public static int binarysearch(int[] a,int n,int value){
        int low = 0;
        int high = n - 1;
        int mid;
        while(low < high){
            mid = (low + high)/2;
            if(value < a[mid])
                high = mid - 1;
            if(value > a[mid])
                low = mid + 1;
            if(value == a[mid])
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] a = {1,4,2,9,8,6,7,0,3,5}
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarysearch(a,a.length,7));
    }

}
