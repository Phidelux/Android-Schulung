public class HelloView extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
      ...
      
		Spinner spinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
         this, R.array.games_array, android.R.layout.simple_spinner_item);
		spinner.setAdapter(adapter);
   }

   ...
}
