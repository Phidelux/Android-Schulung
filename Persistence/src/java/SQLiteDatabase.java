try {
	// Instance the SqliteDatabaseHelper object ...
	UbuntuReleasesHelper dbHelper = new UbuntuReleasesHelper(this);

	// ... and fetch the SQLite database handle.
	SQLiteDatabase sqlite = dbHelper.getWritableDatabase();
	
	// Declare the sql statement ...
	String sql = "SELECT * FROM releases;";

	// ... and execute the query.
	Cursor sqlCursor = this.sqlite.rawQuery(sql, null);

	// Check if query has a result.
	if(sqlCursor != null) {
		// Try to move to the first entry.
		if(sqlCursor.moveToFirst()) {
			// Get the column indices, ...
			int nameIndex = sqlCursor.getColumnIndexOrThrow("name");
			int versionIndex = sqlCursor.getColumnIndexOrThrow("version");
			int releaseIndex = sqlCursor.getColumnIndexOrThrow("releasedAt");

			// ... and loop over all results.
			do {
				// Fetch the column values ...
				String name = sqlCursor.getString(nameIndex);
				String version = sqlCursor.getString(versionIndex);
				Long release = sqlCursor.getLong(releaseIndex);
				
				// ... and do something with them.
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
