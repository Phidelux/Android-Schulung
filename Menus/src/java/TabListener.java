public static class TabListener<T extends Fragment> implements ActionBar.TabListener {
   private Fragment fragment;
   private final Activity activity;
   private final String tag;
   private final Class<T> clazz;
	    
   public TabListener(Activity activity, String tag, Class<T> clz) {
      this.activity = activity;
      this.tag = tag;
      this.clazz = clz;
      this.fragment = null;
   }

   public void onTabSelected(Tab tab, FragmentTransaction fragTrans) {
      //Instantiate and add the fragment if it doesN't exist.
      if (this.fragment == null) {
         this.fragment = Fragment.instantiate(this.activity, this.clazz.getName());
         fragTrans.add(android.R.id.content, this.fragment, this.tag);
      } else {
         // If it exists, show it.
         fragTrans.attach(this.fragment);
      }
   }

   public void onTabUnselected(Tab tab, FragmentTransaction fragTrans) {
      if (this.fragment != null) {
         // Hide the fragment.
         fragTrans.detach(this.fragment);
      }
   }

   public void onTabReselected(Tab tab, FragmentTransaction fragTrans) {
      // Do nothing here or refresh fregment data.
   }
}
