// Get the notification manager.
NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

// Initialize the notification builder and assign the 
// important notification data.
Notification.Builder entryBuilder = new Notification.Builder(this)
	.setSmallIcon(R.drawable.ubuntu)
	.setContentTitle("New Ubuntu Blog-Entry")
	.setContentText("Ubuntu 12.10 - Quantal Quetzal released!")
   .setNumber(1);

// Create an explicit intent and pending intent to start the activity.
...

// Finally show the notification and pass a notification ID.
notificationManager.notify(RELEASE_NOTIFICATION, entryBuilder.build());

// Increase the number of new blog entries in a loop.
for(int num = 2; num < 7; num++) {
   // Update the notification ...
   entryBuilder.setContentText("New Blog Entry " + num)
      .setNumber(num);

   // ... and show it.
   notificationManager.notify(RELEASE_NOTIFICATION, entryBuilder.build());
}
