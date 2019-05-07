package com.roop.AgriKissan.ui;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.roop.AgriKissan.R;
//
//public class BuyersAdapter extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_buyers_adapter);
//    }
//}

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.roop.AgriKissan.R;

import java.util.ArrayList;
import java.util.List;

public class BuyersAdapter extends ArrayAdapter<Buyers>{
    Context context;
    int resource;
    ArrayList<Buyers> objects;

    public BuyersAdapter(Context context, int resource, ArrayList<Buyers> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // view is a ref var which is pointing to list_item
        View view = LayoutInflater.from(context).inflate(resource,parent,false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView txtCropName = view.findViewById(R.id.textViewCropName);
        TextView txtName = view.findViewById(R.id.textViewName);
        TextView txtQuantity = view.findViewById(R.id.textViewQuantity);
        TextView txtGrade = view.findViewById(R.id.textViewGrade);
        TextView txtContact= view.findViewById(R.id.textViewContact);
        TextView txtPrice = view.findViewById(R.id.textViewPrice);

        Buyers buyers  = objects.get(position);

        // Extracting Data from Buyers Object and Setting the data on list_buyers
        imageView.setBackgroundResource(buyers.image);
        txtCropName.setText(buyers.cropname);
        txtName.setText(buyers.name);
        txtQuantity.setText(buyers.quantity);
        txtGrade.setText(buyers.grade);
        txtContact.setText(buyers.contact);
        txtPrice.setText(buyers.price);

        return view;
    }

}

