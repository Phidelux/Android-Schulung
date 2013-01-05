// Setup the lookup URI ...
Uri lookUp = ContentUris.withAppendedId(UserDictionary.Words.CONTENT_URI, 13);

// ... and initialize the number of affected rows.
int affectedRows = 0;

// Finally run the delete query.
affectedRows = getContentResolver().delete(
	lookUp, null, new String[] {""});
