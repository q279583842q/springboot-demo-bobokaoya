package com.dpb.springboot_schedueld_demo;

import com.dpb.springboot_schedueld_demo.job.QuartzDemo;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @program: spring-boot-schedueld-demo
 * @description: 测试Quartz
 * @author: 波波烤鸭
 * @create: 2019-05-21 09:52
 */
public class TestMain {

    public static void main(String[] args) throws Exception{
        // 1、创建Job对象:你要做什么事?
        JobDetail job = JobBuilder.newJob(QuartzDemo.class).build();
        /**
         *  2、创建trigger
         * 简单的 trigger 触发时间：通过 Quartz 提供一个方法来完成简单的重复调用 cron
         * Trigger：按照 Cron 的表达式来给定触发的时间
         */
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?")).build();

        // 3.创建Scheduled对象，在什么时候做什么事?
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.scheduleJob(job,trigger);

        // 启动
        scheduler.start();
    }
}
