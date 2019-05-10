package com.roop.AgriKissan.ui;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.roop.AgriKissan.HomeDashboardActivity;
import com.roop.AgriKissan.R;


public class otpActivity extends AppCompatActivity {
    EditText eTxtOtp;
    Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        eTxtOtp = findViewById(R.id.editTextOtp);
        btnVerify = findViewById(R.id.buttonVerify);
        btnVerify.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(otpActivity.this, HomeDashboardActivity.class);
                startActivity(intent);
            }
        });


    }
}