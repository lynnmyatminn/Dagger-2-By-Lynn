package com.lynnmyatminn.dagger2bylynn.Components;

import com.lynnmyatminn.dagger2bylynn.Properties.Human;
import dagger.Component;

@Component
public interface HumanComponent {

    Human getHuman();

}