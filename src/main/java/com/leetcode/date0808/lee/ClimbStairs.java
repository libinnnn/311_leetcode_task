package com.leetcode.date0808.lee;

/**
 * @author libin
 * @date 2021-08-08 18:59
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 70
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
class Solution {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
        if(n <= 2 && n > 0){
            return n;
        }
        if(n <= 0){
            return 0;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int res = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, res);

        return res;
    }
}
public class ClimbStairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(3));
    }
}
