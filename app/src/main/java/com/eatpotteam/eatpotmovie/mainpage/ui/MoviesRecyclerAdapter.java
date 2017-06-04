package com.eatpotteam.eatpotmovie.mainpage.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eatpotteam.eatpotmovie.R;
import com.eatpotteam.eatpotmovie.data.entities.Movie;

import java.util.ArrayList;

/**
 * Author: perqin
 * Date  : 6/4/17
 */

public class MoviesRecyclerAdapter extends RecyclerView.Adapter<MoviesRecyclerAdapter.ViewHolder> {
    private final ArrayList<Movie> mDataSet = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity_movies_movie, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public void refreshMoviesList(ArrayList<Movie> movies) {
        mDataSet.clear();
        mDataSet.addAll(movies);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
