package com.roop.AgriKissan.ui;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.roop.AgriKissan.R;
//
//public class FourthFragment extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fourth_fragment);
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
public class FourthFragment extends Fragment implements MyListener{


    WebView webView;

    public FourthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_fourth_fragment, container, false);

        webView = view.findViewById(R.id.webView3);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://static.videezy.com/system/resources/previews/000/002/292/original/aerial-tractor-hd-stock-video.mp4");
        webView.loadUrl("https://youtu.be/Zr5Yd_w6fYE");
        return view;
    }

//    @Override
    public void newsHandler(int position) {
        switch (position){
            case 0:
                webView.loadUrl("https://youtu.be/Zr5Yd_w6fYE");
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
