package com.eatpotteam.eatpotmovie.data.retrofit;

/**
 * Author: perqin
 * Date  : 6/7/17
 */

class ErrorBody {
    public ErrorBody() {
        this("");
    }

    public ErrorBody(String error) {
        this.error = error;
    }

    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
