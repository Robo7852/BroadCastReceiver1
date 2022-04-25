package com.sarkarinaukri24.broadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    InternetConnectivity Internet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter=new IntentFilter("com.android.myBroadcastMessage");
        MyBroadCastReceiver objReceiver=new MyBroadCastReceiver();
        registerReceiver(objReceiver,intentFilter);

        Internet = new InternetConnectivity();
        registerReceiver(Internet,new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));
    }

    public void onStop(){
        super.onStop();
        unregisterReceiver(Internet);
    }
}