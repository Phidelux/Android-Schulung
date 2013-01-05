public class UbuntuReleaseList extends ListActivity
			implements OnSharedPreferenceChangeListener {

   public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
      if (key.equals(KEY_PREF_DATETIME)) {
         // Force an update.
      }
   }
   
   @Override
	protected void onResume() {
   	super.onResume();
   	getPreferenceScreen().getSharedPreferences()
         .registerOnSharedPreferenceChangeListener(this);
	}

	@Override
	protected void onPause() {
		super.onPause();
		getPreferenceScreen().getSharedPreferences()
			.unregisterOnSharedPreferenceChangeListener(this);
	}
}
