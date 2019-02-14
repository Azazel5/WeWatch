package com.umn.android.wewatch.dagger;

import com.umn.android.wewatch.MainActivity;

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
