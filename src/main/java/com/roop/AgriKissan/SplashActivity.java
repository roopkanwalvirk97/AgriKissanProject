package com.roop.AgriKissan;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.roop.AgriKissan.ui.ProfileActivity;
import com.roop.AgriKissan.ui.RegistrationActivity;


public class SplashActivity extends AppCompatActivity {
    TextView txtSpalsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        handler.sendEmptyMessageDelayed(101, 2500);
        txtSpalsh= findViewById(R.id.textViewSplash);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha);
        txtSpalsh.startAnimation(animation);

    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 101) {
                Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }

        }

    };
}