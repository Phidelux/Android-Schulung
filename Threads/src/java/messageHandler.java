public class Downloader extends Activity {
	private Button startDownload;
	private ProgressBar progressBar;

	private final Handler handler = new Handler();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// Setup the activity, ...
		super.onCreate(savedInstanceState);
		setContentView(R.layout.downloader_activity);

		// ... fetch the progressbar ...
		progressBar = (ProgressBar) findViewById(R.id.progressBar);

		// ... and setup the download button.
		startDownload = (Button) findViewById(R.id.startDownload);
		startDownload.setOnClickListener(
			new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					progressBar.setProgress(0);
					progressBar.setVisibility(View.VISIBLE);
					handler.post(run);
					
					Thread downloadThread = new Thread(
						new Runnable() {
							int size = getPackageSize();
							while(true) {
				 				handler.post(
				 					new Runnable() {
				 						int chunkSize = getChunkSize();
				 						progressBar.setProgress(size / chunkSize);
				 					});
				 			}
						});
				}
			});
	}
}
