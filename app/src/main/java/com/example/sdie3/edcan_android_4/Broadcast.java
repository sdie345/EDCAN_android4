package com.example.sdie3.edcan_android_4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by sdie3 on 2018-05-23.
 */

public class Broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_SCREEN_ON.equals(intent.getAction())) {
            Toast.makeText(context, "ㅁㄴㅇㄹ", Toast.LENGTH_SHORT).show();
        }
    }
}
