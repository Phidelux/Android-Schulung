public void onSyncClicked(View v) {
   new Thread(
      new Runnable() {
         public void run() {
            final Drawable pic = fetchOneImage(resourcePath, localPath);
            iview.post(
               new Runnable() {
                  public void run() {
                     iview.setDrawable(pic);
                  }
               }
            );
         }
      }
   ).start();
}
