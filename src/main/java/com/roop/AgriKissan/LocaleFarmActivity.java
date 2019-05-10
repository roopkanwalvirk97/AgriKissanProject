package com.roop.AgriKissan;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class LocaleFarmActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_locale_farm);
//    }
//}


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LocaleFarmActivity extends AppCompatActivity {

    TextView txt;
    @BindView(R.id.editTextPhone)
    EditText eTxtPhone;

    @BindView(R.id.buttonRegister)
    Button btnRegister;
    PhoneAuthProvider authProvider;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locale_farm);
        txt = findViewById(R.id.textViewTitle);
        // Dynamically how we can set the String
        txt.setText(getResources().getString(R.string.titleRegister));
//        register = findViewById(R.id.buttonRegister);
        ButterKnife.bind(this);
        btnRegister.setOnClickListener(clickListener);

        authProvider = PhoneAuthProvider.getInstance();
        auth = FirebaseAuth.getInstance();
    }
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String phone = eTxtPhone.getText().toString().trim();

            authProvider.verifyPhoneNumber(
                    phone,
                    60,
                    TimeUnit.SECONDS,
                    LocaleFarmActivity.this,
                    callbacks);
        }
    };
    PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        @Override
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            String otp = phoneAuthCredential.getSmsCode();
            signInUser(phoneAuthCredential);
        }

        @Override
        public void onVerificationFailed(FirebaseException e) {
            Toast.makeText(LocaleFarmActivity.this,"OTP Verification Failed"+e.getMessage(),Toast.LENGTH_LONG).show();
        }
    };
    void signInUser(PhoneAuthCredential phoneAuthCredential){
        auth.signInWithCredential(phoneAuthCredential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isComplete()){
                    FirebaseUser user = task.getResult().getUser();
                    String userId = user.getUid();
                    Intent intent = new Intent(LocaleFarmActivity.this, LocaleotpActivity.class);
                    startActivity(intent);
//                    finish();
                }
            }
        });

    }
}
//        register.setOnClickListener(new View.OnClickListener()
//        {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(LocaleFarmActivity.this, LocaleotpActivity.class);
//                startActivity(intent);
//            }
//        });
//    }