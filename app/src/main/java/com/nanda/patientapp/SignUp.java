package com.nanda.patientapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7;
    AppCompatButton b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ed1 = (EditText) findViewById(R.id.name);
        ed2 = (EditText) findViewById(R.id.pass);
        ed3 = (EditText) findViewById(R.id.cpass);
        ed4 = (EditText) findViewById(R.id.age);
        ed5 = (EditText) findViewById(R.id.hname);
        ed6 = (EditText) findViewById(R.id.pin);
        ed7 = (EditText) findViewById(R.id.mob);
        b1=(AppCompatButton) findViewById(R.id.reg);
        b2=(AppCompatButton) findViewById(R.id.gotolog);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent();
                i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=ed1.getText().toString();
                String getPassword=ed2.getText().toString();
                String getConfirm=ed3.getText().toString();
                String getAge=ed4.getText().toString();
                String getHousename=ed5.getText().toString();
                String getPin=ed6.getText().toString();
                String getMob=ed7.getText().toString();
                Toast.makeText(getApplicationContext(),getName+getPassword+getConfirm+getAge+getHousename+getPin+getMob,Toast.LENGTH_LONG).show();
            }
        });


        ;

    }
}