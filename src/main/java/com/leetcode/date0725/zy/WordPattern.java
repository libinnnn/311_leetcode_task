package com.leetcode.date0725.zy;

/**
 * @author zhengyu
 * @date 2021-07-23
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 290. 单词规律
 *
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class WordPattern {
    public static void main(String[] args){
        String pattern ="abba",str = "dog cat cat dog"; //true
        String pattern1 = "abba", str1 = "dog cat cat fish"; //false
        String pattern2 = "aaaa", str2 = "dog cat cat dog";//false
        String pattern3 = "abba", str3 = "dog dog dog dog";//false
        System.out.println(wordPattern(pattern,str));
        System.out.println(wordPattern(pattern1,str1));
        System.out.println(wordPattern(pattern2,str2));
        System.out.println(wordPattern(pattern3,str3));

    }

    public static boolean wordPattern(String pattern,String s){
        String[] strArry = s.split(" ");
        String[] patArry = pattern.split("");
        if(strArry.length != patArry.length) return false;
        Map<String,String> mapPat = new HashMap<String,String>();
        Map<String,String> mapStr = new HashMap<String,String>();
        for(int i = 0; i< patArry.length;i++){
            if(mapPat.containsKey(patArry[i])){
                if(!strArry[i].equals(mapPat.get(patArry[i]))){
                    return false;
                }
            }else{
                mapPat.put(patArry[i],strArry[i]);
            }
            if(mapStr.containsKey(strArry[i])){
                if(!patArry[i].equals(mapStr.get(strArry[i]))){
                    return false;
                }
            }else{
                mapStr.put(strArry[i],patArry[i]);
            }
        }
        return true;
    }

}
