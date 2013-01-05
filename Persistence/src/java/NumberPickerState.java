private static class NumberPickerState extends BaseNumberPickerState {
   int value;

   public NumberPickerState(Parcelable superState) {
      super(superState);
   }

   public NumberPickerState(Parcel source) {
      super(source);
      value = source.readInt();
   }

   @Override
   public void writeToParcel(Parcel dest, int flags) {
      super.writeToParcel(dest, flags);
      dest.writeInt(value);
   }

   // Standard creator object.
   public static final Parcelable.Creator<NumberPickerState> CREATOR =
         new Parcelable.Creator<NumberPickerState>() {

      public NumberPickerState createFromParcel(Parcel in) {
         return new NumberPickerState(in);
      }

      public NumberPickerState[] newArray(int size) {
         return new NumberPickerState[size];
      }
   };
}
