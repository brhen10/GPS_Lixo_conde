package com.brhen10dev.gps_lixo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnCurrentLocation(View view) {

        startActivity(new Intent(this,MapsActivity.class));

    }

    public void btnRetrieveLocation(View view) {

        startActivity(new Intent(getApplicationContext(), RetrieveMapActivity.class));


    }
}