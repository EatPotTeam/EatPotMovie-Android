package com.eatpotteam.eatpotmovie.data;

import com.eatpotteam.eatpotmovie.data.entities.Cinema;
import com.eatpotteam.eatpotmovie.data.entities.Coupon;
import com.eatpotteam.eatpotmovie.data.entities.Movie;
import com.eatpotteam.eatpotmovie.data.entities.Order;
import com.eatpotteam.eatpotmovie.data.entities.OrderItem;
import com.eatpotteam.eatpotmovie.data.entities.Showing;

import java.util.ArrayList;

import io.reactivex.Observable;

/**
 * Author: perqin
 * Date  : 6/7/17
 *
 * App global repository for data layer access.
 */
public interface IDataRepo {
    Observable<Object> login(String email, String password);

    Observable<Object> register(String email, String password);

    Observable<ArrayList<Order>> getUserOrders();

    Observable<Order> getUserOrder(String orderId);

    Observable<Order> placeAnOrder(Showing showing, ArrayList<OrderItem> orderItems, ArrayList<Coupon> coupons);

    Observable<Object> payForAnOrder(Order order);

    Observable<ArrayList<Coupon>> getUserCoupons();

    Observable<Object> checkUserHasCouponWithPrice(String price);

    Observable<ArrayList<Movie>> getMovies();

    Observable<Movie> getMovie(String movieId);

    Observable<ArrayList<Cinema>> getCinemasOfMovie(Movie movie);

    Observable<ArrayList<Cinema>> getCinemas();

    Observable<Showing> getShowing(String showingId);

    /**
     * NOTE: Not sure.
     * @return :)
     */
    Observable<ArrayList<Showing>> getShowings();
}
