package com.yt.pwd;


import com.yt.pwd.bean.Account;
import com.yt.pwd.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

@RestController
public class TestController {


    private AccountService service;


    @Autowired
    public TestController(AccountService service) {
        this.service = service;
    }

    @RequestMapping("/test")
    private List<Account> test() {

        try {
            boolean insert = service.insert(new Account("gooogle", "yt", "yt", "yt123", "des"));
            System.out.println("insert_success" + insert);


        } catch (Exception e) {
            System.out.print("insert_success___" + e.getMessage());

        }
        List<Account> accounts = service.selectAll();
        return accounts;
    }


}
