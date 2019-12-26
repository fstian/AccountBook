package com.yt.pwd.service;

import com.yt.pwd.bean.Account;
import com.yt.pwd.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private AccountMapper  accountDao;


    @Autowired
    public AccountService(AccountMapper accountDao) {
        this.accountDao = accountDao;
    }

    public boolean insert(Account account){

        return accountDao.insert(account)>0;
    }


    public List<Account> selectAll(){
        return accountDao.selectAll();
    }



}
