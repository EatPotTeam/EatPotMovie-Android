package com.eatpotteam.eatpotmovie;

import android.app.Application;

import com.eatpotteam.eatpotmovie.data.retrofit.ServiceFactory;

/**
 * Author: perqin
 * Date  : 6/5/17
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ServiceFactory.setup();
    }
}
