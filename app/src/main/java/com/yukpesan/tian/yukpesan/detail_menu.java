package com.yukpesan.tian.yukpesan;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.lang.reflect.Array;

/**
 * Created by User on 6/20/2016.
 */
public class detail_menu extends AppCompatActivity {
    TextView title;
    Spinner detail_menu;
    String Idfoods,images,menu;
    Firebase foods;

    String[] quantity = {"1", "2","3", "4", "5", "6", "7", "8", "9", "10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);
        setContentView(R.layout.detail_menu);


        title = (TextView) findViewById(R.id.title);
        title.setText("Detail Menu");

        Bundle detailmenu = getIntent().getExtras();
        Idfoods = "";
        if (detailmenu != null) {
            Idfoods = detailmenu.getString("idFoods");
            menu = detailmenu.getString("type");
        }
        Log.d("id food  : ", ""+Idfoods);
        Firebase.setAndroidContext(this);
        foods = new Firebase("https://yukpesan.firebaseio.com/"+menu+"/"+Idfoods);
        foods.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {
                    images = dataSnapshot.child("image").getValue().toString();
                    ImageView img = (ImageView) findViewById(R.id.img);
                    int nama = detail_menu.getResources().getIdentifier(images, "drawable", getPackageName());
                    img.setImageResource(nama);
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        detail_menu = (Spinner)findViewById(R.id.spinner_menu);

        ArrayAdapter<String>detail_menuadpter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, quantity);
        detail_menu.setAdapter(detail_menuadpter);

    }
}
