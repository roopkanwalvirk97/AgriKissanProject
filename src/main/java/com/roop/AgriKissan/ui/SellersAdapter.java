package com.roop.AgriKissan.ui;

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

public class SellersAdapter extends ArrayAdapter<Sellers>{
    Context context;
    int resource;
    ArrayList<Sellers> objects;

    public SellersAdapter(Context context, int resource, ArrayList<Sellers> objects) {
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
        TextView txtName = view.findViewById(R.id.textViewName);
        TextView txtQuantity = view.findViewById(R.id.textViewQuantity);
        TextView txtContact= view.findViewById(R.id.textViewContact);
        TextView txtPrice = view.findViewById(R.id.textViewPrice);

        Sellers sellers  = objects.get(position);

        // Extracting Data from News Object and Setting the data on list_item
        imageView.setBackgroundResource(sellers.image);
        txtName.setText(sellers.name);
        txtQuantity.setText(sellers.quantity);
        txtContact.setText(sellers.contact);
        txtPrice.setText(sellers.price);

        return view;
    }

}

