package com.lynnmyatminn.dagger2bylynn.Modules;

import com.lynnmyatminn.dagger2bylynn.Properties.Legs;
import com.lynnmyatminn.dagger2bylynn.Properties.SubProperties.Foot;
import com.lynnmyatminn.dagger2bylynn.Properties.SubProperties.Knee;
import com.lynnmyatminn.dagger2bylynn.Properties.SubProperties.Toe;

import dagger.Module;
import dagger.Provides;

@Module
public class LegsModule {

    @Provides
    static Knee provideKnee() {
        return new Knee();
    }

    @Provides
    static Foot provideFoot() {
        return new Foot();
    }

    @Provides
    static Toe provideToe() {
        Toe toe = new Toe();
        toe.inflate();
        return toe;
    }

    @Provides
    static Legs provideLegs(Knee knee, Foot foot, Toe toe) {
        return new Legs(knee, foot, toe);
    }

}
