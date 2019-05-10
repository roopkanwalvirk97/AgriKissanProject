package com.roop.AgriKissan;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class HomeDashboardActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home_dashboard);
//    }
//}

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.roop.AgriKissan.ui.AllBuyersActivity;
import com.roop.AgriKissan.ui.CropActivity;
import com.roop.AgriKissan.ui.ExpertsActivity;
import com.roop.AgriKissan.ui.MyFragmentsActivity;
import com.roop.AgriKissan.ui.RegistrationActivity;


public class HomeDashboardActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    ImageView cropimage, weatherimage, expertimage, buyimage, videoimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);
//        BottomNavigationView bottomNav = findViewById(R.id.bottomNnav);
//        bottomNav.setOnNavigationItemSelectedListener(navListener);
        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cropimage = findViewById(R.id.crops);
        cropimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CropActivity.class);
                startActivity(intent);
            }
        });


        weatherimage = findViewById(R.id.weather);
        weatherimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        expertimage = findViewById(R.id.expert);
        expertimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExpertsActivity.class);
                startActivity(intent);
            }
        });
        buyimage = findViewById(R.id.buy);
        buyimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllBuyersActivity.class);
                startActivity(intent);
            }
        });
        videoimage = findViewById(R.id.video);
        videoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyFragmentsActivity.class);
                startActivity(intent);
            }
        });
    }


    //    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
//            new BottomNavigationView.OnNavigationItemSelectedListener() {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                    switch (menuItem.getItemId()) {
//                        case R.id.navigation_home:
//                            Intent intent = new Intent(HomeDashboardActivity.this, RegistrationActivity.class);
//                            startActivity(intent);
//                            break;
//                        case R.id.se:
//                            Intent intent1 = new Intent(HomeDashboardActivity.this, CropActivity.class);
//                            startActivity(intent1);
//                            break;
//
//
//                    }
//                    return false;
//                }
//
//            };
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
