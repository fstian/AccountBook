package com.yt.pwd.controller;


import com.yt.pwd.bean.User;
import com.yt.pwd.common.BaseResp;
import com.yt.pwd.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {


    private LoginService service;


    @Autowired
    public LoginController(LoginService loginService) {

        this.service = loginService;
    }

    @PostMapping("/register")
    private BaseResp<String> register(@RequestBody User user) {
//        List<User> query = service.query("12");
//
//        System.out.println("usersize" + query.size());

        boolean insert = service.insert(user);
        if (insert) {
            return new BaseResp<>("ok");
        }


        return new BaseResp<>(401, "注册失败", "fail");

    }

    @PostMapping("/login")
    private BaseResp<String> login(@RequestBody User user) {
        List<User> userList = service.query(user.getUserName());
        if (userList.size() > 0) {
            User queryUser = userList.get(0);
            if (queryUser.getPwd().equals(user.getPwd())) {
                return new BaseResp<>("loginSuccess");
            }
        }
        return new BaseResp<>(404, "登陆失败", "fail");
    }


}
