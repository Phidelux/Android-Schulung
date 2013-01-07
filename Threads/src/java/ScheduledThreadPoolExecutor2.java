public class PoolExecutorActivity extends Activity {
	...
	
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

