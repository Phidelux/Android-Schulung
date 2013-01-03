// Fetch the layout inflater ...
this.inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

// ... and inflate the layout.
View main = this.inflater.inflate(R.layout.row_layout, null);

// Load the ImageView and assign the icon.
ImageView icon = (ImageView) main.findViewById(R.id.icon);
icon.setImageResource(R.drawable.my_icon);

// Load the TextView and assign the content.
TextView subject = (TextView) main.findViewById(R.id.subject);
subject.setText("Hello Bob");
