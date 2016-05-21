package com.sehalsein.retrofit;

/**
 * Created by sehalsein on 18/05/16.
 */
public interface MeetingCallback {
    public void onSucess(Meeting meeting);

    public void onFail(String error);
}
