package com.sehalsein.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sehalsein.retrofit.demo.Response;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ApiAdapter apiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MeetingCallback meetingCallback =  new MeetingCallback() {
            @Override
            public void onSucess(Meeting meeting) {


                for (Meeting.MeetingBean meet : meeting.getMeeting()){
                    Log.e("SHIT", ""+meet.getSubject());
                }
            }

            @Override
            public void onFail(String error) {
                Log.e("SHIT", ""+error);
            }
        };

        ResponseCallback responseCallback =new ResponseCallback() {
            @Override
            public void onSucess(Response response) {
                //adapter =new ApiAdapter(response.getMeetings())
                for (com.sehalsein.retrofit.demo.Meeting meet : response.getMeetings()){
                    
                }

            }

            @Override
            public void onFail(String error) {

            }
        };

       apiAdapter.getMeetings(meetingCallback);

        List<Person> people =  new ArrayList<>();

        people.add(new Person("Depeka","21"));
        people.add(new Person("Sehal","23"));
        people.add(new Person("De","25"));


        for (Person person : people){
            Log.e("LOG", person.getName());
        }



        //blah
    }




}
