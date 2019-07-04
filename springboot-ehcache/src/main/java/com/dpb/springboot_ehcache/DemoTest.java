package com.dpb.springboot_ehcache;

import java.util.Arrays;

/**
 * @program:
 * @description: 测试
 * @author: 波波烤鸭
 * @create: 2019-05-20 16:07
 */
public class DemoTest {

    public static void main(String[] args) {
       // System.out.println(isConvert("abc","ddc",0));
        System.out.println(isConvert("abcd","ddce",0));
    }

    /**
     * 有一个字符串A 有一个字符串B 想要从A转换到B，只能一次一次转换，每次转换要把字符串A中的一个字符全部转换成另一个字符，
     * 求字符串A能不能转换成字符串B。例如 "abc" -- "bbc" --- "ddc" 判断转换是否成立
     * abacdb  gbgcdb
     * abcd   ddce
     * 相同字符的位置
     *
     */
    public static boolean isConvert(String A,String B,int index){
        // 字符串转换为字符数组
        char[] c11 = A.toCharArray();
        char[] c21 = B.toCharArray();
        // 获取要替换的字符
        char m = c21[index];
        // 获取被替换的字符
        char f = c11[index];
        // 遍历原字符数组
        for(int i = 0 ; i < c11.length;i++){
            // 如果是和需要替换的字符相同
            if(c11[i]==f){
                c11[i] = m;
            }
        }
        // 字符数组转换为String类型
        A = arrayToString(c11);
        B = arrayToString(c21);

        // 判断是否到了最后一位
        if((index == A.length()-1) ){
            if(A.trim().equals(B.trim())){
                return true;
            }else{
                return false;
            }
        }
        index++;
        // 递归判断
        return isConvert(A,B,index);

    }

    public static String arrayToString(char[] c){
        StringBuilder sb = new StringBuilder();
        for (int i =0;i<c.length;i++){
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
