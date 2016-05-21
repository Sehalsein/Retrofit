package com.sehalsein.retrofit.demo;

import java.util.List;

/**
 * Created by sehalsein on 18/05/16.
 */
public class Response {

    List<Meeting> meetings;

    public Response(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }
}
