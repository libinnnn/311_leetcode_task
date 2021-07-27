package com.leetcode.date0801.lee;

/**
 * @author libin
 * @date 2021-07-27 17:09
 */

/**
 * 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个下标。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > max){
                return false;
            }
            max = Math.max(max, i+nums[i]);
        }

        return true;
    }
}

public class CanJump {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        Solution solution = new Solution();
        System.out.println(solution.canJump(nums));
    }

}
