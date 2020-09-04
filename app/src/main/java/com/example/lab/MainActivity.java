package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText edt_username,edt_password,edt_phone;
 Button btn_redister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_username=findViewById(R.id.edt_username);
        edt_password=findViewById(R.id.edt_password);
        edt_phone=findViewById(R.id.edt_phone);
        btn_redister=findViewById(R.id.btn_register);
        btn_redister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("username",edt_username.getText().toString());
                intent.putExtra("password",edt_password.getText().toString());
                intent.putExtra("phone",edt_phone.getText().toString());
                startActivity(intent);
            }
        });
    }
}
