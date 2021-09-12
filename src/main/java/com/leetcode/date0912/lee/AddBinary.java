package com.leetcode.date0912.lee;

/**
 * @author libin
 * @date 2021-09-12 11:21
 */

/**
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "10"
 * 输出: "101"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/JFETK5
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        int aIndex = a.length()-1;
        int bIndex = b.length()-1;
        int carry = 0;
        String result = "";
        while (aIndex >= 0 || bIndex >= 0) {
            int avalue = (aIndex >= 0)?a.charAt(aIndex--)-'0':0;
            int bvalue = (bIndex >= 0)?b.charAt(bIndex--)-'0':0;
            int temp = avalue + bvalue + carry;
            carry = temp / 2;
            temp = temp % 2;
            result = temp + result;
            System.out.println(result);
        }

        if(carry != 0){
            result =  carry + result;
        }

        return result;

    }


    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
}
