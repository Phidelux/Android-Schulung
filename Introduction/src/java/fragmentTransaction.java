@Override
public void onListItemClick(ListView l, View v, int position, long id) {
	// Fetch the FragmentManager object, ...
	FragmentManager fragmentManager = getFragmentManager();
	
	// ... instance the info fragment ...
	InfoFragment infoFrag = new InfoFragment();
	
	// ... and add the info data.
    Bundle args = new Bundle();
    args.putString(InfoFragment.INFO_DATA, this.adapter.getItem(position).toString());
    infoFrag.setArguments(args);
    
    // Finally start the transaction, ...
	FragmentTransaction fragmentTransaction = fragmentManager
			.beginTransaction();
	
	// ... replace the fragment within the releaseInfo FrameLayout, ...
	fragmentTransaction.replace(R.id.releaseInfo, infoFrag);
	
	// ... add this transaction to the backstack ...
	fragmentTransaction.addToBackStack(null);

	// ... and commit the transaction.
	fragmentTransaction.commit();
}
