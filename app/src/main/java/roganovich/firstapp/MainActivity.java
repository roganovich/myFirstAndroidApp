package roganovich.firstapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    final int MENU_COLOR_RED = 1;
    final int MENU_COLOR_BLUE = 2;
    final int MENU_COLOR_GREEN = 3;

    final int MENU_FONT_16 = 4;
    final int MENU_FONT_22 = 5;
    final int MENU_FONT_28 = 6;

    TextView myText;
    Button myBtnFont;
    Button myBtnColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        myText = (TextView) findViewById(R.id.txtExample);
        myBtnFont = (Button) findViewById(R.id.btnFont);
        myBtnColor = (Button) findViewById(R.id.btnColor);

        registerForContextMenu(myBtnFont);
        registerForContextMenu(myBtnColor);

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
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        switch (v.getId()){
            case R.id.btnFont:
                menu.add(0,MENU_FONT_16,0,"16");
                menu.add(0,MENU_FONT_22,0,"22");
                menu.add(0,MENU_FONT_28,0,"28");
                break;
            case R.id.btnColor:
                menu.add(0,MENU_COLOR_BLUE,0,"BLUE");
                menu.add(0,MENU_COLOR_RED,0,"RED");
                menu.add(0,MENU_COLOR_GREEN,0,"GREEN");
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch (item.getItemId()){
            case MENU_FONT_16:
                myText.setTextSize(16);
                break;
            case MENU_FONT_22:
                myText.setTextSize(22);
                break;
            case MENU_FONT_28:
                myText.setTextSize(28);
                break;

            case MENU_COLOR_BLUE:
                myText.setTextColor(Color.BLUE);
                break;
            case MENU_COLOR_RED:
                myText.setTextColor(Color.RED);
                break;
            case MENU_COLOR_GREEN:
                myText.setTextColor(Color.GREEN);
                break;
        }
        return super.onContextItemSelected(item);
    }

}
