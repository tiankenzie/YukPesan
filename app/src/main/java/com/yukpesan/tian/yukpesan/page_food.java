package com.yukpesan.tian.yukpesan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by User on 6/19/2016.
 */
public class page_food extends AppCompatActivity{
    TextView title;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);

        setContentView(R.layout.page_food);
        title = (TextView) findViewById(R.id.title);
        title.setText("Choose Food");


        TextView nasi_goreng = (TextView) this.findViewById(R.id.nasi_goreng);
        nasi_goreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });

        TextView beef_steak = (TextView) this.findViewById(R.id.beef_steak);
        beef_steak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView spagheti = (TextView) this.findViewById(R.id.spagheti);
        spagheti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView chickenfried_steak = (TextView) this.findViewById(R.id.chickenfried_steak);
        chickenfried_steak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView fusilli = (TextView) this.findViewById(R.id.fusilli);
        fusilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView ayam_teriyaki = (TextView) this.findViewById(R.id.ayam_teriyaki);
        ayam_teriyaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView Lemon_Herb_Roasted_Chicken = (TextView) this.findViewById(R.id.Lemon_Herb_Roasted_Chicken);
        Lemon_Herb_Roasted_Chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView steak_ayam = (TextView) this.findViewById(R.id.steak_ayam);
        steak_ayam
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_food.this, detail_menu.class);
                startActivity(intent);
            }
        });
    }
}
