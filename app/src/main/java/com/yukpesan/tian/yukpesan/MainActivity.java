package com.yukpesan.tian.yukpesan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView title;

    SharedPreferences sharedpreferences;
    public static final String MyPreference = "Ses";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);
        setContentView(R.layout.meja);

        title = (TextView) findViewById(R.id.title);
        title.setText("Choose Table");


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
        TextView meja3 = (TextView) this.findViewById(R.id.meja3);
        meja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "3");
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja4 = (TextView) this.findViewById(R.id.meja4);
        meja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "4");
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja5 = (TextView) this.findViewById(R.id.meja5);
        meja5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "5");
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja6 = (TextView) this.findViewById(R.id.meja6);
        meja6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "6");
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja7 = (TextView) this.findViewById(R.id.meja7);
        meja7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "7");
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja8 = (TextView) this.findViewById(R.id.meja8);
        meja8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "8");
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
    }


}
