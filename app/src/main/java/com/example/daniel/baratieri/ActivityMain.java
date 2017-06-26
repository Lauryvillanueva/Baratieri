package com.example.daniel.baratieri;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener{
    ImageView buscarprod,ayuda;
    EditText producto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


       // buscarprod = (ImageView) findViewById(R.id.searchproduct);
        //producto = (EditText) findViewById(R.id.edit_producto);

        ayuda = (ImageView) findViewById(R.id.help);
        ayuda.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //se debe cambiar------
        if (id == R.id.action_settings) {

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.help :
                Intent i = new Intent(this, ActivityHelp.class);
                startActivity(i);
                break;


        }

    }


}

