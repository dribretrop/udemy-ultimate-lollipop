package teerasak.myapp.section4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FirstActivity extends ActionBarActivity {

    private static final String TAG = "FirstActivity";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.d(TAG, "In onCreate()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "In onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "In onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("Resume");
        Log.d(TAG, "In onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "In onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "In onDestroy()");
    }





/*
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
    }*/
}
