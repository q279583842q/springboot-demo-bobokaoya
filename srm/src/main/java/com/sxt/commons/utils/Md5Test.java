package com.sxt.commons.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @program: srm
 * @description: 测试MD5
 * @author: 波波烤鸭
 * @create: 2019-05-03 22:12
 */
public class Md5Test {
    public static void main(String[] args) {
        Md5Hash md = new Md5Hash("123456","abc",1024);
        System.out.println(md);
    }
}
