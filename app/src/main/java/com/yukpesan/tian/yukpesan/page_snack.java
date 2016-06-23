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
public class page_snack extends AppCompatActivity {
    TextView title;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);

        setContentView(R.layout.page_snack);
        title = (TextView) findViewById(R.id.title);
        title.setText("Choose Snack");

        TextView bananasdesserticecreamfruitsweets = (TextView) this.findViewById(R.id.bananasdesserticecreamfruitsweets);
        bananasdesserticecreamfruitsweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView chocolateicecreamdesserts = (TextView) this.findViewById(R.id.chocolateicecreamdesserts);
        chocolateicecreamdesserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView burger = (TextView) this.findViewById(R.id.burger);
        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView kentanggoreng = (TextView) this.findViewById(R.id.kentanggoreng);
        kentanggoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView eskrimbadaiumpet = (TextView) this.findViewById(R.id.eskrimbadaiumpet);
        eskrimbadaiumpet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView pancakesuper = (TextView) this.findViewById(R.id.pancakesuper);
        pancakesuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView sosisbarbeque = (TextView) this.findViewById(R.id.sosisbarbeque);
        sosisbarbeque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
        TextView pancakegulung = (TextView) this.findViewById(R.id.pancakegulung);
        pancakegulung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(page_snack.this, detail_menu.class);
                startActivity(intent);
            }
        });
    }
}
