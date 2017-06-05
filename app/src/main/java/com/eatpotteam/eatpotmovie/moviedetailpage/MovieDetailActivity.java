package com.eatpotteam.eatpotmovie.moviedetailpage;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.eatpotteam.eatpotmovie.R;
import com.eatpotteam.eatpotmovie.showingspage.ShowingsActivity;

public class MovieDetailActivity extends AppCompatActivity {
    private ImageView poster;
    private TextView title;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        poster = (ImageView) findViewById(R.id.iv_detail_poster);
        title = (TextView) findViewById(R.id.tv_detail_title);
        info = (TextView) findViewById(R.id.tv_detail_info);

        requestMovieInfo(getIntent().getIntExtra("movieId", 0));

        findViewById(R.id.btn_detail_buy).setOnClickListener(
                view -> startActivity(
                        new Intent(MovieDetailActivity.this,
                                ShowingsActivity.class)));
    }

    private void requestMovieInfo(int movieId) {
        poster.setImageBitmap(BitmapFactory.decodeFile(getLocalPoster(movieId)));
        title.setText(getMovieTitle(movieId));
        info.setText(getMovieInfo(movieId));
    }


}
