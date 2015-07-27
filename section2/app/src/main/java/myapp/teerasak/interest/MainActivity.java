package myapp.teerasak.interest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
    protected Button buttonLeft;
    protected Button buttonRight;
    protected ButtonListener btnListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_part_2);

        buttonLeft = (Button) findViewById(R.id.btnLeft);
        buttonRight = (Button) findViewById(R.id.btnRight);
        btnListener = new ButtonListener();
        buttonLeft.setOnClickListener(btnListener);
        buttonRight.setOnClickListener(btnListener);

    } //onCreate

    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btnLeft) {
                if(buttonLeft.getText() != "") {
                    buttonLeft.setText("");
                    buttonRight.setText("Click Me");
                } else {
                    Toast.makeText(getApplicationContext(), "Please Click Right", Toast.LENGTH_SHORT).show();
                }

            } else if (v.getId() == R.id.btnRight) {
                if (buttonRight.getText() != "") {
                    buttonLeft.setText("Click Me");
                    buttonRight.setText("");
                } else {
                    Toast.makeText(getApplicationContext(), "Please click Left", Toast.LENGTH_SHORT).show();
                }

            }

        }
    } // ButtonListener Class

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
