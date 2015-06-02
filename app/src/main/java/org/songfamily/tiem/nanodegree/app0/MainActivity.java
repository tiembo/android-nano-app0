package org.songfamily.tiem.nanodegree.app0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void goSpotify(View view) {
        showPlaceholderToast(view);
    }

    public void goScores(View view) {
        showPlaceholderToast(view);
    }

    public void goLibrary(View view) {
        showPlaceholderToast(view);
    }

    public void goBigger(View view) {
        showPlaceholderToast(view);
    }

    public void goReader(View view) {
        showPlaceholderToast(view);
    }

    public void goCapstone(View view) {
        showPlaceholderToast(view);
    }

    private void showToast(String message) {
        if (mToast != null)
            mToast.cancel();

        mToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        mToast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
        mToast.show();
    }

    private void showPlaceholderToast(View view) {
        Button button = (Button) view;
        String str = "This button will launch my " + button.getText() + " app";
        showToast(str);
    }
}
