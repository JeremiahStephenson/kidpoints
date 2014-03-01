package com.jerry.kidpoints.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class PreferencesHelper {
    private static final String sSynchronizer = "synchronizer";

    private static SharedPreferences getSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static Editor getSharedPreferencesEditor(Context context) {
        return getSharedPreferences(context).edit();
    }

    public static void set(int keyId, String value, Context context) {
        synchronized (sSynchronizer) {
            getSharedPreferencesEditor(context).putString(context.getString(keyId), value).commit();
        }
    }

    public static String get(int keyId, String defaultValue, Context context) {
        SharedPreferences prefs = getSharedPreferences(context);
        return prefs.getString(context.getString(keyId), defaultValue);
    }

    public static void set(int keyId, int value, Context context) {
        synchronized (sSynchronizer) {
            getSharedPreferencesEditor(context).putInt(context.getString(keyId), value).commit();
        }
    }

    public static int get(int keyId, int defaultValue, Context context) {
        SharedPreferences prefs = getSharedPreferences(context);
        return prefs.getInt(context.getString(keyId), defaultValue);
    }

    public static void set(int keyId, boolean value, Context context) {
        synchronized (sSynchronizer) {
            getSharedPreferencesEditor(context).putBoolean(context.getString(keyId), value).commit();
        }
    }

    public static boolean get(int keyId, boolean defaultValue, Context context) {
        SharedPreferences prefs = getSharedPreferences(context);
        return prefs.getBoolean(context.getString(keyId), defaultValue);
    }

    public static void set(int keyId, float value, Context context) {
        synchronized (sSynchronizer) {
            getSharedPreferencesEditor(context).putFloat(context.getString(keyId), value).commit();
        }
    }

    public static float get(int keyId, float defaultValue, Context context) {
        SharedPreferences prefs = getSharedPreferences(context);
        return prefs.getFloat(context.getString(keyId), defaultValue);
    }

    public static void set(int keyId, long value, Context context) {
        synchronized (sSynchronizer) {
            getSharedPreferencesEditor(context).putLong(context.getString(keyId), value).commit();
        }
    }

    public static long get(int keyId, long defaultValue, Context context) {
        SharedPreferences prefs = getSharedPreferences(context);
        return prefs.getLong(context.getString(keyId), defaultValue);
    }

    public static void unset(int keyId, Context context) {
        synchronized (sSynchronizer) {
            getSharedPreferencesEditor(context).remove(context.getString(keyId)).commit();
        }
    }

    public static boolean keyExists(int keyId, Context context) {
        SharedPreferences prefs = getSharedPreferences(context);
        return prefs.contains(context.getString(keyId));
    }
}