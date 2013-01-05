// Setup the available and writeable flag ...
boolean extAvailable = false;
boolean extWriteable = false;

// ... and fetch the state of the external storage.
String state = Environment.getExternalStorageState();

if (Environment.MEDIA_MOUNTED.equals(state)) {
    // The external storage is available and writeable.
    extAvailable = extWriteable = true;
} else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
    // The external storage is available but only readable.
    extAvailable = true;
    extWriteable = false;
} else {
    // The external storage is not available.
    extAvailable = extWriteable = false;
}
