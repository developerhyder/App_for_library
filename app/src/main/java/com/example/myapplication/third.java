package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class third extends AppCompatActivity {
TextView tv;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv = (TextView)findViewById(R.id.textView);
        b1 = (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.button4);

        if (cons.is_book(cons.data)){
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //about the book
                    startActivity(new Intent(third.this,About_the_book.class));
                    finish();
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //let's find similar books shall we ? uncomment the below lines
                    startActivity(new Intent(third.this,similar_book.class));
                    finish();
                }
            });
        }else{
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
            tv.setText("BOOK NOT FOUND");
        }


    }
}
