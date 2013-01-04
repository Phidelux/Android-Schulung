@Override
protected void onListItemClick(ListView l, View v, int position, long id) {
   LayoutInflater inflater = getLayoutInflater();
   View layout = inflater.inflate(R.layout.toast_layout, null);

   TextView ubuntuName = (TextView) layout.findViewById(R.id.toastUbuntuName);
   ubuntuName.setText(this.adapter.getItem(position));

   Toast toast = new Toast(this);
   toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL, 0, 0);
   toast.setDuration(Toast.LENGTH_LONG);
   toast.setView(layout);
   toast.show();
}
