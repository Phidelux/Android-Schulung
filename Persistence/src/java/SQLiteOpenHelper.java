public class UbuntuReleasesHelper extends SQLiteOpenHelper {
	public static final String DATABASE_NAME = "ubuntu.releases";
	public static final int DATABASE_VERSION = 2;
	public static final int FIRST_UPDATE_VERSION = 2;
	private Context context;

	public SqliteDatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		this.context = context;
	}

	@Override
	public void onCreate(SQLiteDatabase sqlite) {
		sqlite.execSQL(
			"CREATE TABLE IF NOT EXISTS releases ("
         + "_ID INTEGER PRIMARY KEY ASC, "
         + "name VARCHAR(160), version VARCHAR(10),"
         + "releasedAt INTEGER, supportedUntil INTEGER,"
         + "description TEXT, logo VARCHAR(160) NOT NULL DEFAULT 'ubuntu.jpg'"
         + ");"
      );
	}

	@Override
	public void onUpgrade(SQLiteDatabase sqlite, int oldVersion, int newVersion) {
		if(newVersion == FIRST_UPDATE_VERSION) {
			// Add a new column in database version 2.
			sqlite.execSQL(
				"ALTER TABLE releases ADD COLUMN "
				+ "logo VARCHAR(160) NOT NULL DEFAULT 'ubuntu.jpg';"
			);
		}
	}
}
