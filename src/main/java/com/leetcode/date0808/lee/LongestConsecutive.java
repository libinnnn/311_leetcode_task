package com.leetcode.date0808.lee;

/**
 * @author libin
 * @date 2021-08-01 11:17
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 *
 * 300 - 最长递增子序列
 */


public class LongestConsecutive {
    static class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<Integer>();
            int maxLength = 0;
            for(Integer num: nums){
                set.add(num);
            }

            for(Integer num: nums){
                int count = 0;
                if(set.contains(num-1)){ // 剪枝，当num-1元素存在的时候，此时没必要进行判断
                    continue;
                }
                while (set.contains(num++)){
                    maxLength = Math.max(maxLength, ++count);
                }
            }

            return maxLength;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        int[] nums1 = new int[]{0,3,7,2,5,8,4,6,0,1};
        LongestConsecutive.Solution solution = new LongestConsecutive.Solution();
        System.out.println(solution.longestConsecutive(nums1));
    }
}
