package com.eatpotteam.eatpotmovie.data;

import com.eatpotteam.eatpotmovie.data.entities.Cinema;
import com.eatpotteam.eatpotmovie.data.entities.Coupon;
import com.eatpotteam.eatpotmovie.data.entities.Movie;
import com.eatpotteam.eatpotmovie.data.entities.Order;
import com.eatpotteam.eatpotmovie.data.entities.OrderItem;
import com.eatpotteam.eatpotmovie.data.entities.Showing;
import com.eatpotteam.eatpotmovie.data.sources.IMoviesSource;
import com.eatpotteam.eatpotmovie.data.sources.IUserSource;
import com.eatpotteam.eatpotmovie.data.sources.MovieSource;
import com.eatpotteam.eatpotmovie.data.sources.UserSource;

import java.util.ArrayList;

import io.reactivex.Observable;

/**
 * Author: perqin
 * Date  : 6/7/17
 */

public class DataRepo implements IDataRepo {
    private static DataRepo sInstance;

    private final IUserSource mUserSource;
    private final IMoviesSource mMovieSource;

    public static DataRepo getInstance() {
        if (sInstance == null) {
            sInstance = new DataRepo();
        }
        return sInstance;
    }

    private DataRepo() {
        mUserSource = new UserSource();
        mMovieSource = new MovieSource();
    }

    @Override
    public Observable<Object> login(String email, String password) {
        return mUserSource.login(email, password);
    }

    @Override
    public Observable<Object> register(String email, String password) {
        return mUserSource.register(email, password);
    }

    @Override
    public Observable<ArrayList<Order>> getUserOrders() {
        // TODO: Implement getUserOrders
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<Order> getUserOrder(String orderId) {
        // TODO: Implement getUserOrder
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<Order> placeAnOrder(Showing showing, ArrayList<OrderItem> orderItems, ArrayList<Coupon> coupons) {
        // TODO: Implement placeAnOrder
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<Object> payForAnOrder(Order order) {
        // TODO: Implement payForAnOrder
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<ArrayList<Coupon>> getUserCoupons() {
        // TODO: Implement getUserCoupons
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<Object> checkUserHasCouponWithPrice(String price) {
        // TODO: Implement checkUserHasCouponWithPrice
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<ArrayList<Movie>> getMovies() {
        return mMovieSource.getMovies();
    }

    @Override
    public Observable<Movie> getMovie(String movieId) {
        return mMovieSource.getMovieById(movieId);
    }

    @Override
    public Observable<ArrayList<Cinema>> getCinemasOfMovie(Movie movie) {
        // TODO: Implement getCinemasOfMovie
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<ArrayList<Cinema>> getCinemas() {
        // TODO: Implement getCinemas
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<Showing> getShowing(String showingId) {
        // TODO: Implement getShowing
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public Observable<ArrayList<Showing>> getShowings() {
        // TODO: Implement getShowings
        throw new UnsupportedOperationException("Method not implemented");
    }
}
