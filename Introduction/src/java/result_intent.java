public class TodoActivity extends Activity {
   ...
   
   @Override
   public void finish() {
      Intent result = new Intent();
      result.putExtra(TodoActivity.TODO_ID, todo.getId());
      setResult(RESULT_OK, result);
      super.finish();
   }
}
