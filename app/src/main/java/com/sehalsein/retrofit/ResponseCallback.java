package com.sehalsein.retrofit;

import com.sehalsein.retrofit.demo.Response;

/**
 * Created by sehalsein on 18/05/16.
 */
public interface ResponseCallback {
    public void onSucess(Response response);

    public void onFail(String error);
}
