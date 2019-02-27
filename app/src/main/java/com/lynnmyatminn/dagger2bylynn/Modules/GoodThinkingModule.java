package com.lynnmyatminn.dagger2bylynn.Modules;

import com.lynnmyatminn.dagger2bylynn.Properties.GoodThinking;
import com.lynnmyatminn.dagger2bylynn.Properties.Head;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class GoodThinkingModule {

    @Binds
    abstract Head provideGoodThinking(GoodThinking goodThinking);

}
