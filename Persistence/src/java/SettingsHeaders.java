public class SettingsActivity extends PreferenceActivity {
	final static String ACTION_PREFS_GENERAL = "math.elearning.hello.list.GeneralSettings";
	final static String ACTION_PREFS_DATETIME = "math.elearning.hello.list.DatetimeSettings";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);

		 String action = getIntent().getAction();
		 if (action != null && action.equals(ACTION_PREFS_GENERAL)) {
		     addPreferencesFromResource(R.xml.preferences_general);
		 } else if(action != null && action.equals(ACTION_PREFS_DATETIME)) {
		     addPreferencesFromResource(R.xml.preferences_datetime);
		 } else if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
		     // Load the legacy preferences headers.
		     addPreferencesFromResource(R.xml.preference_headers_legacy);
		 }
	}

	@Override
	public void onBuildHeaders(List<Header> target) {
		loadHeadersFromResource(R.xml.preference_headers, target);
	}
}
