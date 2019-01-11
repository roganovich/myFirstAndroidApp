package roganovich.firstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myText;
    Button myBtn1;
    Button myBtn2;
    Button myBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        myText = (TextView) findViewById(R.id.textView3);
        myBtn1 = (Button) findViewById(R.id.btn1);
        myBtn2 = (Button) findViewById(R.id.btn2);
        myBtn3 = (Button) findViewById(R.id.btn3);


        View.OnClickListener OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence myCounter = myText.getText();
                System.out.println(myCounter);
                Integer MyTotal = Integer.valueOf(myCounter.toString());
                Integer mySumm = MyTotal+1;
                switch (v.getId()) {
                    case R.id.btn1:
                        myText.setText(mySumm.toString());
                        break;
                    case R.id.btn2:
                        myText.setText(mySumm.toString());
                        break;
                    case R.id.btn3:
                        myText.setText(mySumm.toString());
                        break;
                }
            }
        };


        myBtn1.setOnClickListener(OnClickListener);
        myBtn2.setOnClickListener(OnClickListener);
        myBtn3.setOnClickListener(OnClickListener);

        myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText(new String("0"));
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
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
