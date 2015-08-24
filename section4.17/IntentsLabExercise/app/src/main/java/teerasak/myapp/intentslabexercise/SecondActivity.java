package teerasak.myapp.intentslabexercise;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity {
    public Button btnSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getExtra();  //callback getExtra()


        btnSecondActivity = (Button) findViewById(R.id.btn_secondActivity);

        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToFirstActivity = new Intent(SecondActivity.this, FirstActivity.class);
                startActivity(intentToFirstActivity);
            }
        });


    }   //onCreate

    private void getExtra() {
        String getExtra = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        Toast.makeText(getApplicationContext(), "Hi !" + getExtra, Toast.LENGTH_SHORT).show();
        Log.d("SecondActivity ", "Show Toast from FirstActivity");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
