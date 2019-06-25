package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageview;
AnimationDrawable frameanimation;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview = (ImageView) findViewById(R.id.imageView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(MainActivity.this,first.class));
                finish();
            }
        },1000);
    }
}
