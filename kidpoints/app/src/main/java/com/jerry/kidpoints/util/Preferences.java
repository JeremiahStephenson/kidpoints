package com.jerry.kidpoints.util;

import android.content.Context;

import com.jerry.kidpoints.R;

import java.util.Observable;

public class Preferences extends Observable {

    private static final int LOGIN_TOKEN = R.string.login_token;

    private static Preferences sPreferences;

    private Preferences() {
    }

    public static Preferences getInstance() {
        if (sPreferences == null) {
            sPreferences = new Preferences();
        }

        return sPreferences;
    }

    public static String getLoginToken(Context context) {
        return PreferencesHelper.get(LOGIN_TOKEN, null, context);
    }

    public static void setLoginToken(Context context, String token) {
        PreferencesHelper.set(LOGIN_TOKEN, token, context);

        notifyChanged(context.getString(LOGIN_TOKEN));
    }

    public static void notifyChanged(String hint) {
        getInstance().setChanged();
        getInstance().notifyObservers(hint);
    }


}