package com.dpb.springboot01servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @program: springboot-01-servlet
 * @description: 文件上传案例
 * @author: 波波烤鸭
 * @create: 2019-05-12 20:33
 */
@RestController
@RequestMapping("/user")
public class UserController  {

    @RequestMapping("/upload")
    public String upload(MultipartFile upload,String username) throws IOException {
        System.out.println("账号:"+username+" "+upload.getOriginalFilename());
        upload.transferTo(new File("c:/tools/",upload.getOriginalFilename()));
        return "success:上传成功";
    }
}
