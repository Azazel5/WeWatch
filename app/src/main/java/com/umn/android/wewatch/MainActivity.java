package com.umn.android.wewatch;

import androidx.lifecycle.ViewModelProviders;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Perform injection from WeWatchApplication.
        AndroidInjection.inject(this);

        // Set theme and layout.
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get MainViewModel.
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    }
}
