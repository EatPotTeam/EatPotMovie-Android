package com.eatpotteam.eatpotmovie.data.sources;

import com.eatpotteam.eatpotmovie.data.entities.Movie;
import com.eatpotteam.eatpotmovie.data.retrofit.RetrofitTransformer;
import com.eatpotteam.eatpotmovie.data.retrofit.ServiceFactory;

import java.util.ArrayList;

import io.reactivex.Observable;

/**
 * Author: perqin
 * Date  : 6/9/17
 */

public class MovieSource implements IMoviesSource {
    @Override
    public Observable<ArrayList<Movie>> getMovies() {
        return ServiceFactory.app().getMovies().compose(RetrofitTransformer.apply());
    }

    @Override
    public Observable<Movie> getMovieById(String movieId) {
        return ServiceFactory.app().getMovie(movieId).compose(RetrofitTransformer.apply());
    }
}
