package com.yukpesan.tian.yukpesan;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by User on 6/23/2016.
 */
public class view_order extends AppCompatActivity {

    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);
        setContentView(R.layout.view_order);

        title = (TextView) findViewById(R.id.title);
        title.setText("Management Order");
    }
}
