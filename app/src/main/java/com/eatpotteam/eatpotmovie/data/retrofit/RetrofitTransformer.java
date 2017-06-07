package com.eatpotteam.eatpotmovie.data.retrofit;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Author: perqin
 * Date  : 6/7/17
 */

public final class RetrofitTransformer {
    private RetrofitTransformer() {}

    public static <T>ObservableTransformer<T, T> apply() {
        return tObservable -> tObservable.onErrorReturn(throwable -> {
            // Convert error response body if needed
            if (throwable instanceof retrofit2.HttpException) {
                throw new HttpException(((retrofit2.HttpException) throwable).response());
            } else {
                throw (Exception) throwable;
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
