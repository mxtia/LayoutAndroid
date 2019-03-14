package com.example.mutiarakartika.layout;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    TextView teks, teks1, teks2, teks3, teks4;
    ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teks = (TextView) findViewById(R.id.textGrid);
        teks1 = (TextView) findViewById(R.id.text1);
        teks2 = (TextView) findViewById(R.id.text2);
        teks3 = (TextView) findViewById(R.id.text3);
        teks4 = (TextView) findViewById(R.id.text4);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);

        Typeface customfont = Typeface.createFromAsset(getAssets(), "font/Cocogoose Pro-trial.ttf");
        teks.setTypeface(customfont);
        teks1.setTypeface(customfont);
        teks2.setTypeface(customfont);
        teks3.setTypeface(customfont);
        teks4.setTypeface(customfont);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
