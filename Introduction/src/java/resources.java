public void onCreate(Bundle savedInstanceState) {
   // Call the parent method ...
   super.onCreate(savedInstanceState);

   // ... and set the content view.
   this.setContentView(R.layout.main);

   // Access the text view ...
   TextView moin = (TextView) this.findViewById(R.id.helloTxt);

   // ... and change the label.
   moin.setText(R.string.hello_world);
}
