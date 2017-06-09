package com.eatpotteam.eatpotmovie.data.sources;

import io.reactivex.Observable;

/**
 * Author: perqin
 * Date  : 6/7/17
 */

public interface IUserSource {
    Observable<Object> register(String email, String password);

    Observable<Object> login(String email, String password);
}
