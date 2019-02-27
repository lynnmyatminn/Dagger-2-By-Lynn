package com.lynnmyatminn.dagger2bylynn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lynnmyatminn.dagger2bylynn.Components.DaggerHumanComponent;
import com.lynnmyatminn.dagger2bylynn.Components.HumanComponent;
import com.lynnmyatminn.dagger2bylynn.Properties.Human;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Human human;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HumanComponent component = DaggerHumanComponent.create();
        component.inject(this);

        human.think();
        human.speak();

    }
}
