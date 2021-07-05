package com.example.recyclerview_example;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Product> products;

    public ProductAdapter(Context context,ArrayList<Product> products){
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.product_row, parent, false);
        MyViewHolder item = new MyViewHolder(row);
        return item;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MyViewHolder)holder).txtVw_id.setText(String.valueOf(products.get(position).getId()));
        ((MyViewHolder)holder).txtVw_title.setText(products.get(position).getTitle());
        ((MyViewHolder)holder).txtVw_description.setText(products.get(position).getDescription());
        ((MyViewHolder)holder).txtVw_price.setText(String.valueOf(products.get(position).getPrice()));
        Picasso.with(context).load("https://cdn.plaisio.gr/mms/Product-Images/PlaisioGr/3/5/9/8/4/1/1/3598411.jpg").resize(250, 250).
                centerCrop().into(((MyViewHolder)holder).imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtVw_title = view.findViewById(R.id.txtVw_title);
                Log.d("CLICK", txtVw_title.getText().toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtVw_id;
        TextView txtVw_title;
        TextView txtVw_description;
        TextView txtVw_price;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtVw_id = itemView.findViewById(R.id.txtVw_id);
            txtVw_title = itemView.findViewById(R.id.txtVw_title);
            txtVw_description = itemView.findViewById(R.id.txtVw_description);
            txtVw_price = itemView.findViewById(R.id.txtVw_price);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
