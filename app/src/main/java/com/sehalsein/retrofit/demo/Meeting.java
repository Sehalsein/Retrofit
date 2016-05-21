package com.sehalsein.retrofit.demo;

/**
 * Created by sehalsein on 18/05/16.
 */
public class Meeting {

    private String name, subject;

    public Meeting(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public Meeting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
