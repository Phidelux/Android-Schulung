private ActionMode.Callback actionModeCallback = new ActionMode.Callback() {
	public boolean onCreateActionMode(ActionMode mode, Menu menu) {
		// Initialize the ContextMenu.
		MenuInflater inflater = mode.getMenuInflater();
		inflater.inflate(R.menu.context_menu, menu);
		return true;
	}

	public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
		// Do nothing here.
		return false;
	}

	public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_calendar:
			mode.finish();
			return true;
		case R.id.menu_share:
			mode.finish();
			return true;
			
		...
		
		default:
			return false;
		}
	}

	public void onDestroyActionMode(ActionMode mode) {
		// Do nothing!
	}
};
