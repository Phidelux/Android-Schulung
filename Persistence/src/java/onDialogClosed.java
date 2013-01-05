public class NumberPickerPreference extends DialogPreference {
	private Integer value; 

	...

   @Override
	protected void onDialogClosed(boolean positiveResult) {
		if (positiveResult) {
		   persistInt(value);
		}
	}
}
