package com.example.sdie3.edcan_android_4;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by sdie3 on 2018-05-23.
 */

public class Service extends android.app.Service {
    BroadcastReceiver broadcastReceiver;
    IntentFilter intentFilter;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        broadcastReceiver = new Broadcast();
        intentFilter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        registerReceiver(broadcastReceiver, intentFilter);

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        unregisterReceiver(broadcastReceiver);
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
