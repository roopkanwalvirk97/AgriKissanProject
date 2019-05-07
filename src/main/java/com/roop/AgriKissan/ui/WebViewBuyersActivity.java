package com.roop.AgriKissan.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import com.roop.AgriKissan.R;

public class WebViewBuyersActivity extends AppCompatActivity {

    WebView webView;

    void initViews(){

        Intent rcv = getIntent();
        Buyers buyers = (Buyers) rcv.getSerializableExtra("keyBuyers");

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_web_view_buyers);
//    }
//}

        getSupportActionBar().setTitle(buyers.name);

        webView = findViewById(R.id.webView);

        //WebViewClient client = new WebViewClient();
        //webView.setWebViewClient(client);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        //webView.loadUrl("https://www.google.co.in");
        //webView.loadUrl("https://www.amazon.in/");
        //webView.loadUrl("https://www.ndtv.com/");
        webView.loadUrl(buyers.quantity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_buyers);
        initViews();
    }
}
