package com.eatpotteam.eatpotmovie.showingspage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.eatpotteam.eatpotmovie.R;

import butterknife.BindView;

public class ShowingsActivity extends AppCompatActivity {
    @BindView(R.id.cinema_of_showing_info)
    TextView tvCinema;
    @BindView(R.id.time_of_showing_info)
    TextView tvTime;
    @BindView(R.id.price_of_showing_info)
    Button btnBuy;
    @BindView(R.id.unsold_seats_of_showing_info)
    TextView tvUnsold;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showings);
    }
}
