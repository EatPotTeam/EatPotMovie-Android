package com.eatpotteam.eatpotmovie.mainpage.presenters;

import com.eatpotteam.eatpotmovie.data.DataRepo;
import com.eatpotteam.eatpotmovie.data.IDataRepo;
import com.eatpotteam.eatpotmovie.mainpage.contracts.MoviesContract;

/**
 * Author: perqin
 * Date  : 6/4/17
 */

public class MoviesPresenter implements MoviesContract.Presenter {
    private final MoviesContract.View mView;
    private final IDataRepo mDataRepo;

    public MoviesPresenter(MoviesContract.View view) {
        mView = view;
        mDataRepo = DataRepo.getInstance();
    }

    @Override
    public void viewCreated() {
        mView.showError("NOT_IMPLEMENTED");
    }
}
