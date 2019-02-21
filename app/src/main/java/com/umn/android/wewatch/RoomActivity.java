package com.umn.android.wewatch;

import android.os.Bundle;
import android.util.Log;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class RoomActivity extends YouTubeBaseActivity {
    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

//        youTubePlayerView = findViewById(R.id.room_youtube_player);
//
//        youTubePlayerView.initialize(BuildConfig.YOUTUBE_API_KEY,
//                new YouTubePlayer.OnInitializedListener() {
//                    @Override
//                    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
//                        youTubePlayer.cueVideo("gnLZFfgNEX8");
//                    }
//
//                    @Override
//                    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
//                        Log.e("RoomActivity", "Youtube initialization failed.");
//                    }
//                });
    }
}
