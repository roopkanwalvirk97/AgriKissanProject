package com.roop.AgriKissan;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roop.AgriKissan.ui.AllBuyersActivity;
import com.roop.AgriKissan.ui.AllSellersActivity;
import com.roop.AgriKissan.ui.ExpertsActivity;
import com.roop.AgriKissan.ui.MyFragmentsActivity;
import com.roop.AgriKissan.ui.NavroopActivity;
import com.roop.AgriKissan.ui.WebViewActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        handler.sendEmptyMessageDelayed(101, 1000);
    }


    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what == 101){
                Intent intent = new Intent(SplashActivity.this, AllBuyersActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };

}