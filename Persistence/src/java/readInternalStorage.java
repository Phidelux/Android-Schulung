// Prepare the data, ...
String data = "";

// ... setup the string buffer ...
byte[] buffer = new byte[4096];

// ... open the data stream ...
FileInputStream fis = openFileInput("test.txt");

// ... and read in all data.
int block = in.read(buffer, 0, buffer.length);

while(block >= 0) {
	data += new String(buffer);
	block = in.read(buffer, 0, buffer.length);
}

// Finally close the data stream.
fis.close();
