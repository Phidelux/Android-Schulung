try {
	// Instance the SqliteDatabaseHelper and fetch SQLite database handle.
	UbuntuReleasesHelper dbHelper = new UbuntuReleasesHelper(this);
	SQLiteDatabase sqlite = dbHelper.getWritableDatabase();
	
	// Declare the sql statement and execute the query.
	String sql = "SELECT * FROM releases;";
	Cursor sqlCursor = this.sqlite.rawQuery(sql, null);

	// Check if query has a result.
	if(sqlCursor != null) {
		// Try to move to the first entry.
		if(sqlCursor.moveToFirst()) {
			// Get the column indices and loop over all results.
			int nameIndex = sqlCursor.getColumnIndexOrThrow("name");
			int versionIndex = sqlCursor.getColumnIndexOrThrow("version");
			int releaseIndex = sqlCursor.getColumnIndexOrThrow("releasedAt");
			
			do {
				// Fetch the column values and do something with them.
				String name = sqlCursor.getString(nameIndex);
				String version = sqlCursor.getString(versionIndex);
				Long release = sqlCursor.getLong(releaseIndex);
			} while(sqlCursor.moveToNext());
		}
	}
} catch(Exception e) {
	e.printStackTrace();
} finally {
	if(sqlite != null)
		sqlite.close();
	if(sqlCursor != null)
		sqlCursor.close();
}
