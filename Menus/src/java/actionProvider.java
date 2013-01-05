public View onCreateActionView() {
   LayoutInflater layoutInflater = LayoutInflater.from(this.context);
   View view = layoutInflater.inflate(R.layout.edittext_provider, null);
   EditText txt = (EditText) view.findViewById(R.id.my_edittext);
   txt.addTextChangedListener(
      new TextWatcher() {
         public void afterTextChanged(Editable s) {
            // Do something...
         }
      }
   );

   return view;
}
