// Initialize the notification builder and assign the 
// important notification data.
Notification.Builder releaseBuilder = new Notification.Builder(this)
	.setSmallIcon(R.drawable.ubuntu)
	.setContentTitle("New Ubuntu Release")
	.setContentText("Ubuntu 12.10 - Quantal Quetzal released!");

// Create an explicit intent to start the Ubuntu Release List activity.
Intent ubuntuIntent = new Intent(this, HelloList.class);

// Setup the pending intent to start the Ubuntu Release List activity.
PendingIntent pendingIntent = PendingIntent.getActivity(
		this, 0, ubuntuIntent, PendingIntent.FLAG_UPDATE_CURRENT);
releaseBuilder.setContentIntent(pendingIntent);

// Get the notification manager and show the notification.
NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
notificationManager.notify(RELEASE_NOTIFICATION, releaseBuilder.build());
