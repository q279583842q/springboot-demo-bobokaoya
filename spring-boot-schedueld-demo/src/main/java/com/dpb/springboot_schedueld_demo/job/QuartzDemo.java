package com.dpb.springboot_schedueld_demo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @program: spring-boot-schedueld-demo
 * @description: Quartz介绍Job
 * @author: 波波烤鸭
 * @create: 2019-05-21 09:51
 */
public class QuartzDemo implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("quartz任务执行了...."+new Date());
    }
}
