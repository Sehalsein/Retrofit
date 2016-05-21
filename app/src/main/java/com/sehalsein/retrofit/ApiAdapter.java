package com.sehalsein.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sehalsein on 18/05/16.
 */
public class ApiAdapter {

    Retrofit retrofit;
    Api endpoints;

    public ApiAdapter() {
        retrofit=new Retrofit.Builder().baseUrl(App.URL).addConverterFactory(GsonConverterFactory.create()).build();
        endpoints=retrofit.create(Api.class);
    }

    public void getMeetings(final MeetingCallback meetingCallback){
        Call<Meeting> call=endpoints.getMeetings();
        call.enqueue(new Callback<Meeting>() {
            @Override
            public void onResponse(Call<Meeting> call, Response<Meeting> response) {


                meetingCallback.onSucess(response.body());
            }

            @Override
            public void onFailure(Call<Meeting> call, Throwable t) {
                meetingCallback.onFail(t.getMessage());
            }
        });
    }


}
