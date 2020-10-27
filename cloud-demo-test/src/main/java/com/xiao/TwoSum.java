package com.xiao;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5,6};
        int target = 7;
        Solution solution = new Solution();
        int[] ans = solution.twoSum(nums,target);
        System.out.println("i="+ans[0]+",j="+ans[1]);
    }


    // 1. Two Sum
    // https://leetcode.com/problems/two-sum/description/
    // 时间复杂度：O(n)
    // 空间复杂度：O(n)


}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int[] ans=new int[2];
        int i,j;
        for(i=0;i<l-1;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }

        return ans;

    }
}
