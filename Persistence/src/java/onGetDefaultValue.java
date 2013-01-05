public class NumberPickerPreference extends DialogPreference {
	...
	
	@Override
	protected Object onGetDefaultValue(TypedArray a, int index) {
		return a.getInteger(index, DEFAULT_VALUE);
	}
}
