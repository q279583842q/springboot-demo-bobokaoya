package com.dpb.test;

import com.dpb.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: dubbo-parent
 * @description: consumer测试代码
 * @author: 波波烤鸭
 * @create: 2019-05-13 20:50
 */
public class TestConsumer {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = ac.getBean(UserService.class);
        System.out.println(service.sayHello("hello provider"));
    }
}
