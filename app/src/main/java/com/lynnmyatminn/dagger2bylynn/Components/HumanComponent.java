package com.lynnmyatminn.dagger2bylynn.Components;

import com.lynnmyatminn.dagger2bylynn.MainActivity;
import com.lynnmyatminn.dagger2bylynn.Modules.BadThinkingModule;
import com.lynnmyatminn.dagger2bylynn.Modules.LegsModule;
import com.lynnmyatminn.dagger2bylynn.Properties.Human;

import dagger.Component;

@Component (modules = {LegsModule.class, BadThinkingModule.class})
public interface HumanComponent {

    Human getHuman();

    void inject(MainActivity mainActivity);

}
