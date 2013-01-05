public class NumberPickerPreference extends DialogPreference {
   public NumberPickerPreference(Context context, AttributeSet attrs) {
      super(context, attrs);
      
      setDialogLayoutResource(R.layout.numberpicker_dialog);
      setPositiveButtonText(android.R.string.ok);
      setNegativeButtonText(android.R.string.cancel);
      
      setDialogIcon(null);
   }
   
   ...
}
