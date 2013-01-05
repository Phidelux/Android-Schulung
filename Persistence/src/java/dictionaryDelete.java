// Setup the selection clause and arguments ...
String selectionClause = UserDictionary.Words.LOCALE + " LIKE ?";
String[] selectionArgs = {"en_%"};

// ... and initialize the number of affected rows.
int affectedRows = 0;

// Finally run the delete query.
affectedRows = getContentResolver().delete(
	UserDictionary.Words.CONTENT_URI, selectionClause, selectionArgs);
