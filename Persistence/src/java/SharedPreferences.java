// Load the shared preferemces ...
SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

// ... and fetch a single entry.
String dateFormat = sharedPref.getString(SettingsActivity.DATE_FORMAT, "");
