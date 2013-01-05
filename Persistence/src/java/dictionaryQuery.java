// Declare the columns that should be selected, ...
String[] columns = {
	UserDictionary.Words._ID,
	UserDictionary.Words.WORD
};

// ... setup the selection clause ...
String selectionClause = null;

// ... and initialize the selection arguments.
String[] selectionArgs = {""};

// Declare the sort order ...
String sortOrder = UserDictionary.Words.WORD + " ASC";

// ... and fetch the userinput from a EditText field.
searchString = searchTxt.getText().toString();

// An empty input selects all rows of the table.
if (TextUtils.isEmpty(searchString)) {
    // Nothing to do here. Everything should be selected.
} else {
    // Setup the selection clause ...
    selectionClause = UserDictionary.Words.WORD + " = ?";

    // ... and place the user input in the selection arguments array.
    selectionArgs[0] = searchString;
}

// Finally query the word cursor.
wordCursor = getContentResolver().query(
    UserDictionary.Words.CONTENT_URI, columns,
    selectionClause, selectionArgs, sortOrder);
