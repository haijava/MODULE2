package com.codegym.model.login;

public class Login {
    private String account;
    private String password;
    private boolean remember =false;

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }
    public Login(String account, String password , boolean remember) {
        this.account = account;
        this.password = password;
        this.remember = remember;
    }
    public Login() {
    }
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
