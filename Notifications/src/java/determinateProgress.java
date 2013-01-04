// Initialize the notification builder and assign the 
// important notification data.
final Notification.Builder downloadBuilder = new Notification.Builder(this)
	.setSmallIcon(R.drawable.ubuntu)
	.setContentTitle("Download Ubuntu 12.04")
	.setContentText("Downloading ...");

// Get the notification manager and show the notification.
final NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

new Thread(new Runnable() {
   public void run() {
      for(int stat = 0; stat < 100; stat++) {
         try {
            downloadBuilder.setProgress(100, stat, false);
            notificationManager.notify(DOWNLOAD_NOTIFICATION, downloadBuilder.build());
            Thread.sleep(5000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

      // When the download finished, update the notification.
      downloadBuilder.setContentText("Download complete")
         .setProgress(0, 0, false);
      notificationManager.notify(DOWNLOAD_NOTIFICATION, downloadBuilder.build());
   }
}).start();
