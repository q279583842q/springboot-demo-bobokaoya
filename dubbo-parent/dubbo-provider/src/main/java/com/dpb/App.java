package com.dpb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: dubbo-parent
 * @description: 主方法
 * @author: 波波烤鸭
 * @create: 2019-05-13 20:39
 */
public class App {

    public static void main(String[] args) throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //挂起当前线程，如果没有改行代码，服务提供者进程会消亡，服务消费者就发现不了提供者了
        Thread.currentThread().join();

    }
}
