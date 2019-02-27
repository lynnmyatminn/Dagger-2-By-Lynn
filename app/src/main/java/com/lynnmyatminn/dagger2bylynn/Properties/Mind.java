package com.lynnmyatminn.dagger2bylynn.Properties;

import android.util.Log;

import javax.inject.Inject;

public class Mind {

    private static final String TAG = "Human";

    @Inject
    public Mind() {
    }

    public void setListener(Human human) {
        Log.d(TAG, "Mind connected.");
    }

}
