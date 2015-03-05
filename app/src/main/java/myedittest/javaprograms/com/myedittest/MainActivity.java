package myedittest.javaprograms.com.myedittest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    //we are creating instance variables
    //so we can then reference
    private EditText myEditText;
    private TextView showMyNameTextView;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //we are fetching our widgets so we can then access and use
        myEditText = (EditText) findViewById(R.id.editTextId);
        showMyNameTextView = (TextView) findViewById(R.id.textView);
        //This is our button that when clicked we are going to get
        //The string or text that was entered and then show it in the "showMyNameTextView"
        showButton = (Button) findViewById(R.id.buttonId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //We are setting our button
                //we are going to put the value "myEditText into a string
                String myName = null;
                myName = myEditText.getText().toString(); //we are converting our text to string that
                                                          //can be used we then assign it to myName
                showMyNameTextView.setText(myName);


            }
        });
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
}
