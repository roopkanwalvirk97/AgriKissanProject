package com.roop.AgriKissan.ui;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.roop.AgriKissan.R;
//
//public class WebViewActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_web_view);
//    }
//}


import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.roop.AgriKissan.MainActivity;
import com.roop.AgriKissan.R;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebViewActivity extends AppCompatActivity {


    WebView webView;
    String News_url;

    void initViews(){

        Intent rcv = getIntent();
//        News news = (News)rcv.getSerializableExtra("keyNews");
//        Experts experts = (Experts)rcv.getSerializableExtra("keyExperts");


        //getSupportActionBar().setTitle("Amazon");
        //getSupportActionBar().hide();
//        getSupportActionBar().setTitle(news.title);
//        getSupportActionBar().setTitle(experts.name);

        webView = findViewById(R.id.webView);

        //WebViewClient client = new WebViewClient();
        //webView.setWebViewClient(client);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        //webView.loadUrl("https://www.google.co.in");
        //webView.loadUrl("https://www.amazon.in/");
        //webView.loadUrl("https://www.ndtv.com/");
        webView.loadUrl(News_url);
//        webView.loadUrl(experts.branch);
        News_url = "https://newsapi.org/v2/top-headlines?sources=google-news&apiKey=50f340dac0e84a34a5266bb4d02b927a";

//        API KEY NEWS- 50f340dac0e84a34a5266bb4d02b927a

        new WebViewActivity.AsyncHttpTask().execute(News_url);
    }
    public class AsyncHttpTask extends AsyncTask<String, Void,String> {

        @Override
        protected String doInBackground(String... urls) {
            String result ="";
            URL url;
            HttpURLConnection urlConnection = null;
            try {
                url = new URL(urls[0]);
                urlConnection = (HttpURLConnection)url.openConnection();
                String response= streamToString(urlConnection.getInputStream());
                parseResult(response);
                return result;



            } catch (Exception e) {
                e.printStackTrace();
            }


            return null;
        }
    }
    String streamToString(InputStream stream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
        String data;
        String result="";

        while ((data = bufferedReader.readLine())!=null) {
            result += data;
        }
        if(null != stream){
            stream.close();
        }

        return result;
    }

    private void parseResult(String result){
        JSONObject response = null;
        try {
            response = new JSONObject(result);
            JSONArray articles = response.optJSONArray("articles");

            for (int i = 0; i < articles.length(); i++){
                JSONObject article = articles.optJSONObject(i);
                String title = article.optString("title");
                Log.i("Titles", title);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initViews();
    }
}