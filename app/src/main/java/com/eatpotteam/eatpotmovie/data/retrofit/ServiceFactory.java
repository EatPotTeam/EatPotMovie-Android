package com.eatpotteam.eatpotmovie.data.retrofit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.eatpotteam.eatpotmovie.BuildConfig;

import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author: perqin
 * Date  : 6/9/17
 */

public class ServiceFactory {
    private static final String APP_HOST = BuildConfig.APP_HOST;

    private static EatPotMovieService app;
    // NOTE: This field is synchronized and should only be read/written with get/set methods
    private static String credential;

    public static void setup() {
        Retrofit retrofit = buildRetrofit(new OkHttpClient.Builder().authenticator(new BasicAuthenticator()).build());
        app = retrofit.create(EatPotMovieService.class);
    }

    public static EatPotMovieService app() {
        return app;
    }

    public synchronized static void setCredentials(String email, String password) {
        credential = Credentials.basic(email, password);
    }

    public synchronized static void setCredentials(String token) {
        credential = Credentials.basic(token, "");
    }

    private synchronized static String getCredential() {
        return credential;
    }

    private static Retrofit buildRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(APP_HOST)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private static class BasicAuthenticator implements Authenticator {
        @Nullable
        @Override
        public Request authenticate(@NonNull Route route, @NonNull Response response) throws IOException {
            if (response.request().header("Authorization") != null) {
                return null; // Give up, we've already failed to authenticate.
            }
            return response.request().newBuilder()
                    .header("Authorization", getCredential())
                    .build();
        }
    }
}
