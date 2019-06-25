package com.example.myapplication;


import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tbruyelle.rxpermissions2.RxPermissions;

public class first extends AppCompatActivity {
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);


        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions
                .request(Manifest.permission.CAMERA) // ask single or multiple permission once
                .subscribe(granted -> {
                    if (granted) {
                        // All requested permissions are granted
                    } else {
                        // At least one permission is denied
                    }
                });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(first.this,about_the_app.class));
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(first.this,second.class));
            }
        });
    }

}
