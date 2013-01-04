public class HelloView extends Activity {
   private ProgressBar mProgress;

   @Override
   public void onCreate(Bundle savedInstanceState) {
      ...

      mProgress = (ProgressBar) findViewById(R.id.progress_bar);
      new Thread(new Runnable() {
         public void run() {
            for(int stat = 0; stat < 100; stat++) {
               try {
						Thread.sleep(1000);
	               mProgress.setProgress(stat);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
            }
         }
      }).start();
   }

   ...
}
