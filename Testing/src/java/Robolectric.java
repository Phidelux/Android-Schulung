@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {
    private Activity activity;
    private Button pressMeButton;
    private TextView results;

    @Before
    public void setUp() throws Exception {
        activity = new MyActivity();
        activity.onCreate(null);
        pressMeButton = (Button) activity.findViewById(R.id.press_me_button);
        results = (TextView) activity.findViewById(R.id.results_text_view);
    }

    @Test
    public void shouldUpdateResultsWhenButtonIsClicked() throws Exception {
        pressMeButton.performClick();
        String resultsText = results.getText().toString();
        assertThat(resultsText, equalTo("Testing Android Rocks!"));
    }
}
