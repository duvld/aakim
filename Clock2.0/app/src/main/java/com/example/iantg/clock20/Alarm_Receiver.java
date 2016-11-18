package com.example.iantg.clock20;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by iantg on 2016-11-08.
 */

public class Alarm_Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("We are in the receiver.", "Yay!");
        //create intent to ringtone service
        //Intent service_intent = new Intent(context, RingtonePlayingService.class);

        //start ringtone service
        //context.startService(service_intent);
    }
}
