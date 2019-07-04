package com.dpb.springboot_schedueld_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 开启Scheduled定时任务
public class SpringBootSchedueldDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSchedueldDemoApplication.class, args);
    }

}
