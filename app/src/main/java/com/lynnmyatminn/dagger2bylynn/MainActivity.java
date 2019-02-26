package com.lynnmyatminn.dagger2bylynn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lynnmyatminn.dagger2bylynn.Components.DaggerHumanComponent;
import com.lynnmyatminn.dagger2bylynn.Components.HumanComponent;
import com.lynnmyatminn.dagger2bylynn.Properties.Human;

public class MainActivity extends AppCompatActivity {

    private Human human;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HumanComponent component = DaggerHumanComponent.create();

        human = component.getHuman();
        human.speak();

    }
}
