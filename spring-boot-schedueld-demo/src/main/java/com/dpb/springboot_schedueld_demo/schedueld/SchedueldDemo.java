package com.dpb.springboot_schedueld_demo.schedueld;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: spring-boot-schedueld-demo
 * @description: 定时任务案例Scheduled
 * @author: 波波烤鸭
 * @create: 2019-05-21 09:16
 */
@Component
public class SchedueldDemo {

    /**
     * 定时任务方法
     * @Scheduled:设置定时任务
     * cron 属性：cron 表达式。定时任务触发是时间的一个字符串表达形式
     */
    //@Scheduled(cron = "0/2 * * * *  ?")
    public void doSome(){
        System.out.println("定时任务执行了:"+new Date());
    }
}
