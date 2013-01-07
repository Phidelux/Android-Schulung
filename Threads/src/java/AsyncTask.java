public class OneDownloader extends Activity {
	...
	
	private class Downloader extends AsyncTask<URL, Integer, Long> {
		public void onPreExecute() {
			progressBar.setProgress(100, 0, false);
			progressBar.setVisibility(View.VISIBLE);
		}
		
		protected Long doInBackground(URL... urls) {
         int count = urls.length;
         long totalSize = 0;
         
         for (int i = 0; i < count; i++) {
             totalSize += Downloader.downloadFile(urls[i]);
             publishProgress((int) ((i / (float) count) * 100));
             
             if (isCancelled())
             	break;
         }
         
         return totalSize;
     }
	
		public void onProgressUpdate(String... args) {
			progressBar.setProgress(100, args[0], false);
		}

		protected void onPostExecute(Long result) {
			progressBar.setContentText("Download complete").setProgress(0, 0, false);
		}
	};
}
