package com.roop.AgriKissan.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.roop.AgriKissan.util.Constants;


public class SharedPreferenceHelper {

    private SharedPreferenceHelper() {

    }

    private static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(Constants.PREFS_FILE_NAME, Context.MODE_PRIVATE);
    }

    public static boolean setPreference(Context context, String key, String value) {
        SharedPreferences.Editor editor = getSharedPreference(context).edit();
        editor.putString(key, value);
        return editor.commit();
    }

    public static String getPreference(Context context, String key) {
        return getSharedPreference(context).getString(key, null);
    }

}
