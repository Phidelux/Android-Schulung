public class HelloView extends Activity {
    private Chronometer chron;
    private Button startStop;
    private boolean isChronRunnig  = false;
    private long elapsed = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_hello_view);

		// Fetch the chronometer.
		chron = (Chronometer) this.findViewById(R.id.chronometer);

		// Load the start/stop button.
		startStop = (Button) this.findViewById(R.id.startStopwatch);
    }

	public void onStartStop(View v) {
		if (!isChronRunnig) {
			chron.setBase(SystemClock.elapsedRealtime() - elapsed);
			isChronRunnig = true;
			startStop.setText("Stop");
			chron.start();
		} else {
			elapsed = SystemClock.elapsedRealtime() - chron.getBase();
			isChronRunnig = false;
			startStop.setText("Start");
			chron.stop();
		}
	}

	public void onReset(View v) {
		elapsed = 0;
		isChronRunnig = false;
		chron.stop();
		chron.setText("00:00");
		startStop.setText("Start");
	}
}
