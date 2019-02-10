package com.ryu.yehyun.wewatch.dagger;

import com.ryu.yehyun.wewatch.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/*
 * Defines Activities for injection for AndroidInjector.
 */
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract MainActivity contribuiteMainActivityInjector();
}
