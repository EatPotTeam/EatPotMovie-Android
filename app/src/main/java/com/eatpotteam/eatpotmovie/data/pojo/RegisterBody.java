package com.eatpotteam.eatpotmovie.data.pojo;

/**
 * Author: perqin
 * Date  : 6/9/17
 */

public class RegisterBody {
    private String email;
    private String password;

    public RegisterBody() {
        this("", "");
    }

    public RegisterBody(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
