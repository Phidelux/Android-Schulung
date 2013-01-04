public class UbuntuAdapter extends BaseAdapter {
   private String[] ubuntuVersions;
	private String[] ubuntuSupport;
	private LayoutInflater inflater;
	private Resources res;
		
	public UbuntuAdapter(Context c) {
		this.res = c.getResources();
		this.inflater = (LayoutInflater) c.getSystemService(LAYOUT_INFLATER_SERVICE);
		ubuntuVersions = this.res.getStringArray(R.array.ubuntu_array);
		ubuntuSupport = this.res.getStringArray(R.array.ubuntu_support_array);
	}

	public int getCount() {
		return this.ubuntuVersions.length;
	}

	public String getItem(int position) {
		return this.ubuntuVersions[position];
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
      View row = this.inflater.inflate(R.layout.row_layout, null);

      TextView versionName = (TextView) row.findViewById(R.id.versionName);
      versionName.setText(this.ubuntuVersions[position]);
      TextView supportDate = (TextView) row.findViewById(R.id.supportDate);
      supportDate.setText(this.ubuntuSupport[position]);
            
		return row;
	}
}
