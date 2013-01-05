if (null == wordCursor) {
	// If an error occurred some providers will return null.
} else if (wordCursor.getCount() < 1) {
	// The query didn't match any data.
} else {
	// Try to move to the first entry.
	if(wordCursor.moveToFirst()) {
		// Get the column indices, ...
		int idIndex = wordCursor.getColumnIndexOrThrow(UserDictionary.Words._ID);
		int wordIndex = wordCursor.getColumnIndexOrThrow(UserDictionary.Words.WORD);

		// ... and loop over all results.
		do {
			// Fetch the column values ...
			String id = wordCursor.getString(idIndex);
			String word = wordCursor.getString(wordIndex);
				
			// ... and do something with them.
		} while(wordCursor.moveToNext());
	}
}
