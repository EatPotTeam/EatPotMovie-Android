package com.eatpotteam.eatpotmovie.data.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Author: perqin
 * Date  : 6/7/17
 */

public class Showing {
    private String cinema;
    private long startTime, endTime;
    private int unsold;
    private int price;

    public Showing(String cinema, long startTime, long endTime, int unsold, int price) {
        this.cinema = cinema;
        this.startTime = startTime;
        this.endTime = endTime;
        this.unsold = unsold;
        this.price = price;
    }

    public String getCinema() {
        return cinema;
    }

    public String getStartTime() {
        Date date = new Date(startTime);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE", Locale.CHINA);
        return df.format(date);
    }

    public String getEndTime() {
        Date date = new Date(endTime);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE", Locale.CHINA);
        return df.format(date);
    }

    public int getUnsold() {
        return unsold;
    }

    public int getPrice() {
        return price;
    }
}
