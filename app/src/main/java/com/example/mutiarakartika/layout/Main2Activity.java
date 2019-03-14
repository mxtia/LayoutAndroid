package com.example.mutiarakartika.layout;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView teks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        teks = (TextView) findViewById(R.id.teks1);

        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/Cocogoose Pro-trial.ttf");
        teks.setTypeface(customfont);
    }
}
