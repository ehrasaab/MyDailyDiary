package com.example.note;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateNotificationActivity extends Activity {
	@Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.notification);
	  }

	  public void createNotification(View view) {
	    // Prepare intent which is triggered if the
	    // notification is selected
	    Intent intent = new Intent(this, NotificationReceiverActivity.class);
	    PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent, 0);

	    // Build notification
	    // Actions are just fake
	    Notification.Builder noti =
	    	    new Notification.Builder(this)
	    	    .setSmallIcon(R.drawable.icon)
	    	    .setContentTitle("My Daily Diary")
	    	    .setContentText("How was your day? Write your experience now!");
	    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
	    // hide the notification after its selected
	    noti.getNotification().flags |= Notification.FLAG_AUTO_CANCEL;

	    notificationManager.notify(0, noti.build());

	  }
	} 