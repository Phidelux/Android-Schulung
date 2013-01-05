// Setup the selection clause and arguments ...
String selectionClause = UserDictionary.Words.LOCALE +  "LIKE ?";
String[] selectionArgs = {"en_%"};

// ... and initialize the number of affected rows.
int affectedRows = 0;

// Setup the object of values to be updated ...
ContentValues updateValues = new ContentValues();
updateValues.put(UserDictionary.Words.LOCALE, "en_US");
updateValues.putNull(UserDictionary.Words.FREQUENCY);

// ... and run the update query.
affectedRows = getContentResolver().update(
	UserDictionary.Words.CONTENT_URI, updateValues,
	selectionClause, selectionArgs);
