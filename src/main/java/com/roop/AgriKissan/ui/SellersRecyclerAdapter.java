package com.roop.AgriKissan.ui;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//import com.roop.AgriKissan.R;
//
//public class SellersRecyclerAdapter extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sellers_recycler_adapter2);
//    }
//}

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
import com.roop.AgriKissan.R;

import java.util.ArrayList;

public class SellersRecyclerAdapter extends RecyclerView.Adapter<SellersRecyclerAdapter.ViewHolder> {

    Context context;
    int resource;
    ArrayList<Sellers> objects;

    public SellersRecyclerAdapter(Context context, int resource, ArrayList<Sellers> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(resource,parent,false);
        ViewHolder holder = new ViewHolder(view);



        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        Sellers sellers = objects.get(position);

        // Extracting Data from Sellers Object and Setting the data on list_item
        holder.imageView.setBackgroundResource(sellers.image);
        holder.txtCropName.setText(sellers.cropname);
        holder.txtName.setText(sellers.name);
        holder.txtQuantity.setText(sellers.quantity);
        holder.txtContact.setText(sellers.contact);
        holder.txtPrice.setText(sellers.price);
    }
    @Override
    public int getItemCount() {
        return objects.size(); // how many list items we wish to have in our recycler view
    }


    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sellers_adapter2);
//    }
//}
    class ViewHolder extends RecyclerView.ViewHolder{


        // Attributes of ViewHolder
        ImageView imageView;
        TextView txtCropName;
        TextView txtName;
        TextView txtQuantity;
        TextView txtContact;
        TextView txtPrice;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            txtCropName = itemView.findViewById(R.id.textViewCropName);
            txtName = itemView.findViewById(R.id.textViewName);
            txtQuantity = itemView.findViewById(R.id.textViewQuantity);
            txtContact = itemView.findViewById(R.id.textViewContact);
            txtPrice =itemView.findViewById(R.id.textViewPrice);
        }
    }

}