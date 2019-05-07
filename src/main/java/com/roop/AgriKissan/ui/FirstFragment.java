package com.roop.AgriKissan.ui;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.roop.AgriKissan.R;
//
//public class FirstFragment extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_first_fragment);
//    }
//}

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.roop.AgriKissan.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements MyListener{


    WebView webView;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_first_fragment, container, false);

        webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://www.videvo.net/videvo_files/converted/2016_01/preview/Seedlings_15_1_Videvo.mov77988.webm");
//        webView.loadUrl("https://www.youtube.com/watch?v=VTOP25nn4bw" );
//        webView.loadUrl("https://www.apnikheti.com/en/pn/news-details/%E0%A8%AC%E0%A8%A0%E0%A8%BF%E0%A9%B0%E0%A8%A1%E0%A8%BE-%E0%A9%9B%E0%A8%BF%E0%A8%B2%E0%A9%8D%E0%A8%B9%E0%A9%87-%E0%A8%A6%E0%A9%80%E0%A8%86%E0%A8%82-%E0%A8%AE%E0%A9%B0%E0%A8%A1%E0%A9%80%E0%A8%86%E0%A8%82-%E0%A8%B5%E0%A8%BF%E0%A9%B1%E0%A8%9A-%E0%A8%95%E0%A8%A3%E0%A8%95-%E0%A8%A6%E0%A9%80%E0%A8%86%E0%A8%82-%E0%A8%AC%E0%A9%8B%E0%A8%B0%E0%A9%80%E0%A8%86%E0%A8%82-%E0%A8%A6%E0%A9%87-%E0%A8%85%E0%A9%B0%E0%A8%AC%E0%A8%BE%E0%A8%B0");
        webView.loadUrl("https://youtu.be/aZJHAfACJw8");
        return view;
    }

//    @Override
    public void newsHandler(int position) {
        switch (position){
            case 0:
                webView.loadUrl("https://youtu.be/aZJHAfACJw8");
                break;

            case 1:
                webView.loadUrl("https://edition.cnn.com/");
                break;

            case 2:
                webView.loadUrl("https://www.ndtv.com/");
                break;

            case 3:
                webView.loadUrl("https://www.ndtv.com/");
                break;

            case 4:
                webView.loadUrl("https://www.ptcpunjabi.co.in/");
                break;
        }
    }
}
