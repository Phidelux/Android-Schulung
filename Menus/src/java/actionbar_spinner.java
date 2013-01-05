@Override
public boolean onCreateOptionsMenu(Menu menu) {
	MenuInflater inflater = getMenuInflater();
	inflater.inflate(R.menu.ubuntu_menu, menu);
	
	ActionBar actionBar = getActionBar();
	actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
	actionBar.setListNavigationCallbacks(
		ArrayAdapter.createFromResource(
			this, R.array.ubuntu_selections, R.layout.spinner_dropdown_item), 
		new ActionBar.OnNavigationListener() {
			public boolean onNavigationItemSelected(int itemPosition, long itemId) {
				// Do something crazy here!
				return false;
			}
		}
	);
		
	return true;
}
