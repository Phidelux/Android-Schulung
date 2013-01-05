public class NumberPickerPreference extends DialogPreference {
	...

	@Override
	protected Parcelable onSaveInstanceState() {
		final Parcelable superState = super.onSaveInstanceState();
		
		// Skip if preference is not persisted.
		if (isPersistent()) return superState;

		// Otherwise setup the instance of the custom NumberPickerState.
		myState.value = value;
		
		return new NumberPickerState(superState);
	}

	@Override
	protected void onRestoreInstanceState(Parcelable state) {
		// Load state of superclass if state was not saved.
		if (state == null || !state.getClass().equals(SavedState.class)) {
		   super.onRestoreInstanceState(state);
		   return;
		}

		// Pass the state to the super class and update the local value.
		NumberPickerState myState = (NumberPickerState) state;
		super.onRestoreInstanceState(myState.getSuperState());
		value = myState.value;
	}
}
