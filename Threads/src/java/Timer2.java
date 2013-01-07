public class TimerActivity extends Activity {
	...
	
	public void onResetClicked(View v) {
		// Make a toast ...
		Toast.makeText(this, "Canceled timer!", Toast.LENGTH_SHORT).show();
		
		// ... and cancel the task and timer.
		if(this.counterTask != null)
			this.counterTask.cancel();
		if(this.counterTimer != null)
			this.counterTimer.cancel();
		
		// Reset the labels, counter and the running flag.
		this.counterTxt.setText(R.string.lblCounterStart);
		this.startStopBtn.setText(R.string.lblStart);
		this.isRunning = false;
		this.counter = 0;
	}
	
	class CounterTask extends TimerTask {
		@Override
		public void run() {
			counterTxt.post(new Runnable() {
					public void run() {
						counter++;
						counterTxt.setText(String.format("%08d", counter));
					}
				});
		}
	}
}
