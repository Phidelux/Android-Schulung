public class OneDownloader extends Activity {
	private Button startDownload;
	private ProgressBar progressBar;
	
	private class Downloader extends AsyncTask<URL, Integer, Long> {
		@Override
		public void onPreExecute() {
			progressBar.setProgress(100, 0, false);
			progressBar.setVisibility(View.VISIBLE);
		}
		
		@Override
		protected Long doInBackground(URL... urls) {
         int count = urls.length;
         long totalSize = 0;
         
         for (int i = 0; i < count; i++) {
             totalSize += Downloader.downloadFile(urls[i]);
             publishProgress((int) ((i / (float) count) * 100));
             
             if (isCancelled()) { 
             	break;
             }
         }
         
         return totalSize;
     }
	
		@Override
		public void onProgressUpdate(String... args){
			progressBar.setProgress(100, args[0], false);
		}

		@Override
		protected void onPostExecute(Long result) {
			progressBar.setContentText("Download complete")
				.setProgress(0, 0, false);
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// Setup the activity, ...
		...

		// ... and setup the download button.
		startDownload.setOnClickListener(
			new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					new Downloader().execute(new Url("www.example.com/a.zip"));
				}
			});
	}
}
