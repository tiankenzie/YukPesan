package com.yukpesan.tian.yukpesan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

/**
 * Created by User on 6/19/2016.
 */
public class page_drinks extends AppCompatActivity{
    TextView title;
    Firebase drinks;
    ArrayList<String> images_right_arr,images_left_arr,id_images_right,id_images_left;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);

        setContentView(R.layout.page_drinks);
        title = (TextView) findViewById(R.id.title);
        title.setText("Choose Drinks");

        Firebase.setAndroidContext(this);
        drinks = new Firebase("https://yukpesan.firebaseio.com/drinks");
        drinks.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {
                    images_right_arr = new ArrayList<String>();
                    images_left_arr = new ArrayList<String>();
                    id_images_right = new ArrayList<String>();
                    id_images_left = new ArrayList<String>();

                    int loop = 1;
                    for (DataSnapshot child : dataSnapshot.getChildren()) {
                        String images = child.child("image").getValue().toString();
                        String ID_images = child.getKey().toString();
                        if (loop % 2 == 1) {
                            images_right_arr.add(images);
                            id_images_right.add(ID_images);
                        } else {
                            images_left_arr.add(images);
                            id_images_left.add(ID_images);
                        }
                        loop++;
                    }
                    ListView list_minuman = (ListView) findViewById(R.id.list_minuman);
                    list_minuman.setAdapter(new CustomAdapter(page_drinks.this, images_right_arr, images_left_arr,id_images_right,id_images_left,"drinks"));
                    ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) list_minuman.getLayoutParams();
                    mlp.setMargins(0, 0, 0, 0);
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }

}
