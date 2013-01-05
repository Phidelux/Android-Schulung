@Override
public boolean onCreateOptionsMenu(Menu menu) {
   ...
      
   shareProvider = (ShareActionProvider) menu.findItem(R.id.menu_share).getActionProvider();
   shareProvider.setShareHistoryFileName(ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
   shareProvider.setShareIntent(createShareIntent());
      
   ...
      
   return super.onCreateOptionsMenu(menu);
}
   
private Intent createShareIntent() {
   Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
   shareIntent.setType("text/plain");
   shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, "The Ubuntu Release List");
   return shareIntent;
}
