// Declare the column to select from the cursor ...
String[] columns = {UserDictionary.Words.WORD};

// ... and the views that should be used to display the data.
int[] viewIds = { R.id.dictWord};

// Finally setup a new SimpleCursorAdapter ...
SimpleCursorAdapter wordAdapter = new SimpleCursorAdapter(
    getApplicationContext(), R.layout.wordlistrow,
    wordCursor, columns, viewIds, 0);

// ... and assign this adapter to the ListView.
wordList.setAdapter(wordAdapter);
