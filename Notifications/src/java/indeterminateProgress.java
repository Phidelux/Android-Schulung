// Initialize the notification builder and assign the 
// important notification data.
Notification.Builder downloadBuilder = new Notification.Builder(this)
	.setSmallIcon(R.drawable.ubuntu)
	.setContentTitle("Download Ubuntu 12.04")
	.setContentText("Fetching download information ...")
   .setProgress(0, 0, true);

// Get the notification manager and show the notification.
NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
notificationManager.notify(DOWNLOAD_NOTIFICATION, downloadBuilder.build());
