package com.eatpotteam.eatpotmovie.data.sources;

import com.eatpotteam.eatpotmovie.data.entities.Movie;

import java.util.ArrayList;

import io.reactivex.Observable;

/**
 * Author: perqin
 * Date  : 6/4/17
 */

public interface IMoviesSource {
    Observable<ArrayList<Movie>> getMovies();

    Observable<Movie> getMovieById(String movieId);
}
