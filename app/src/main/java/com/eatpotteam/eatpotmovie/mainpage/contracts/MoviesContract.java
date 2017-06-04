package com.eatpotteam.eatpotmovie.mainpage.contracts;

import com.eatpotteam.eatpotmovie.data.entities.Movie;
import com.eatpotteam.eatpotmovie.framework.BaseView;

import java.util.ArrayList;

/**
 * Author: perqin
 * Date  : 6/4/17
 */

public interface MoviesContract {
    interface Presenter {
        void viewCreated();
    }

    interface View extends BaseView<Presenter> {
        void refreshMoviesList(ArrayList<Movie> movies);

        void showError(String message);
    }
}
