public static class SettingsFragment extends PreferenceFragment {
	@Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.preferences);
   }
}
