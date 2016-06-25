package com.yukpesan.tian.yukpesan;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

/**
 * Created by User on 6/20/2016.
 */
public class detail_menu extends AppCompatActivity {
    TextView title;
    Spinner detail_menu;

    String[] quantity = {"1", "2","3", "4", "5", "6", "7", "8", "9", "10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);
        setContentView(R.layout.detail_menu);


        title = (TextView) findViewById(R.id.title);
        title.setText("Detail Menu");

        detail_menu = (Spinner)findViewById(R.id.spinner_menu);

        ArrayAdapter<String>detail_menuadpter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, quantity);
        detail_menu.setAdapter(detail_menuadpter);

    }
}
