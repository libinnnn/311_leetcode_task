package com.leetcode.date0801.lee;

/**
 * @author libin
 * @date 2021-07-27 16:40
 */





import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class SingleNumberTest {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            } else {
                if(map.get(num) < 2){
                    int tmp = map.get(num);
                    map.put(num, ++tmp);
                }
            }
        }

        System.out.println(map);

        for(int key: map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return 0;
    }
}


class SingleNumberTest2 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums){
            result ^= num;
        }
        return  result;
    }
}



public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,4,2,2};
        SingleNumberTest2 singleNumberTest = new SingleNumberTest2();
        System.out.println(singleNumberTest.singleNumber(nums));

        int i=1;
        int j=2;
        System.out.println(1^1^2);
    }
}


