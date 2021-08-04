package com.leetcode.date0808;

/**
 * @author libin
 * @date 2021-08-04 17:49
 */

/**
 * 45 - 跳跃游戏
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * 假设你总是可以到达数组的最后一个位置。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jump-game-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 贪心算法，选取能够跳的最远的位置
 */
public class Jump {

    static class Solution {
        public int jump(int[] nums) {
            int maxJumpLocation = 0;
            int end = 0;
            int step = 0;
            for(int i = 0; i < nums.length-1; i++){
                maxJumpLocation = Math.max(maxJumpLocation, i + nums[i]);
                if(i == end){
                    end = maxJumpLocation;
                    step++;
                }
            }
            return step;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,1,4};
        Solution solution = new Solution();
        System.out.println(solution.jump(nums));
    }
}
