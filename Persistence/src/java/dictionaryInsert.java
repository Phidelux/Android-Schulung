// Setup an uri that receives the result of the insertion.
Uri insertedUri;

// Setup the object of values to be inserted ...
ContentValues insertValues = new ContentValues();
insertValues.put(UserDictionary.Words.APP_ID, "example.user");
insertValues.put(UserDictionary.Words.LOCALE, "en_US");
insertValues.put(UserDictionary.Words.WORD, "insert");
insertValues.put(UserDictionary.Words.FREQUENCY, "100");

// ... and run the insert query.
insertedUri = getContentResolver().insert(
    UserDictionary.Word.CONTENT_URI, insertValues);
