public class PoolExecutorActivity extends Activity {
	// Place the attributs here!

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Do the setup here!
	}
	
	public void onStartStopClicked(View v) {
		if(!this.isRunning) {
			// Setup the timer and task and start the scheduling.
			this.counterTimer = new ScheduledThreadPoolExecutor(1);
			this.counterTimer.scheduleAtFixedRate(this.counterTask, 1000, 1000, TimeUnit.MILLISECONDS);
			
			// Change the button label and the running state.
			this.startStopBtn.setText(R.string.lblStop);
			this.isRunning = true;
		} else {
			// Cancel the current task.
			this.counterTimer.shutdownNow();
			
			// Change the button label and the running state.
			this.startStopBtn.setText(R.string.lblStart);
			this.isRunning = false;
		}
	}
	
	public void onResetClicked(View v) {
		// Make a toast ...
		Toast.makeText(this, "Canceled timer!", Toast.LENGTH_SHORT).show();
		
		// ... and cancel the task and timer.
		if(this.counterTimer != null) {
			this.counterTimer.shutdownNow();
		}
		
		// Reset the labels, counter and the running flag.
		this.counterTxt.setText(R.string.lblCounterStart);
		this.startStopBtn.setText(R.string.lblStart);
		this.isRunning = false;
		this.counter = 0;
	}
	
	private Runnable counterTask = new Runnable() {
		@Override
		public void run() {
			counterTxt.post(
					new Runnable() {
						public void run() {
							counter++;
							counterTxt.setText(String.format("%08d", counter));
						}
					}
				);
		}
	};
}

