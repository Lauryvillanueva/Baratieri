package com.example.daniel.baratieri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void Go(View view) {
        Intent i = new Intent(Welcome.this,Login.class);
        startActivityForResult(i,1);
    }
}
