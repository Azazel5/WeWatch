package com.ryu.yehyun.wewatch.dagger;

import com.ryu.yehyun.wewatch.MainViewModel;
import com.ryu.yehyun.wewatch.WeWatchApplication;

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
