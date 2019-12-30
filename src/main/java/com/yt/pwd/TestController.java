package com.yt.pwd;


import com.yt.pwd.bean.Account;
import com.yt.pwd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {




    private AccountService service;


    @Autowired
    public TestController(AccountService service) {
        this.service = service;
    }

    @RequestMapping("/test")
    private  List<Account>  test(){

        boolean insert = service.insert(new Account("123", "213"));
        System.out.println("insert_success"+ insert);
        List<Account> accounts = service.selectAll();
        return accounts;
    }



}
