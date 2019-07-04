package com.dpb.spring_boot_data_jpa_demo;

import com.dpb.spring_boot_data_jpa_demo.dao.UsersRepository;
import com.dpb.spring_boot_data_jpa_demo.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDataJpaDemoApplication.class)
public class SpringBootDataJpaDemoApplicationTests {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void testSave(){
        Users users = new Users();
        users.setAddress("深圳固戍");
        users.setAge(20);
        users.setName("张三");
        this.usersRepository.save(users);
    }

}
