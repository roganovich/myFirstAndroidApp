package roganovich.firstapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView txtName;
    RadioButton rbLeft;
    RadioButton rbCenter;
    RadioButton rbRight;
    RadioGroup  rdbGroup;
    Button btnCreate;
    Button btnClear;
    LinearLayout lResult;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        txtName = (TextView) findViewById(R.id.txtName);
        rdbGroup = (RadioGroup) findViewById(R.id.rdbGroup);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(this);

        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        lResult = (LinearLayout) findViewById(R.id.loResult);

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
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnCreate:
                LinearLayout.LayoutParams lParms = new LinearLayout.LayoutParams(wrapContent,wrapContent);

                int btnGravity = Gravity.LEFT;
                switch (rdbGroup.getCheckedRadioButtonId()){
                    case R.id.rbLeft:
                        btnGravity = Gravity.LEFT;
                        break;
                    case R.id.rbCenter:
                        btnGravity = Gravity.CENTER;
                        break;
                    case R.id.rbRight:
                        btnGravity = Gravity.RIGHT;
                        break;
                }

                lParms.gravity = btnGravity;

                Button newButton = new Button(this);
                newButton.setText(txtName.getText().toString());
                lResult.addView(newButton,lParms);
                break;

            case R.id.btnClear:
                lResult.removeAllViews();
                Toast.makeText(this, "Удалено", Toast.LENGTH_LONG).show();
                break;
        }
    }




}
