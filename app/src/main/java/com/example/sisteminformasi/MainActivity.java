package com.example.sisteminformasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username = "Astrid";
    String password = "Astrid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText TextUser=findViewById(R.id.TextUser);
        EditText TextPassword=findViewById(R.id.TextPassword);

        Button login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUser.getText().toString().equalsIgnoreCase(username)&&TextPassword.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(MainActivity.this,MenuUtama.class));
                    Toast.makeText(MainActivity.this, "Akses Di Terima. Hello Astrid", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Di Tolak! Username Atau Password Salah!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}