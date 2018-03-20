package com.example.sandip.adv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    TextView tvHeading;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tvHeading = (TextView) findViewById(R.id.tvHeading);

        btn1.setText("SHOW FACIAL DETECTION");
        btn2.setText("SHOW TARGET ANALYSIS");
        tvHeading.setText("Options");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Homepage.this , Fclick.class);
                startActivity(intent);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Homepage.this,Graph.class);
                startActivity(intent);

            }
        });

    }

}
