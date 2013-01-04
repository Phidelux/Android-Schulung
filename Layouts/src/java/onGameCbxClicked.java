public class HelloView extends Activity {
   ...
   
   public void onGameCbxClicked(View view) {
      // Get the checkbox state ...
      boolean checked = ((CheckBox) view).isChecked();
        
      // ... and check which checkbox was clicked.
      switch(view.getId()) {
         case R.id.cbxDiablo:
            Toast.makeText(this, "Diablo checked!", Toast.LENGTH_LONG).show();
            break;
         case R.id.cbxWow:
            Toast.makeText(this, "WOW checked!", Toast.LENGTH_LONG).show();
            break;
      }
   }
}
