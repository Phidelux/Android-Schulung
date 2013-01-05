@Override
public boolean onContextItemSelected(MenuItem item) {
   // Fetch the view item info ...
   AdapterContextMenuInfo info = (AdapterContextMenuInfo) item.getMenuInfo();

	// ... and handle the item selection.
	Toast.makeText(this, "Selected " + item.getTitle() + " for " + info.id, 
      Toast.LENGTH_LONG).show();
}
