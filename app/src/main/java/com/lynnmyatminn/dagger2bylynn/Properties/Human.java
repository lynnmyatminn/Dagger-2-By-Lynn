package com.lynnmyatminn.dagger2bylynn.Properties;

import android.util.Log;

import javax.inject.Inject;

public class Human {

    private static final String TAG = "Human";

    private Head head;
    private Legs legs;

    @Inject
    public Human(Head head, Legs legs) {
        this.head = head;
        this.legs = legs;
    }

    @Inject
    public void enableMind(Mind mind) {
        mind.setListener(this);
    }

    public void speak() {
        Log.d(TAG, "speaking...");
    }

}
