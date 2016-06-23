package com.yukpesan.tian.yukpesan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by User on 6/19/2016.
 */
public class page_drinks extends AppCompatActivity{
    TextView title;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);

        setContentView(R.layout.page_drinks);
        title = (TextView) findViewById(R.id.title);
        title.setText("Choose Drinks");

        TextView milkshake = (TextView) this.findViewById(R.id.milkshake);
        milkshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView icechocolate = (TextView) this.findViewById(R.id.icechocolate);
        icechocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView coffelatte = (TextView) this.findViewById(R.id.coffelatte);
        coffelatte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView hottea = (TextView) this.findViewById(R.id.hottea);
        hottea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView icelemontea = (TextView) this.findViewById(R.id.icelemontea);
        icelemontea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView jusalpukat = (TextView) this.findViewById(R.id.jusalpukat);
        jusalpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView jusjeruk = (TextView) this.findViewById(R.id.jusjeruk);
        jusjeruk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView jusstrawberry = (TextView) this.findViewById(R.id.jusstrawberry);
        jusstrawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_drinks.this, detail_menu.class);
                startActivity(intent);
            }
        });
    }

}
