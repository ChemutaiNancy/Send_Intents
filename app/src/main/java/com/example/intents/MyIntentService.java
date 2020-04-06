package com.example.intents;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public abstract class MyIntentService extends IntentService {

    private static final String TAG = "com.example.intents";
    public MyIntentService(String name) {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG, "onHandleIntent: The Service has Started");
    }
}
