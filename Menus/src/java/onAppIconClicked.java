@Override
public boolean onOptionsItemSelected(MenuItem item) {
   switch (item.getItemId()) {
      case android.R.id.home:
         Intent intent = new Intent(this, UbuntuList.class);
         intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
         startActivity(intent);
         return true;
      default:
         return super.onOptionsItemSelected(item);
   }
}
