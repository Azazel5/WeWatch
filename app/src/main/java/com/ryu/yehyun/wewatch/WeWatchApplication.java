package com.ryu.yehyun.wewatch;

import android.app.Activity;
import android.app.Application;

import com.ryu.yehyun.wewatch.dagger.ApplicationModule;
import com.ryu.yehyun.wewatch.dagger.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/*
 * DAGGER2
 *
 * Activity: Calls AndroidInjection.inject() and gets a DispatchingAndroidInjector from Application
 * and passes that activity to inject(Activity).
 *
 * Application: DispatchingAndroidInjector looks up the AndroidInjector.Factory for activity’s
 * class through ActivityModule. Then it creates AndroidInjector, and passes activity to
 * inject(Activity).
 */
public class WeWatchApplication extends Application implements HasActivityInjector {
    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
