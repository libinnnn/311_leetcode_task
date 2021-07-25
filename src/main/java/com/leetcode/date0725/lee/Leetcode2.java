package com.leetcode.date0725.lee;

/**
 * @author libin
 * @date 2021-07-25 12:39
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二进制数组 nums ，你需要从中删掉一个元素。
 *
 * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
 *
 * 如果不存在这样的子数组，请返回 0 。
 */
class Solution2 {
    public int longestSubarray(int[] nums) {
        int count = 0;
        // 将连续的1加起来，简化数组
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i] == 0){
                if(count > 0){
                    list.add(count);
                }
                list.add(0);
                count = 0;
            }
            if(i == nums.length-1 && count > 0){
                list.add(count);
            }
        }
        System.out.println(list);



        int max = 0;
        // 处理全为1的这种情况，需要强制删除1个
        if(list.size() == 1 && list.get(0) == nums.length){
            for(Integer k: list){
                max += k;
            }
            return max-1;
        }

        // 当简化后的数组元素个数小于4的时候，全部元素相加即可
        if(list.size() < 4){
            for(Integer k: list){
                max += k;
            }
            return max;
        }
        // 简化数组任意三个相加，取任意联系三个的最大值
        for(int j = 0; j < list.size(); j++){
            if(j+2 > list.size()-1){
                return max;
            }
            int temp = list.get(j) + list.get(j+1) + list.get(j+2);
            if(temp > max){
                max = temp;
            }
        }

        return 0;
    }
}

public class Leetcode2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1};
        Solution2 solution = new Solution2();
        int result = solution.longestSubarray(nums);
        System.out.println(result);
    }
}
