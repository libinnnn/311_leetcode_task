package com.leetcode.date0725.zy;

/**
 * @author zhengyu
 * @date 2021-07-21
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述:给你一个二进制数组 nums ，你需要从中删掉一个元素。
 *
 * 请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。
 *
 * 如果不存在这样的子数组，请返回 0 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-subarray-of-1s-after-deleting-one-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LongestSubarry {
    public static void main(String[] args){
        int[] nums = {1,1,0,1};
        int[] nums1 ={0,1,1,1,0,1,1,0,1};
        int[] nums2 = {1,1,1};
        int[] nums3 = {0,0,0};
        int[] nums4 = {1,1,0,0,1,1,1,0,1};
        int[] nums5 = {1,1,0,0,1,0,1,0,0,1};

        System.out.println(longestSubarry(nums));
        System.out.println(longestSubarry(nums1));
        System.out.println(longestSubarry(nums2));
        System.out.println(longestSubarry(nums3));
        System.out.println(longestSubarry(nums4));
        System.out.println(longestSubarry(nums5));

    }

    public static int longestSubarry(int[] nums){
//        int maxLength = 0;
//        int lefLength = 0;
//        int rightLength = 0;
//        boolean hasZero = false;
//        int i = 0;// 0 代表计算lef,1代表计算right
//        for(int num : nums){
//            if(num == 1){
//                if(i == 0) {
//                    lefLength = lefLength + 1;
//                }else{
//                    rightLength = rightLength + 1;
//                }
//                if(lefLength + rightLength > maxLength) {
//                    maxLength = lefLength + rightLength;
//                }
//            }else{
//                hasZero = true;
//                if(lefLength > 0){
//                    if(i == 0){
//                        i = 1;
//                        continue;
//                    }else{
//                        if(lefLength + rightLength > maxLength) {
//                            maxLength = lefLength + rightLength;
//                        }
//                        lefLength = rightLength;
//                    }
//                }else{
//                    continue;
//                }
//            }
//        }
//        if(!hasZero){
//            maxLength = maxLength -1;
//        }
//        return maxLength;
        int maxLength = 0;
        List<Integer> lengthList = new ArrayList<Integer>();
        int length = 0;
        boolean hasZero = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                length = length + 1;
                if(i == nums.length-1){
                    lengthList.add(length);
                }
            }else{
                hasZero = true;
                lengthList.add(length);
                length = 0;
            }
        }
        if(lengthList.size() == 1) {
            if(!hasZero){
                return lengthList.get(0)-1;
            }else {
                return lengthList.get(0);
            }
        }
        for(int j=1;j<lengthList.size();j++){
            if(lengthList.get(j-1)+lengthList.get(j) > maxLength){
                maxLength = lengthList.get(j-1)+lengthList.get(j);
            }
        }
        return maxLength;
    }

}
