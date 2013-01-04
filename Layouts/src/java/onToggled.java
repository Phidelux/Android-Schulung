public void onToggled(View view) {
   // Get the button state.
   boolean on = ((ToggleButton) view).isChecked();
        
   if (on) {
      Toast.makeText(this, "Sound enabled!", Toast.LENGTH_LONG).show();
   } else {
      Toast.makeText(this, "Muted!", Toast.LENGTH_LONG).show();
   }
}
