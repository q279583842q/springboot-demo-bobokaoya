package com.dpb.springboot_exception;

import com.dpb.springboot_exception.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
// 指定启动器
@SpringBootTest(classes = {SpringbootExceptionApplication.class})
public class SpringbootExceptionApplicationTests {

    @Resource
    private UserService userService;

    @Test
    public void contextLoads() {
        userService.insertUser();
    }

}
