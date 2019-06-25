package com.example.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class about_the_app extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private int count = 0;
    private Handler handler = new Handler();
    private int i=0;
    TextView tv;
    String test = "This app informs you about the book via QR code technology Also it tells you if the book is available or not in the library and informs about the alternatives based on the genre";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_app);
        tv = (TextView)findViewById(R.id.textView0);
        somee();
    }
    private void somee() {
       int ct = test.length();
       char[] ch = test.toCharArray();

            new Thread(new Runnable() {
                public void run() {
                    while (progressStatus < ct) {
                        progressStatus += 1;
                        // Update the progress bar and display the
                        //current value in the text view
                        handler.post(new Runnable() {
                            public void run() {
//                                if(vi== 0) {
//                                    vi++;
//                                    tv.setText("Loading...");
//                                }
                                String s = Character.toString(ch[i]);
                                tv.append(s);
                                s="";
                                i++;

                            }
                        });
                        try {
                            // Sleep for 600 milliseconds.
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                }
            }).start();

    }
}
