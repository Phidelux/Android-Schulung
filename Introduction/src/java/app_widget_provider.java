public class HelloWidgetProvider extends AppWidgetProvider {
   public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
      final int numWidgets = appWidgetIds.length;
      final String[] helloStack = {
         "Hello", "Hi", "Shalom", "Ahlan", "Marhaba",
         "Terve", "Bula", "Aloha", "Salut", "Ciao",
         "Ave", "Hoi", "Morn", "Tschau", "Namaste"};

      // Loop over all instances of this widget.
      for (int i = 0; i < numWidgets; i++) {
         // Fetch the ListView, ...
         RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);
         
         // ... calculate stack position ...
         int rand = (int) (Math.random()*15);
         
         // ... and set the hello view.
         views.setTextViewText(R.id.hello, this.helloStack[rand]);
            
         // Perform an update on the current app widget.
         appWidgetManager.updateAppWidget(appWidgetIds[i], views);
      }
   }
}
