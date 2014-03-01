package com.jerry.kidpoints;

import android.app.Application;

import com.jerry.kidpoints.contants.Global;
import com.parse.Parse;

/**
 * Created by user on 3/1/14.
 */
public class KidPointsApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, Global.APPLICATION_ID, Global.CLIENT_KEY);

//        ParseUser.enableAutomaticUser();
//        ParseACL defaultACL = new ParseACL();
//        // Optionally enable public read access.
//        // defaultACL.setPublicReadAccess(true);
//        ParseACL.setDefaultACL(defaultACL, true);
    }

}
