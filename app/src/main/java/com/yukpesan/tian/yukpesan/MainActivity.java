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

import com.firebase.client.Firebase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView title;
    Firebase iOrder;
    String vIdOrder;

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
                vIdOrder = saveOrder("1");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "1");
                editor.putString("idOrder", vIdOrder);
                editor.commit();
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });

        TextView meja2 = (TextView) this.findViewById(R.id.meja2);
        meja2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vIdOrder = saveOrder("2");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "2");
                editor.putString("idOrder", vIdOrder);
                editor.commit();
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja3 = (TextView) this.findViewById(R.id.meja3);
        meja3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vIdOrder = saveOrder("3");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "3");
                editor.putString("idOrder", vIdOrder);
                editor.commit();
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja4 = (TextView) this.findViewById(R.id.meja4);
        meja4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vIdOrder = saveOrder("4");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "4");
                editor.putString("idOrder", vIdOrder);
                editor.commit();
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja5 = (TextView) this.findViewById(R.id.meja5);
        meja5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vIdOrder = saveOrder("5");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "5");
                editor.putString("idOrder", vIdOrder);
                editor.commit();
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja6 = (TextView) this.findViewById(R.id.meja6);
        meja6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vIdOrder = saveOrder("6");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "6");
                editor.putString("idOrder", "idOrder");
                editor.commit();
                Intent intent =new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja7 = (TextView) this.findViewById(R.id.meja7);
        meja7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vIdOrder = saveOrder("7");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "7");
                editor.putString("idOrder", "idOrder");
                editor.commit();
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });
        TextView meja8 = (TextView) this.findViewById(R.id.meja8);
        meja8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vIdOrder = saveOrder("8");
                sharedpreferences = getSharedPreferences(MainActivity.MyPreference, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("meja", "8");
                editor.putString("idOrder", "idOrder");
                editor.commit();
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
            }
        });



    }

    public String saveOrder(String idMeja){
        iOrder = new Firebase("https://yukpesan.firebaseio.com/order");


        Long dateCreated = System.currentTimeMillis()/1000;
        Long Priority = 0-(dateCreated);

        Map<String, String>Datatable = new HashMap<>();
        Datatable.put("Meja", idMeja);
        Datatable.put("datecreated", dateCreated.toString());

        Firebase table = iOrder.push();
        table.setValue(Datatable);
        table.setPriority(Priority);
        return table.getKey();
    }


}
