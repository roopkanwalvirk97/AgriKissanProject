package com.roop.AgriKissan.ui;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class AllSellersActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_all_sellers3);
//    }
//}
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.roop.AgriKissan.R;

import java.util.ArrayList;

public class AllSellersActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    RecyclerView recyclerView;

    ArrayList<Sellers> sellersList;
    SellersAdapter sellersAdapter;
    SellersRecyclerAdapter recyclerAdapter;

    void initViews() {
        //listView = findViewById(R.id.listView);
        recyclerView = findViewById(R.id.recyclerView);

        sellersList = new ArrayList<>();


//        News news1 = new News(R.drawable.category,"NDTV","https://www.ndtv.com/");
//        News news2 = new News(R.drawable.contact,"CNN","https://edition.cnn.com/");
//        News news3 = new News(R.drawable.music,"AAJ TAK","https://aajtak.intoday.in/");
//        News news4 = new News(R.drawable.folder,"ZEE NEWS","https://zee.india.com");
//        News news5 = new News(R.drawable.music,"PTC","https://ptc.india.com");
//        News news6 = new News(R.drawable.contact,"CNN","https://cnn.india.com");
//        News news7 = new News(R.drawable.pb,"AAJ TAK","https://aaj.india.com");
        //review FCM
        //REGISTER ON CRON JOB

        Sellers sellers1 = new Sellers(R.drawable.mustard, "Raj", "Quantity : 100 Tonnes(s)", "Contact : 9990951167","Price :  ₹ 10 -  ₹ 15 Per Kilogram");
        Sellers sellers2 = new Sellers(R.drawable.aonla, "Raj", " Quantity : 100 Tonnes(s)", "Contact : 9990951167","Price :  ₹ 250");
        Sellers sellers3 = new Sellers(R.drawable.ashwagandha, "Manoj Singh Rawal", "Quantity : 95 Tonnes(s)", "Contact : 9990951167","Price :  ₹ 15 -  ₹ 20");
        Sellers sellers4 = new Sellers(R.drawable.cabbage1, "Gurpreet Singh","Quantity : 300 Tonnes(s)", "Contact : 9914122166","Price :  ₹ 200 - ₹ 400" );
        Sellers sellers5 = new Sellers(R.drawable.wheat, "Gurmandeep Singh", "10 Tonnes(s)", "Contact : 7837138078","Price :  ₹ 2100 -  ₹ 2200");
        Sellers sellers6 = new Sellers(R.drawable.kinnow, "Bhuwnesh", "Quantity : 2000 Tonnes(s)", "Contact : 8890937065","Price :  ₹ 20 - ₹ 25");
        Sellers sellers7 = new Sellers(R.drawable.cauliflower1, "Parwinder Singh", "Quantity : 20 Tonnes(s)", "Contact : 9779250811","Price :  ₹ 20 -  ₹ 600");
        Sellers sellers8 = new Sellers(R.drawable.paddy1, "Arshdeep", "Quantity : 50 Tonnes(s)", "Contact : 9781802038","Price :  ₹ 2900 -  ₹ 3000");
        Sellers sellers9 = new Sellers(R.drawable.asparagus, "Tester","Quantity : 12 Tonnes(s)", "Contact : 5576505656","Price :  ₹ 10036 -  ₹ 36086");
        Sellers sellers10 = new Sellers(R.drawable.kinnow, "R Syadev", "Quantity : 100 Tonnes(s)", "Contact : 9555641039","Price :  ₹ 1200 -  ₹ 1300");

        sellersList.add(sellers1); //0
        sellersList.add(sellers2);
        sellersList.add(sellers3);
        sellersList.add(sellers4);
        sellersList.add(sellers5); //4
        sellersList.add(sellers6);
        sellersList.add(sellers7);
        sellersList.add(sellers8);
        sellersList.add(sellers9);
        sellersList.add(sellers10);

        //newsList.add(new News(R.drawable.category,"NDTV","https://ndtv.india.com"));

        //newsAdapter = new NewsAdapter(this, R.layout.list_item, newsList);
        //listView.setAdapter(newsAdapter);

        //listView.setOnItemClickListener(this);

        recyclerAdapter = new SellersRecyclerAdapter(this, R.layout.list_seller, sellersList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(recyclerAdapter);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_sellers);
        initViews();
//        @Override
//        public void onItemClick (AdapterView < ? > parent, View view,int position, long id){
//            Sellers sellers = sellersList.get(position);
//            Intent intent = new Intent(AllSellersActivity.this, WebViewSellersActivity.class);
//            intent.putExtra("keySellers", sellers);
//            startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Sellers sellers = sellersList.get(position);
            Intent intent = new Intent(AllSellersActivity.this, WebViewSellersActivity.class);
            intent.putExtra("keySellers", sellers);
            startActivity(intent);

    }
}