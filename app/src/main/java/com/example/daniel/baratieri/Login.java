package com.example.daniel.baratieri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
}

    public void Login(View view) {
        Intent i = new Intent(Login.this,ActivityMain.class);
        startActivity(i);
    }
}
