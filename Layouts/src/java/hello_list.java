public class HelloList extends ListActivity {
	private ArrayAdapter<CharSequence> adapter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_list);

      // Setup the adapter ...
		adapter = ArrayAdapter.createFromResource(this, R.array.ubuntu_array,
				android.R.layout.simple_list_item_1);

      // ... and assign it to the listview.
		this.setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// Load the selected item ...
		String ubuntu = (String) this.adapter.getItem(position);

		// ... and show a short Toast.
		Toast.makeText(this, "Selected " + ubuntu + ".",
				Toast.LENGTH_LONG).show();
	}
}
