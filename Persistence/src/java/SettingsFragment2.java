public static class SettingsFragment extends PreferenceFragment {
	@Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      String settings = getArguments().getString("settings");
      
      if ("general".equals(settings)) {
         addPreferencesFromResource(R.xml.preferences_general);
      } else if ("datetime".equals(settings)) {
         addPreferencesFromResource(R.xml.preferences_datetime);
      }
   }
}
