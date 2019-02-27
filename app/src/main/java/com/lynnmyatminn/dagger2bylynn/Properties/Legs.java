package com.lynnmyatminn.dagger2bylynn.Properties;

import com.lynnmyatminn.dagger2bylynn.Properties.SubProperties.Foot;
import com.lynnmyatminn.dagger2bylynn.Properties.SubProperties.Knee;
import com.lynnmyatminn.dagger2bylynn.Properties.SubProperties.Toe;

public class Legs {

    private Knee knee;
    private Foot foot;
    private Toe toe;

    public Legs(Knee knee, Foot foot, Toe toe) {
        this.knee = knee;
        this.foot = foot;
        this.toe = toe;
    }
}
