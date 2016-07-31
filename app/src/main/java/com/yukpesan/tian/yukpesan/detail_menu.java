package com.yukpesan.tian.yukpesan;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 6/20/2016.
 */
public class detail_menu extends AppCompatActivity {
    TextView title;
    Spinner iQuantity;
    String Idfoods,images,menu, vIdOrder,harga,des;
    Button btn_order;
    String vQuantity;
    Firebase foods,order;

    String[] quantity = {"1", "2","3", "4", "5", "6", "7", "8", "9", "10"};

    public static final String MyPREFERENCES = "Ses" ;
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);
        setContentView(R.layout.detail_menu);



        title = (TextView) findViewById(R.id.title);
        title.setText("Detail Menu");

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        vIdOrder = sharedpreferences.getString("idOrder", "");


        Bundle detailmenu = getIntent().getExtras();
        Idfoods = "";
        if (detailmenu != null) {
            Idfoods = detailmenu.getString("idFoods");
            menu = detailmenu.getString("type");
        }
        Log.d("id food  : ", "" + Idfoods);
        Firebase.setAndroidContext(this);
        foods = new Firebase("https://yukpesan.firebaseio.com/"+menu+"/"+Idfoods);
        foods.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() != null) {
                    images = dataSnapshot.child("image").getValue().toString();
                    ImageView img = (ImageView) findViewById(R.id.img);
                    int nama = iQuantity.getResources().getIdentifier(images, "drawable", getPackageName());
                    img.setImageResource(nama);
                    des = dataSnapshot.child("description").getValue().toString();
                    TextView desk = (TextView) findViewById(R.id.desk);
                    desk.setText(des);
                    harga = dataSnapshot.child("harga").getValue().toString();
                    TextView price = (TextView) findViewById(R.id.hrg);
                    price.setText(harga);

                }


            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        iQuantity = (Spinner)findViewById(R.id.spinner_menu);
        ArrayAdapter<String>quantityadpter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, quantity);
        iQuantity.setAdapter(quantityadpter);

        btn_order = (Button) this.findViewById(R.id.add_order);
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vIdOrder != "") {
                    vQuantity = iQuantity.getSelectedItem().toString();

                    order = new Firebase("https://yukpesan.firebaseio.com/order/" + vIdOrder + "/detail");

                    Long dateCreated = System.currentTimeMillis() / 1000;
                    Long Priority = 0 - (dateCreated);


                    Map<String, String> Dataorder = new HashMap<>();
                    Dataorder.put("idFoods", Idfoods);
                    Dataorder.put("type", menu);
                    Dataorder.put("quantity", vQuantity);
                    Dataorder.put("datecreated", dateCreated.toString());
                    Firebase add_order = order.push();
                    add_order.setValue(Dataorder);
                    add_order.setPriority(Priority);
                    Intent i = new Intent(detail_menu.this,home.class);
                    startActivity(i);
            }
            }
        });
    }

}
