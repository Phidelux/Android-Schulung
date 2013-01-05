Cursor cur = getContentResolver().query(
	UserDictionary.Words.CONTENT_URI,
	columns,
	selectionClause,
	selectionArgs,
	sorting);
