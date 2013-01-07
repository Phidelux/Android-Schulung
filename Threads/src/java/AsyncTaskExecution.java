public class OneDownloader extends Activity {

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
	
	...
}
