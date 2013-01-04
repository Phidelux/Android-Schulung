public class EmailService extends Service {
   private Looper mServiceLooper;
   private ServiceHandler mServiceHandler;

   @Override
   public void onCreate() {
      HandlerThread thread = new HandlerThread("ServiceStartArguments",1);
      thread.start();
      mServiceLooper = thread.getLooper();
      mServiceHandler = new ServiceHandler(mServiceLooper);
   }

   // Handler that receives messages from the thread
   private final class ServiceHandler extends Handler {
      public ServiceHandler(Looper looper) {
         super(looper);
      }

      @Override
      public void handleMessage(Message msg) {
         // Do your operations.         

         // Fetch an instance of the notification manager.
         NotificationManager nm = (NotificationManager) context.getSystemService(
            Context.NOTIFICATION_SERVICE
         );

         // Initialize an intent to launch the email list ...
         Intent emailListIntent = new Intent(context, EmailList.class);

         // ... and get PendingIntent to launch the activity if user selects the notification.
         PendingIntent pIntent = PendingIntent.getActivity(context, null,
            emailListIntent, PendingIntent.FLAG_CANCEL_CURRENT);

         // Construct the Notification object, ...
         Notification notif = new Notification(R.drawable.icon, R.string.newEmails,
            System.currentTimeMillis());

         // ... set the notification sound and light ...
         notif.defaults |= Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE;
         notif.flags |= Notification.FLAG_SHOW_LIGHTS | Notification.FLAG_AUTO_CANCEL
                  | Notification.FLAG_ONLY_ALERT_ONCE;

         // ... and finally fire the notification
         nm.notify(R.string.incomingMessageTickerText, notif);
      }
   }

   ...
}
