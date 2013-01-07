public class UbuntuFeedbackTest extends
	ActivityInstrumentationTestCase2<Feedback> {
	public static final String FEEDBACK_NAME_INITIAL = "";
	public static final String FEEDBACK_NAME_DESTROY = "Stephe Ericson";
	
	private Feedback feedbackActivity;
	private TextView feedbackName;

	public UbuntuFeedbackTest() {
		super(Feedback.class);
	}
	  
	public UbuntuFeedbackTest(Class<Feedback> activityClass) {
		super(activityClass);
	}

	@Override
	protected void setUp() throws Exception {
		// Setup the test case, ...
		super.setUp();

		// ... disable the touch mode ...
		setActivityInitialTouchMode(false);

		// ... and fetch the forced activity.
		this.feedbackActivity = getActivity();
	}
	
	public void testInstanceState() {
		// Fetch the field for the sender name ...
		this.feedbackName = (TextView) this.feedbackActivity.findViewById(net.avedo.ubuntu.releases.R.id.txtFeedbackName);
		
		// ... and check the initial state.
		assertEquals(FEEDBACK_NAME_INITIAL, feedbackName.getText().toString());
		
		// Change the text, ...
		this.feedbackActivity.runOnUiThread(new Runnable() {
			public void run() {
				feedbackName.setText(FEEDBACK_NAME_DESTROY);
			}
		});
		
		// ... stop the activity (call onDestroy method) ...
		this.feedbackActivity.finish();
		
		// ... and restart it (call onResume method).
		this.feedbackActivity = getActivity();
		
		// Fetch the field for the sender name ...
		this.feedbackName = (TextView) this.feedbackActivity.findViewById(net.avedo.ubuntu.releases.R.id.txtFeedbackName);
		
		// ... and check the initial state.
		assertEquals(FEEDBACK_NAME_DESTROY, this.feedbackName.getText().toString());
	}
}
