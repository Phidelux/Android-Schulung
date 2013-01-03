public class SmsObserver extends BroadcastReceiver {
	private Handler handler = new Handler();

	@Override
	public void onReceive(Context context, Intent intent) {
		// Defer the processing a little bit.
		handler.postDelayed(new SmsReader(context, intent), 500);
	}
}
