package com.leetcode.date0808.lee;

/**
 * @author libin
 * @date 2021-08-08 20:14
 */

/**
 * 198
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 *
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class Solution1 {
    public int rob(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                res[i] = nums[i];
                continue;
            }
            if(i == 1){
                res[i] = Math.max(nums[0], nums[1]);
                continue;
            }
            res[i] = Math.max(res[i-1], res[i-2] + nums[i]);
        }
        return res[nums.length-1];
    }
}

public class Rob {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,9,3,1};
        Solution1 solution = new Solution1();
        System.out.println(solution.rob(nums));

    }
}
