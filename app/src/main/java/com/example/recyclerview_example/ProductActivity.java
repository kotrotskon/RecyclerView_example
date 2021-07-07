package com.example.recyclerview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        TextView txtVw_title = findViewById(R.id.txtVw_title);
        txtVw_title.setText(getIntent().getExtras().getString("title", ""));

    }
}