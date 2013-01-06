@UiThreadTest
public void testInstanceState2() {
	// Fetch the field for the sender name ...
	this.feedbackName = (TextView) this.feedbackActivity.findViewById(net.avedo.ubuntu.releases.R.id.txtFeedbackName);
	
	// ... and check the initial state.
	assertEquals(FEEDBACK_NAME_INITIAL, this.feedbackName.getText().toString());
	
	// Change the text, ...
	this.feedbackName.setText(FEEDBACK_NAME_DESTROY);
	
	// ... stop the activity (call onDestroy method) ...
	this.feedbackActivity.finish();
	
	// ... and restart it (call onResume method).
	this.feedbackActivity = getActivity();
	
	// Fetch the field for the sender name ...
	TextView nameAfterRestart = (TextView) this.feedbackActivity.findViewById(net.avedo.ubuntu.releases.R.id.txtFeedbackName);
	
	// ... and check the initial state.
	assertEquals(FEEDBACK_NAME_DESTROY, nameAfterRestart.getText().toString());
}
