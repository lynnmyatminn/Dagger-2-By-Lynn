package com.lynnmyatminn.dagger2bylynn.Properties;

import android.util.Log;

import javax.inject.Inject;

public class GoodThinking implements Head {

    private static final String TAG = "Human";

    @Inject
    public GoodThinking() {

    }
    
    @Override
    public void thinking() {
        Log.d(TAG, "Good thinking started.");
    }
}
