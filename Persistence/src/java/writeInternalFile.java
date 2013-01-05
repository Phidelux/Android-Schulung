// Prepare the data, ...
String data = "This is a tasty test!";

// ... open the data stream ...
FileOutputStream fos = openFileOutput("test.txt", Context.MODE_PRIVATE);

// ... and write out the data.
fos.write(data.getBytes());

// Finally close the data stream.
fos.close();
