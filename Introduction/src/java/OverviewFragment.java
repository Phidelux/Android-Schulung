public class OverviewFragment extends ListFragment {
	private ArrayAdapter<CharSequence> adapter;
	private Context context;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// Setup the fragment ...
		super.onCreate(savedInstanceState);
		this.context = this.getActivity().getApplicationContext();
		
		// ... and assign the setup the release list adapter.
		this.adapter = ArrayAdapter.createFromResource(this.context, R.array.ubuntu_array,
				android.R.layout.simple_list_item_1);
		this.setListAdapter(this.adapter);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_release_list, container, false);
	}
	
	@Override
	public void onPause() {
		// Nothing to save here.
		super.onPause();
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Toast.makeText(this.context, this.adapter.getItem(position), Toast.LENGTH_LONG).show();
	}
}
