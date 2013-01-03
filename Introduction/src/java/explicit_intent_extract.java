protected void onCreate(Bundle savedInstanceState) {
   // Fetch the intent bundle, ...
   Bundle bundle = this.getIntent().getExtras();

   // ... initialize the todo id ...
   long todoId = Todo.PLACEHOLDER_ID;

   // ... and try to fetch it.
   if(bundle != null) {
      todoId = bundle.getLong(TodoActivity.TODO_ID, Todo.PLACEHOLDER_ID);
   }
}
