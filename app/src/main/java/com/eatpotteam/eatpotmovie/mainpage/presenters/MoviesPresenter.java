package com.eatpotteam.eatpotmovie.mainpage.presenters;

import com.eatpotteam.eatpotmovie.mainpage.contracts.MoviesContract;

/**
 * Author: perqin
 * Date  : 6/4/17
 */

public class MoviesPresenter implements MoviesContract.Presenter {
    private final MoviesContract.View mView;

    public MoviesPresenter(MoviesContract.View view) {
        mView = view;
    }

    @Override
    public void viewCreated() {
        mView.showError("NOT_IMPLEMENTED");
    }
}
