package com.dpb.springboot_ehcache;

import com.dpb.springboot_ehcache.pojo.User;
import com.dpb.springboot_ehcache.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootEhcacheApplication.class})
public class SpringbootEhcacheApplicationTests {

    @Resource
    private UserService userService;

    @Test
    //@Transactional
    //@Rollback(false)//取消自动回滚
    public void contextLoads() {
        //第一次查询
        System.out.println(this.userService.findUserById(6));
        //第二次查询
        System.out.println(this.userService.findUserById(6));
    }

    @Test
    public void testFindUserByPage(){
        Pageable pageable = new PageRequest(0, 2);
        //第一次查询
        System.out.println(this.userService.findUserByPage(pageable).getTotalElements());

        //第二次查询
        System.out.println(this.userService.findUserByPage(pageable).getTotalElements());

        //第三次查询
        pageable = new PageRequest(1, 2);
        System.out.println(this.userService.findUserByPage(pageable).getTotalElements());
    }

    @Test
    public void testFindAll(){
        //第一次查询
        System.out.println(this.userService.findUserAll().size());

        User users = new User();
        users.setUsername("bobo kaoya");
        users.setUserage(22);
        this.userService.saveUsers(users);

        //第二次查询
        System.out.println(this.userService.findUserAll().size());
    }




}
