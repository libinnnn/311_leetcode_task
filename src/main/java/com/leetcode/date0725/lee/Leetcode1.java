package com.leetcode.date0725.lee;

/**
 * @author libin
 * @date 2021-07-20 22:45
 */

import java.util.HashMap;

/**
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sList = s.split(" ");
        int sLength = sList.length;
        int patterLength = pattern.length();
        HashMap map = new HashMap();

        if(sLength != patterLength){
            return false;
        }

        for(int i = 0; i < patterLength; i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(sList[i])){
                    return false;
                }
                map.put(pattern.charAt(i), sList[i]);
            } else {
                if(!map.get(pattern.charAt(i)).equals(sList[i])){
                    return false;
                }
            }
        }

        return true;
    }
}


public class Leetcode1 {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "cat cat cat cat";
        Solution solution = new Solution();
        boolean result = solution.wordPattern(pattern, str);
        System.out.println(result);
    }
}
