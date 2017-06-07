package com.eatpotteam.eatpotmovie.data.retrofit;


import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Author: perqin
 * Date  : 6/7/17
 */

public class HttpException extends retrofit2.HttpException {
    private final ErrorBody errorBody;

    public HttpException(Response<?> response) {
        super(response);
        ErrorBody errorBody;
        try {
            ResponseBody responseBody = response.errorBody();
            if (responseBody != null) {
                errorBody = new Gson().fromJson(responseBody.string(), ErrorBody.class);
            } else {
                errorBody = new ErrorBody("Not an error response!");
            }
        } catch (IOException e) {
            errorBody = new ErrorBody("Malformed error response body!");
        }
        this.errorBody = errorBody;
    }

    public ErrorBody errorBody() {
        return errorBody;
    }
}
