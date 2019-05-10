package com.roop.AgriKissan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.roop.AgriKissan.ui.AllBuyersActivity;
import com.roop.AgriKissan.ui.AllSellersActivity;
import com.roop.AgriKissan.ui.CropActivity;
import com.roop.AgriKissan.ui.ExpertsActivity;
import com.roop.AgriKissan.ui.LogoutActivity;
import com.roop.AgriKissan.ui.MyFragmentsActivity;
import com.roop.AgriKissan.ui.ProfileActivity;
import com.roop.AgriKissan.ui.RegistrationActivity;


public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView cropimage, weatherimage, expertimage, buyimage,sellimage, videoimage;
    TextView txtcrop,txtweather, txtexpert, txtbuy, txtsell, txtvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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

        sellimage = findViewById(R.id.seller);
        sellimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSellersActivity.class);
                startActivity(intent);
            }
        });

        txtcrop = findViewById(R.id.crop);
        txtcrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CropActivity.class);
                startActivity(intent);
            }
        });


        txtweather = findViewById(R.id.weathers);
        txtweather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        txtexpert = findViewById(R.id.experts);
        txtexpert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExpertsActivity.class);
                startActivity(intent);
            }
        });
        txtbuy = findViewById(R.id.buyer);
        txtbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllBuyersActivity.class);
                startActivity(intent);
            }
        });

        txtvideo = findViewById(R.id.videos);
        txtvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyFragmentsActivity.class);
                startActivity(intent);
            }
        });

        txtsell = findViewById(R.id.sellers);
        txtsell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSellersActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_call) {
            Intent intent = new Intent(HomeActivity.this, RegistrationActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_logout) {
            Intent intent = new Intent(HomeActivity.this, LogoutActivity.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_se) {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}