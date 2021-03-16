package com.musayilmaz.parselearning;

import android.app.Application;

import com.parse.Parse;

public class ParsStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //set log level
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("k6stDgytOs36wSNrlNTXqQQy9XNkAWn2Cqf9aOCo")
                .clientKey("XTVieaI19nVbLcPuGuhhvHkaPea3B8kTwUyW1ajU")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
