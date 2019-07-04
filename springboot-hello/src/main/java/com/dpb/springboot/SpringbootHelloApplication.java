package com.dpb.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootHelloApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootHelloApplication.class);
        // 关闭banner
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }

}
