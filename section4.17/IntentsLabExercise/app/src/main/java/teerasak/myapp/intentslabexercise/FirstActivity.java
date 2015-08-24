package teerasak.myapp.intentslabexercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends Activity {

    private EditText etMessage;
    // private static final String EXTRA_MSG_KEY = "EXTRA_MSG_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        etMessage = (EditText) findViewById(R.id.etMessage);

    }   // onCreate()

    public void onClickIntentToActivity(View view) {

        String check_etMessage = etMessage.getText().toString();

        //    if (etMessage.getText().toString() == null)  // NOT WORKING
        // {
        if (check_etMessage.matches("")) {
            Toast.makeText(getApplicationContext(), "Please Fill in Form", Toast.LENGTH_SHORT).show();
            Log.e("FirstActivity", "onClickIntentToActivity Null Value");
        } else {
            Intent intentToSecond = new Intent(FirstActivity.this, SecondActivity.class);
            intentToSecond.putExtra(Intent.EXTRA_TEXT, etMessage.getText().toString());
            startActivity(intentToSecond);
            Log.d("FirstActivity ", "onClickIntentToActivity");
        }

    }   // onClickIntentToActivity

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
