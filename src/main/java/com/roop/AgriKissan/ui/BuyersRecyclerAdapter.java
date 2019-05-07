package com.roop.AgriKissan.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import com.roop.AgriKissan.R;

public class BuyersRecyclerAdapter extends RecyclerView.Adapter<BuyersRecyclerAdapter.ViewHolder> {

    Context context;
    int resource;
    ArrayList<Buyers> objects;

    public BuyersRecyclerAdapter(Context context, int resource, ArrayList<Buyers> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(resource,parent,false);
        ViewHolder holder = new ViewHolder(view);
         return  holder;
    }



    @Override
    public void onBindViewHolder(@NonNull BuyersRecyclerAdapter.ViewHolder holder, int position) {

        Buyers buyers = objects.get(position);

        // Extracting Data from Sellers Object and Setting the data on list_item
        holder.imageView.setBackgroundResource(buyers.image);
        holder.txtCropName.setText(buyers.cropname);
        holder.txtName.setText(buyers.name);
        holder.txtQuantity.setText(buyers.quantity);
        holder.txtGrade.setText(buyers.grade);
        holder.txtContact.setText(buyers.contact);
        holder.txtPrice.setText(buyers.price);
    }

//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_buyers_recycler_adapter);
//    }
//}

    @Override
    public int getItemCount() {
        return objects.size(); // how many list items we wish to have in our recycler view
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        // Attributes of ViewHolder
        ImageView imageView;
        TextView txtCropName;
        TextView txtName;
        TextView txtQuantity;
        TextView txtGrade;
        TextView txtContact;
        TextView txtPrice;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            txtCropName = itemView.findViewById(R.id.textViewCropName);
            txtName = itemView.findViewById(R.id.textViewName);
            txtQuantity = itemView.findViewById(R.id.textViewQuantity);
            txtGrade =  itemView.findViewById(R.id.textViewGrade);
            txtContact = itemView.findViewById(R.id.textViewContact);
            txtPrice =itemView.findViewById(R.id.textViewPrice);
        }
    }

}