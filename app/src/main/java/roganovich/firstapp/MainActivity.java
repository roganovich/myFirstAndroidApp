package roganovich.firstapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    TextView txt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        txt1 = (TextView) findViewById(R.id.txt1);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Animation anim = null;
        switch (v.getId()){
            case R.id.btn1:
                anim = AnimationUtils.loadAnimation(this,R.anim.myalpha);
                break;
            case R.id.btn2:
                anim = AnimationUtils.loadAnimation(this,R.anim.mycombo);
                break;
            case R.id.btn3:
                anim = AnimationUtils.loadAnimation(this,R.anim.myrotate);
                break;
            case R.id.btn4:
                anim = AnimationUtils.loadAnimation(this,R.anim.myscale);
                break;
            case R.id.btn5:
                anim = AnimationUtils.loadAnimation(this,R.anim.mytrans);
                break;
        }
        txt1.startAnimation(anim);
    }
}
