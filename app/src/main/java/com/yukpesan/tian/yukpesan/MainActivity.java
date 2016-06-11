package com.yukpesan.tian.yukpesan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedpreferences;
    public static final String MyPreference = "Ses";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meja);
        setTitle("YukPesan");


        TextView meja1 = (TextView) this.findViewById(R.id.meja1);
        meja1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "1");
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });

        TextView meja2 = (TextView) this.findViewById(R.id.meja2);
        meja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "2");
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
    }


}
