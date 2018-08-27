package com.example.lenovo.servicesdemo;

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

    public void onClickStartServiceButton(View view) {
        Intent i1=new Intent(this,MyOwnService.class);
        startService(i1);
    }

    public void onClickStopServiceButton(View view) {
        Intent i1=new Intent(this,MyOwnService.class);
        stopService(i1);
    }
}
