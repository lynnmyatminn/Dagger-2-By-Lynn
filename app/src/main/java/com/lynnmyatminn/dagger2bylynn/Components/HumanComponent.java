package com.lynnmyatminn.dagger2bylynn.Components;

import com.lynnmyatminn.dagger2bylynn.MainActivity;
import com.lynnmyatminn.dagger2bylynn.Modules.LegsModule;
import com.lynnmyatminn.dagger2bylynn.Properties.Human;
import com.lynnmyatminn.dagger2bylynn.Properties.Legs;

import dagger.Component;

@Component (modules = LegsModule.class)
public interface HumanComponent {

    Human getHuman();

    void inject(MainActivity mainActivity);

}
