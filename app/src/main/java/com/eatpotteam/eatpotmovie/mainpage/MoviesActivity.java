package com.eatpotteam.eatpotmovie.mainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eatpotteam.eatpotmovie.R;
import com.eatpotteam.eatpotmovie.mainpage.contracts.MoviesContract;
import com.eatpotteam.eatpotmovie.mainpage.presenters.MoviesPresenter;
import com.eatpotteam.eatpotmovie.mainpage.views.MoviesFragment;

public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        MoviesFragment moviesFragment = (MoviesFragment) getSupportFragmentManager().findFragmentById(R.id.frameLayout_fragmentContainer);
        if (moviesFragment == null) {
            moviesFragment = MoviesFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_fragmentContainer, moviesFragment).commit();
        }
        MoviesContract.Presenter moviesPresenter = new MoviesPresenter(moviesFragment);
        moviesFragment.setPresenter(moviesPresenter);
    }
}
