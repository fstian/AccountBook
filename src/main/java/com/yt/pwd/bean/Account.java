package com.yt.pwd.bean;

public class Account {


    private String userName;

    private String dept;

    private String account;

    private String pwd;

    private  String des;


    public Account() {
    }

    public Account(String userName, String dept, String account, String pwd, String des) {
        this.userName = userName;
        this.dept = dept;
        this.account = account;
        this.pwd = pwd;
        this.des = des;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", dept='" + dept + '\'' +
                ", account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
