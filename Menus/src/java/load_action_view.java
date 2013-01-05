@Override
public boolean onCreateOptionsMenu(Menu menu) {
   // Inflate the menu declaration ...
   getMenuInflater().inflate(R.menu.options, menu);

   // ... and load the search view.
   SearchView searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();

   return super.onCreateOptionsMenu(menu);
}
