package com.sarkarinaukri24.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class InternetConnectivity extends BroadcastReceiver {
    @Override
        public void onReceive(Context context, Intent intent) {
            // TODO: This method is called when the BroadcastReceiver is receiving
            // an Intent broadcast.
            //Log.i("BroadcastReceiver","Broadcast message is received");

            Toast.makeText(context, "Airoplane Mode is on", Toast.LENGTH_SHORT).show();
        }

}
