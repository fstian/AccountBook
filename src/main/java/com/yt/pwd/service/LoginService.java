package com.yt.pwd.service;

import com.yt.pwd.bean.User;
import com.yt.pwd.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginService {


    private final LoginMapper loginMapper;


    @Autowired
    public LoginService(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }


    public boolean insert(User user) {
        return loginMapper.insert(user) > 0;
    }


    public List<User> query(String userName){
        return loginMapper.query(userName);
    }


}
