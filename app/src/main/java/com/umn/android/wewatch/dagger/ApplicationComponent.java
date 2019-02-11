package com.umn.android.wewatch.dagger;

import com.umn.android.wewatch.MainViewModel;
import com.umn.android.wewatch.WeWatchApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/*
 * Defines modules to be injected into the Application level.
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityModule.class,
        ApplicationModule.class
})
public interface ApplicationComponent extends AndroidInjector<WeWatchApplication> {
    void inject(MainViewModel mainViewModel);
}
