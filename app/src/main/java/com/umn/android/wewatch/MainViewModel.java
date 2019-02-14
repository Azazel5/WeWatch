package com.umn.android.wewatch;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.umn.android.wewatch.dagger.ApplicationModule;
import com.umn.android.wewatch.dagger.DaggerApplicationComponent;

import javax.inject.Inject;

public class MainViewModel extends AndroidViewModel {

    @Inject
    SharedPreferences sharedPreferences;

    public MainViewModel(@NonNull Application application) {
        super(application);

        DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(application))
                .build()
                .inject(this);
    }

}
