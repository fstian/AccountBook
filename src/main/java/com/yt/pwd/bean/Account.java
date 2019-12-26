package com.yt.pwd.bean;

public class Account {

    private String account;

    private String pwd;


    public Account(String account, String pwd) {
        this.account = account;
        this.pwd = pwd;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
