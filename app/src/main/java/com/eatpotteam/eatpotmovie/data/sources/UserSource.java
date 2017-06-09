package com.eatpotteam.eatpotmovie.data.sources;

import com.eatpotteam.eatpotmovie.data.pojo.RegisterBody;
import com.eatpotteam.eatpotmovie.data.retrofit.RetrofitTransformer;
import com.eatpotteam.eatpotmovie.data.retrofit.ServiceFactory;
import com.eatpotteam.eatpotmovie.framework.Irrelevant;

import io.reactivex.Observable;

/**
 * Author: perqin
 * Date  : 6/9/17
 */

public class UserSource implements IUserSource {
    @Override
    public Observable<Object> register(String email, String password) {
        return ServiceFactory.app().register(new RegisterBody(email, password)).compose(RetrofitTransformer.apply());
    }

    @Override
    public Observable<Object> login(String email, String password) {
        ServiceFactory.setCredentials(email, password);
        return ServiceFactory.app()
                .getToken()
                .doOnNext(token -> ServiceFactory.setCredentials(token.getToken()))
                .map(token -> Irrelevant.INSTANCE);
    }
}
