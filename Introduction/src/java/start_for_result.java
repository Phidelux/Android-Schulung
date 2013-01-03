public class TodoList extends ListActivity {
   ...
   
   @Override
   protected void onListItemClick(ListView l, View v, int position, long id) {
      Intent i = new Intent(this, TodoActivity.class);
      i.putExtra(TodoActivity.TODO_ID, todo.getId());
      i.putExtra(TodoActivity.TODO_ACTION, TodoActivity.TODO_VIEW);
      startActivityForResult(i, TODO_VIEW_REQUEST);
   }
}
