package com.sehalsein.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sehalsein on 18/05/16.
 */
public interface Api {
    @GET("meetings")
    Call<Meeting> getMeetings();

}
