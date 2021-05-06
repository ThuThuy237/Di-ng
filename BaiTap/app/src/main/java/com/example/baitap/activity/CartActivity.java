package com.example.baitap.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.baitap.R;
import com.example.baitap.adapter.CartAdapter;
import com.example.baitap.model.ModelProducts;

public class CartActivity extends AppCompatActivity {
    CartAdapter cartAdapter;

    ListView listViewProduct;
    Button btnPay, btnReset;
    ImageButton btnBack;
    TextView tvEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);

        mapping();
        tvEmpty.setVisibility(View.INVISIBLE);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartActivity.this, MainActivity.class));
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.cart.clear();
                tvEmpty.setVisibility(View.VISIBLE);
                cartAdapter.notifyDataSetChanged();
            }
        });
        MainActivity.cart.add(new ModelProducts(1,"áo khoác",1
                ,"https://cdn3.yame.vn/pimg/ao-thun-nam-y2010-basic-bf01-0019691/435b20ea-0323-1700-c5fe-001742e83abe.jpg?w=440",
                "Áo Khoác Classic Activewear M5 Màu Xám Trắng", (float) 200000, null,5,5,5,5));

        MainActivity.cart.add(new ModelProducts(1,"áo khoác",1
                ,"https://cdn3.yame.vn/pimg/ao-khoac-du-co-non-y2010-f04-0019699/98fdfb6e-0d53-0900-0600-0017214fa534.jpg?w=440",
                "Áo Khoác Classic Activewear M5 Màu Xám Trắng", (float) 200000, null,2,5,0,0));

        cartAdapter = new CartAdapter(MainActivity.cart);


        listViewProduct.setAdapter(cartAdapter);

    }


    private void mapping() {
        listViewProduct = findViewById(R.id.listproduct);
        btnBack = findViewById(R.id.backBtn);
        btnPay = findViewById(R.id.btnPay);
        btnReset = findViewById(R.id.btnReset);
        tvEmpty = findViewById(R.id.tv_Empty);
    }
}