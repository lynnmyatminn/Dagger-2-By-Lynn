package com.lynnmyatminn.dagger2bylynn.Properties;

import android.util.Log;

import javax.inject.Inject;

public class BadThinking implements Head {

    private static final String TAG = "Human";

    @Inject
    public BadThinking() {

    }

    @Override
    public void thinking() {
        Log.d(TAG, "Bad thinking started.");
    }
}
