@Override
protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   
   // Setup the ActionBar object ...
   ActionBar actionBar = getActionBar();
   actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
   actionBar.setDisplayShowTitleEnabled(false);

   // ... and add two tabs.
   Tab tab = actionBar.newTab()
      .setText(R.string.topNews)
      .setTabListener(
         new TabListener<TopNewsFragment>(
            this, "topNews", TopNewsFragment.class));
   actionBar.addTab(tab);

   tab = actionBar.newTab()
      .setText(R.string.latestNews)
      .setTabListener(
         new TabListener<LatestNewsFragment>(
            this, "latestNews", LatestNewsFragment.class));
   actionBar.addTab(tab);
}
