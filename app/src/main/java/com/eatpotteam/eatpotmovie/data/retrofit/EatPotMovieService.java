package com.eatpotteam.eatpotmovie.data.retrofit;

import com.eatpotteam.eatpotmovie.data.entities.Movie;
import com.eatpotteam.eatpotmovie.data.pojo.RegisterBody;
import com.eatpotteam.eatpotmovie.data.pojo.Token;

import java.util.ArrayList;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Author: perqin
 * Date  : 6/4/17
 */

public interface EatPotMovieService {
    @POST("auth/register")
    Observable<Object> register(@Body RegisterBody registerBody);

    @GET("api/token")
    Observable<Token> getToken();

    @GET("movie")
    Observable<ArrayList<Movie>> getMovies();

    @GET("movie/{id}")
    Observable<Movie> getMovie(@Path("id") String movieId);
}
