package myapp.teerasak.interest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private Button buttonLeft;
    private Button buttonRight;
    private ButtonOnClickListener buttonListen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_part_2);

        buttonLeft = (Button) findViewById(R.id.btnLeft);
        buttonRight = (Button) findViewById(R.id.btnRight);
        buttonListen = new ButtonOnClickListener();
        buttonLeft.setOnClickListener(buttonListen);
        buttonRight.setOnClickListener(buttonListen);


    }

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

    private class ButtonOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.btnLeft) {
                buttonLeft.setText("");
                buttonRight.setText("Click me");
            } else if (view.getId() == R.id.btnRight) {
                buttonLeft.setText("Click me");
                buttonRight.setText("");
            }

        }
    }


}
