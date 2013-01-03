public class TheService extends Service {
	MediaPlayer player;
	
	@Override
	public IBinder onBind(Intent intent) {
		return null; // No binding needed.
	}
	
	@Override
	public void onCreate() {
		Toast.makeText(this, "The Service started", Toast.LENGTH_LONG).show();
		
		player = MediaPlayer.create(this, R.raw.braincandy);
		player.setLooping(false); // Set looping
	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "The Service stopped", Toast.LENGTH_LONG).show();
		player.stop();
	}
	
	@Override
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "The Service started", Toast.LENGTH_LONG).show();
		player.start();
	}
}
