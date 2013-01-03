public class TodoList extends ListActivity {
   ...

   @Override
   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      if (resultCode == RESULT_OK && requestCode == TODO_VIEW_REQUEST) {
         // Fetch the selected result.
         long id = data.getLong(TodoActivity.TODO_ID, Todo.PLACEHOLDER_ID);
      }
   }
}
