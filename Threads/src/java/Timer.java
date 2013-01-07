public class TimerActivity extends Activity {
	// Place the attributs here!

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// Do the setup here!
	}
	
	public void onStartStopClicked(View v) {
		if(!this.isRunning) {
			// Setup the timer and task and start the scheduling.
			this.counterTimer = new Timer();
			this.counterTask = new CounterTask();
			this.counterTimer.schedule(this.counterTask, 1000, 1000);
			
			// Change the button label and the running state.
			this.startStopBtn.setText(R.string.lblStop);
			this.isRunning = true;
		} else {
			// Cancel the current task.
			this.counterTask.cancel();
			
			// Change the button label and the running state.
			this.startStopBtn.setText(R.string.lblStart);
			this.isRunning = false;
		}
	}
	
	...
}
