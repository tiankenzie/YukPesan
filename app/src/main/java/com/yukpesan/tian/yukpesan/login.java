package com.yukpesan.tian.yukpesan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by User on 6/11/2016.
 */
public class login extends AppCompatActivity {
    Firebase loginRef;
    String vUsername, vPassword, fPassword;
    JSONObject jsonObject;
    TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        Button login = (Button) this.findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });

    }

    public boolean login(){
        EditText iUsername = (EditText) this.findViewById(R.id.username);
        final EditText iPassword = (EditText) this.findViewById(R.id.password);
        vUsername = iUsername.getText().toString();
        vPassword = iPassword.getText().toString();
        if(vUsername.equals("")){
            Toast.makeText(this , "please input username", Toast.LENGTH_SHORT).show();
            iUsername.requestFocus();
            return false;
        }
        if (vPassword.equals("")){
            Toast.makeText(this, "Please input password", Toast.LENGTH_SHORT).show();
            iPassword.requestFocus();
            return false;
        }
        Firebase.setAndroidContext(this);
        loginRef = new Firebase("https://yukpesan.firebaseio.com/users/");
        loginRef.child(vUsername).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.getValue() == null) {
                    Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }else{
                    String jsonString = dataSnapshot.getValue().toString();
                    try {
                        jsonObject = new JSONObject(jsonString);
                        if (jsonObject != null) {
                            fPassword = jsonObject.getString("password");
                            if (fPassword.equals(vPassword)) {
                                Toast.makeText(login.this, "Login success", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(login.this, MainActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(login.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        Toast.makeText(login.this, "Error !", Toast.LENGTH_SHORT).show();
                    }
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                Toast.makeText(login.this, "Error!", Toast.LENGTH_SHORT).show();
            }
        });
        return false;
    }
}
