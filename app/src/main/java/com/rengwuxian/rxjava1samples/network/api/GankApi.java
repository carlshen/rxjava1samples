// (c)2016 Flipboard Inc, All Rights Reserved.

package com.rengwuxian.rxjava1samples.network.api;

import com.rengwuxian.rxjava1samples.model.GankBeautyResult;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface GankApi {
    @GET("data/福利/{number}/{page}")
    Observable<GankBeautyResult> getBeauties(@Path("number") int number, @Path("page") int page);
}
