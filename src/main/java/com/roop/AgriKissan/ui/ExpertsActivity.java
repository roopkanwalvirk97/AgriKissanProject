package com.roop.AgriKissan.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.roop.AgriKissan.R;


public class ExpertsActivity extends AppCompatActivity {
    ImageView imgnavroop, imgurpreet, imgharvinder, imgnavdeep, imgramandeep, imgpavitar, imghindpal, imgmittali,imgrajmohan, imgnishan, imgdaljeet, imgurcharan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experts);


        imgnavroop = findViewById(R.id.navroop);
        imgnavroop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NavroopActivity.class);
                startActivity(intent);
            }
        });

        imgurpreet = findViewById(R.id.gurpreet);
        imgurpreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GurpreetActivity.class);
                startActivity(intent);
            }
        });
        imgharvinder = findViewById(R.id.harvinder);
        imgharvinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HarvinderActivity.class);
                startActivity(intent);
            }
        });
        imgnavdeep = findViewById(R.id.navdeep);
        imgnavdeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NavdeepActivity.class);
                startActivity(intent);

            }
        });
        imgramandeep = findViewById(R.id.ramandeep);
        imgramandeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RamandeepActivity.class);
                startActivity(intent);
            }
        });
        imgpavitar = findViewById(R.id.pavitar);
        imgpavitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PavitarActivity.class);
                startActivity(intent);
            }
        });
        imghindpal = findViewById(R.id.hindpal);
        imghindpal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HindpalActivity.class);
                startActivity(intent);
            }
        });
        imgmittali = findViewById(R.id.mittali);
        imgmittali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MittaliActivity.class);
                startActivity(intent);
            }
        });

        imgrajmohan= findViewById(R.id.rajmohan);
        imgrajmohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RajmohanActivity.class);
                startActivity(intent);
            }
        });
        imgnishan= findViewById(R.id.nishan);
        imgnishan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NishanActivity.class);
                startActivity(intent);
            }
        });
        imgdaljeet = findViewById(R.id.daljeet);
        imgdaljeet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DaljeetActivity.class);
                startActivity(intent);
            }
        });

        imgurcharan = findViewById(R.id.wheat);
        imgurcharan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GurcharanActivity.class);
                startActivity(intent);
            }
        });

    }

}