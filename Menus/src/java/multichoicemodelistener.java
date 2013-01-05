ListView listView = getListView();
listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
listView.setMultiChoiceModeListener(
   new MultiChoiceModeListener() {
	   public boolean onCreateActionMode(ActionMode mode, Menu menu) {
		   MenuInflater inflater = mode.getMenuInflater();
		   inflater.inflate(R.menu.context_menu, menu);
		   return true;
	   }

	   public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
		   return false;
	   }

	   public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
		   switch (item.getItemId()) {
		   case R.id.menu_calendar:
			   mode.finish();
			   return true;
			
		   ...
		
		   default:
			   return false;
		   }
	   }

	   public void onDestroyActionMode(ActionMode mode) {}
      public void onItemCheckedStateChanged(
         ActionMode mode, int position, long id, boolean checked) {}
   }
);
