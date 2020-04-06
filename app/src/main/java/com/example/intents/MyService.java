package com.example.intents;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "com.example.intents";
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand: The service has started");

        //creating thread
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<5; i++){
                    Long futuretime = System.currentTimeMillis()+5000;
                    while (System.currentTimeMillis() < futuretime){
                        synchronized (this){
                            try{
                                wait(futuretime - System.currentTimeMillis());
                                Log.i(TAG, "run: Service is running");
                            }catch (Exception e){

                            }
                        }
                    }
                }
            }
        };
        Thread mythread = new Thread(r);
        mythread.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy: The message has been destroyed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return null;
    }
}
