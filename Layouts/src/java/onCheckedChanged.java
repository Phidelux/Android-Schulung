@Override
public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
   Toast.makeText(this, "Sound is " + (isChecked ? "on" : "off"), Toast.LENGTH_SHORT).show();
}
