package com.lynnmyatminn.dagger2bylynn.Modules;

import com.lynnmyatminn.dagger2bylynn.Properties.BadThinking;
import com.lynnmyatminn.dagger2bylynn.Properties.Head;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class BadThinkingModule {

    @Binds
    abstract Head bindBadThinking(BadThinking badThinking);

}
