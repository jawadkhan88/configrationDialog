package com.example.configrationdialog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String broadcastName = intent.getAction();

        if(broadcastName.equals("Custom_Broadcast"))
        {
            Toast.makeText(context, "This is a custom broadcast with name: " + broadcastName, Toast.LENGTH_LONG).show();
        }
        else if(broadcastName.equals("android.intent.action.AIRPLANE_MODE"))
        {
            Toast.makeText(context, "This is a system broadcast with name: " + broadcastName, Toast.LENGTH_LONG).show();
        }
        else if(broadcastName.equals("android.intent.action.BATTERY_OKAY"))
        {
            Toast.makeText(context, "This is a system broadcast for Battery with name: " + broadcastName, Toast.LENGTH_LONG).show();
        }

    }
}