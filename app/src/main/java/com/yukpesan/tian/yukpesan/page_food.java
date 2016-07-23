package com.yukpesan.tian.yukpesan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
public class page_food extends AppCompatActivity{
    TextView title;

    Firebase foods;
    ArrayList<String> images_right_arr,images_left_arr,id_images_right,id_images_left;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);

        setContentView(R.layout.page_food);
        title = (TextView) findViewById(R.id.title);
        title.setText("Choose Food");

        Firebase.setAndroidContext(this);
        foods = new Firebase("https://yukpesan.firebaseio.com/foods");
        foods.addValueEventListener(new ValueEventListener() {
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
                        String Price = child.getKey().toString();
                        String Description = child.getKey().toString();
                        if (loop % 2 == 1) {
                            images_right_arr.add(images);
                            id_images_right.add(ID_images);
                        } else {
                            images_left_arr.add(images);
                            id_images_left.add(ID_images);
                        }
                        loop++;
                    }
                    ListView list_food = (ListView) findViewById(R.id.list_makanan);
                    list_food.setAdapter(new CustomAdapter(page_food.this, images_right_arr, images_left_arr,id_images_right,id_images_left,"foods"));
                    ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) list_food.getLayoutParams();
                    mlp.setMargins(0, 0, 0, 0);
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }

}
