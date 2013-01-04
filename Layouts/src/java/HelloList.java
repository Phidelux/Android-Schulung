...

public class HelloActivity extends ListActivity {
	private ArrayList<String> items;
   private ArrayAdapter<String> adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		...
		
		// Initialize the item list, ...
		this.items = new ArrayList<String>(
		   Arrays.asList(new String[] {
			"Hardy Heron (8.04 LTS)", "Intrepid Ibex (8.10)",
			"Jaunty Jackalope (9.04)", "Karmic Koala (9.10)", 
         "Lucid Lynx (10.04 LTS)", "Maverick Meerkat (10.10)", 
         "Natty Narwhal (11.04)", "Oneiric Ocelot (11.10)",
			"Precise Pangolin (12.04 LTS)", "Quantal Quetzal (12.10)"}));
		
		// ... setup the array adapter ...
		this.adapter = new ArrayAdapter<String>(this,
          android.R.layout.simple_list_item_1, this.items);
		
		// ... and add some items to the list.
      setListAdapter(this.adapter);
	}

	...

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// Load the selected item ...
		String ubuntu = this.adapter.getItem(position);
		
		// ... and show a short Toast.
		Toast.makeText(this, "Selected Ubuntu version " + ubuntu + ".",
         Toast.LENGTH_LONG).show();
	}
}

