theview.setOnLongClickListener(
   new View.OnLongClickListener() {
      public boolean onLongClick(View view) {
         if (actionMode != null)
            return false;

         actionMode = getActivity().startActionMode(actionModeCallback);
         view.setSelected(true);
         return true;
      }
   }
);
