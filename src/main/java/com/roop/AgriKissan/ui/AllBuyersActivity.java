package com.roop.AgriKissan.ui;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.roop.AgriKissan.R;
//
//public class AllBuyersActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_all_buyers);
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

public class AllBuyersActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    RecyclerView recyclerView;

    ArrayList<Buyers> buyersList;
    BuyersAdapter buyersAdapter;
    BuyersRecyclerAdapter recyclerAdapter;

    void initViews() {
        //listView = findViewById(R.id.listView);
        recyclerView = findViewById(R.id.recyclerView);

        buyersList = new ArrayList<>();

        Buyers buyers1 = new Buyers(R.drawable.mustard, "Mustard", "Karmvir Singh Rana", "Quantity : 100 Tonnes(s)","Grade : Hy-ola PAC 401","Contact : 9878255482", "Price : ₹ 42 Per Quintal");
//        Sellers sellers2 = new Sellers(R.drawable.aonla, "Raj", " Quantity : 100 Tonnes(s)", "Contact : 9990951167","Price : u20B9 250");
//        Sellers sellers3 = new Sellers(R.drawable.ashwagandha, "Manoj Singh Rawal", "Quantity : 95 Tonnes(s)", "Contact : 9990951167","Price : \\u20B9 15 - \\u20B9 20");
//        Sellers sellers4 = new Sellers(R.drawable.cabbage1, "Gurpreet Singh","Quantity : 300 Tonnes(s)", "Contact : 9914122166","Price : \\u20B9 200 - \\u20B9 400" );
//        Sellers sellers5 = new Sellers(R.drawable.wheat, "Gurmandeep Singh", "10 Tonnes(s)", "Contact : 7837138078","Price : \\u20B9 2100 - \\u20B9 2200");
//        Sellers sellers6 = new Sellers(R.drawable.kinnow, "Bhuwnesh", "Quantity : 2000 Tonnes(s)", "Contact : 8890937065","Price : \\u20B9 20 - \\u20B9 25");
//        Sellers sellers7 = new Sellers(R.drawable.cauliflower1, "Parwinder Singh", "Quantity : 20 Tonnes(s)", "Contact : 9779250811","Price : \\u20B9 20 - \\u20B9 600");
//        Sellers sellers8 = new Sellers(R.drawable.paddy1, "Arshdeep", "Quantity : 50 Tonnes(s)", "Contact : 9781802038","Price : \\u20B9 2900 - \\u20B9 3000");
//        Sellers sellers9 = new Sellers(R.drawable.asparagus, "Tester","Quantity : 12 Tonnes(s)", "Contact : 5576505656","Price : \\u20B9 10036 - \\u20B9 36086");
//        Sellers sellers10 = new Sellers(R.drawable.kinnow, "R Syadev", "Quantity : 100 Tonnes(s)", "Contact : 9555641039","Price : \\u20B9 1200 - \\u20B9 1300");

        Buyers buyers2 = new Buyers(R.drawable.mustard, "Mustard", "Brahm", "Quantity : 500 Tonnes(s)","Grade : Abc","Contact : 9805310006", "Price : ₹ 250 Per Kilogram");
        Buyers buyers3 = new Buyers(R.drawable.mustard, "Mustard", "Harinder Singh Gill", "Quantity : 800 Tonnes(s)","Grade : good","Contact : 9770200100", "Price : ₹ 600 Per Quintal");
        Buyers buyers4 = new Buyers(R.drawable.mustard, "Mustard", "Harinder Singh Gill", "Quantity : 700 Tonnes(s)","Grade : good1","Contact : 9781300100", "Price : ₹ 900 Per Quintal");
        Buyers buyers5 = new Buyers(R.drawable.mustard, "Mustard", "Raj", "Quantity : 100 Tonnes(s)","Grade : Abc","Contact : 9990951167", "Price : ₹ 20 Per Kilogram");
        Buyers buyers6 = new Buyers(R.drawable.mustard, "Mustard", "Manoj Singh Rawal", "Quantity : 50 Tonnes(s)","Grade : B","Contact : 9990951167", "Price : ₹ 15 Per Kilogram");
        Buyers buyers7 = new Buyers(R.drawable.mustard, "Mustard", "Manpreet Singh", "Quantity : 250 Tonnes(s)","Grade : a","Contact : 6284833282", "Price : ₹ 2100 Per Quintal");
        Buyers buyers8 = new Buyers(R.drawable.mustard, "Mustard", "Gurkirat Singh", "Quantity : 15 Tonnes(s)","Grade : 3086 a","Contact : 7837661113", "Price : ₹ 15 Per Quintal");
        Buyers buyers9 = new Buyers(R.drawable.mustard, "Mustard", "Kulveer Singh", "Quantity : 1 Tonnes(s)","Grade :a","Contact : 9870071579", "Price : ₹ 4000 Per Quintal");
        Buyers buyers10 = new Buyers(R.drawable.mustard, "Mustard", "Karan Sihag", "Quantity : 1500 Tonnes(s)","Grade : First","Contact : 9430808043", "Price : ₹ 1200 Per Quintal");



        buyersList.add(buyers1); //0
        buyersList.add(buyers2);
        buyersList.add(buyers3);
        buyersList.add(buyers4);
        buyersList.add(buyers5); //4
        buyersList.add(buyers6);
        buyersList.add(buyers7);
        buyersList.add(buyers8);
        buyersList.add(buyers9);
        buyersList.add(buyers10);

        //newsList.add(new News(R.drawable.category,"NDTV","https://ndtv.india.com"));

        //newsAdapter = new NewsAdapter(this, R.layout.list_item, newsList);
        //listView.setAdapter(newsAdapter);

        //listView.setOnItemClickListener(this);

        recyclerAdapter = new BuyersRecyclerAdapter(this, R.layout.list_buyer, buyersList);

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
        Buyers buyers = buyersList.get(position);
        Intent intent = new Intent(AllBuyersActivity.this, WebViewSellersActivity.class);
        intent.putExtra("keyBuyers", buyers);
        startActivity(intent);

    }
}