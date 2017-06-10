package com.eatpotteam.eatpotmovie.showingspage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.eatpotteam.eatpotmovie.R;
import com.eatpotteam.eatpotmovie.data.entities.Showing;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Liam on 2017/6/10.
 */

public class ShowingsAdapter extends RecyclerView.Adapter<ShowingsAdapter.ViewHolder> {
    private ArrayList<Showing> mShowingList;

    @Override
    public ShowingsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_session_summary, parent, false));
    }

    public void append(ArrayList<Showing> showingList) {
        mShowingList.addAll(showingList);
        notifyItemRangeInserted(mShowingList.size() - showingList.size(), showingList.size());
    }

    @Override
    public void onBindViewHolder(ShowingsAdapter.ViewHolder holder, int position) {
        holder.tvCinema.setText(mShowingList.get(position).getCinema());
        holder.tvTime.setText(mShowingList.get(position).getStartTime() + " - " + mShowingList.get(position).getEndTime());
        holder.tvUnsold.setText(mShowingList.get(position).getUnsold());
        holder.btnBuy.setText(mShowingList.get(position).getPrice());

        holder.btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mShowingList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.cinema_of_showing_info)
        TextView tvCinema;
        @BindView(R.id.time_of_showing_info)
        TextView tvTime;
        @BindView(R.id.price_of_showing_info)
        Button btnBuy;
        @BindView(R.id.unsold_seats_of_showing_info)
        TextView tvUnsold;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
