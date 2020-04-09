package com.jd.controller;

import com.jd.pojo.user;
import com.jd.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketTimeoutException;
import java.util.List;

/**
 * @description
 * @author: Specime
 * @date:2020/4/7
 */
@RestController
public class JDController {
    @Autowired
    private UserService userService;

    @GetMapping("/jd")
    public List<user> hello() {
        System.out.println("你好，龙某");
       return userService.list();
    }
}
