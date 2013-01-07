public class Downloader extends Activity {
	private Button startDownload;
	private ProgressBar progressBar;
	private final Handler handler = new Handler();

	public void onCreate(Bundle savedInstanceState) {
		// Setup the activity, ...
		super.onCreate(savedInstanceState);
		setContentView(R.layout.downloader_activity);

		// ... fetch the progressbar and setup the download button.
		progressBar = (ProgressBar) findViewById(R.id.progressBar);
		startDownload = (Button) findViewById(R.id.startDownload);
		startDownload.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					progressBar.setProgress(0);
					progressBar.setVisibility(View.VISIBLE);
					
					Thread downloadThread = new Thread(
						new Runnable() {
							int size = getPackageSize();
							int currentSize = 0;
							while(true) {
				 				handler.post(new Runnable() {
				 						int currentSize += getChunkSize();
				 						progressBar.setProgress(size / currentSize);
				 					});
				 			}
						});
				}
			});
	}
}
