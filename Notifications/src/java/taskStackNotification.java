Notification.Builder releaseBuilder = new Notification.Builder(this)
   .setSmallIcon(R.drawable.ubuntu)
   .setContentTitle("New Ubuntu Release")
   .setContentText("Ubuntu 12.10 - Quantal Quetzal released!");
			
// Create an explicit intent to start the Ubuntu Release List activity.
Intent ubuntuIntent = new Intent(this, HelloList.class);

// Setup the back stack for the activity used by back navigation.
TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
stackBuilder.addParentStack(HelloList.class);
stackBuilder.addNextIntent(ubuntuIntent);

// Setup the pending intent to start the Ubuntu Release List activity.
PendingIntent pendingIntent = stackBuilder.getPendingIntent(
	0, PendingIntent.FLAG_UPDATE_CURRENT);
releaseBuilder.setContentIntent(pendingIntent);
			
// Get the notification manager and show the notification.
NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
notificationManager.notify(RELEASE_NOTIFICATION, releaseBuilder.build());
