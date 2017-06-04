package com.eatpotteam.eatpotmovie.mainpage.views;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.eatpotteam.eatpotmovie.R;
import com.eatpotteam.eatpotmovie.data.entities.Movie;
import com.eatpotteam.eatpotmovie.mainpage.contracts.MoviesContract;
import com.eatpotteam.eatpotmovie.mainpage.ui.MoviesRecyclerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MoviesFragment extends Fragment implements MoviesContract.View {
    private MoviesContract.Presenter mPresenter;
    private MoviesRecyclerAdapter mMoviesRecyclerAdapter;

    @BindView(R.id.recyclerView_movies)
    protected RecyclerView mMoviesRecyclerView;

    public MoviesFragment() {
        // Required empty public constructor
    }

    public static MoviesFragment newInstance() {
        return new MoviesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mMoviesRecyclerAdapter = new MoviesRecyclerAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        mMoviesRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        mMoviesRecyclerView.setAdapter(mMoviesRecyclerAdapter);
    }

    @Override
    public void setPresenter(MoviesContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void refreshMoviesList(ArrayList<Movie> movies) {
        mMoviesRecyclerAdapter.refreshMoviesList(movies);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }
}
