package com.sehalsein.retrofit;

import java.util.List;

/**
 * Created by sehalsein on 18/05/16.
 */
public class Meeting {


    /**
     * MeetingCode : 2
     * MeetingNumber : 55/BM/2015-16
     * Subject : 55th Board of Directors Meeting
     * MeetingTime : 2016-05-07T15:00:00+05:30
     * Venue : BESCOM Board Room
     * MeetingStatusCode : 2
     * SubscriptionCode : 1
     * CreatedUserCode : 10
     * MeetingStatusName : Completed
     * CreatedDateTime : 2016-05-07T10:41:52.43+05:30
     * ProjectCode : 0
     * MeetingName : 55th Board of Directors Meeting
     */

    private List<MeetingBean> Meeting;

    public List<MeetingBean> getMeeting() {
        return Meeting;
    }

    public void setMeeting(List<MeetingBean> Meeting) {
        this.Meeting = Meeting;
    }

    public static class MeetingBean {
        private String MeetingCode;
        private String MeetingNumber;
        private String Subject;
        private String MeetingTime;
        private String Venue;
        private String MeetingStatusCode;
        private String SubscriptionCode;
        private String CreatedUserCode;
        private String MeetingStatusName;
        private String CreatedDateTime;
        private String ProjectCode;
        private String MeetingName;

        public String getMeetingCode() {
            return MeetingCode;
        }

        public void setMeetingCode(String MeetingCode) {
            this.MeetingCode = MeetingCode;
        }

        public String getMeetingNumber() {
            return MeetingNumber;
        }

        public void setMeetingNumber(String MeetingNumber) {
            this.MeetingNumber = MeetingNumber;
        }

        public String getSubject() {
            return Subject;
        }

        public void setSubject(String Subject) {
            this.Subject = Subject;
        }

        public String getMeetingTime() {
            return MeetingTime;
        }

        public void setMeetingTime(String MeetingTime) {
            this.MeetingTime = MeetingTime;
        }

        public String getVenue() {
            return Venue;
        }

        public void setVenue(String Venue) {
            this.Venue = Venue;
        }

        public String getMeetingStatusCode() {
            return MeetingStatusCode;
        }

        public void setMeetingStatusCode(String MeetingStatusCode) {
            this.MeetingStatusCode = MeetingStatusCode;
        }

        public String getSubscriptionCode() {
            return SubscriptionCode;
        }

        public void setSubscriptionCode(String SubscriptionCode) {
            this.SubscriptionCode = SubscriptionCode;
        }

        public String getCreatedUserCode() {
            return CreatedUserCode;
        }

        public void setCreatedUserCode(String CreatedUserCode) {
            this.CreatedUserCode = CreatedUserCode;
        }

        public String getMeetingStatusName() {
            return MeetingStatusName;
        }

        public void setMeetingStatusName(String MeetingStatusName) {
            this.MeetingStatusName = MeetingStatusName;
        }

        public String getCreatedDateTime() {
            return CreatedDateTime;
        }

        public void setCreatedDateTime(String CreatedDateTime) {
            this.CreatedDateTime = CreatedDateTime;
        }

        public String getProjectCode() {
            return ProjectCode;
        }

        public void setProjectCode(String ProjectCode) {
            this.ProjectCode = ProjectCode;
        }

        public String getMeetingName() {
            return MeetingName;
        }

        public void setMeetingName(String MeetingName) {
            this.MeetingName = MeetingName;
        }
    }

}
