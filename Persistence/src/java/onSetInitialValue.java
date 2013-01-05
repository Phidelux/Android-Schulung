public class NumberPickerPreference extends DialogPreference {
	private static int DEFAULT_VALUE = 0;

	...

	@Override
	protected void onSetInitialValue(boolean restorePersistedValue, Object defaultValue) {
		if (restorePersistedValue) {
		   value = this.getPersistedInt(DEFAULT_VALUE);
		} else {
		   value = (Integer) defaultValue;
		   persistInt(value);
		}
	}
}
