package com.example.sdie3.edcan_android_4;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, Service.class);
        startService(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    public void on(View v) {
        startService(new Intent(this, Service.class));
        Toast.makeText(this, "켜짐", Toast.LENGTH_SHORT).show();

    }
    public void off(View v) {
        stopService(new Intent(this, Service.class));
        Toast.makeText(this, "꺼짐", Toast.LENGTH_SHORT).show();
    }
}