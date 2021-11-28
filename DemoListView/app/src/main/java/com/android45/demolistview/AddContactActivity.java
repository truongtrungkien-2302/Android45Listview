package com.android45.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AddContactActivity extends AppCompatActivity {
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        tvName = findViewById(R.id.tvAddName);

        Intent intent = getIntent();

        String action  = intent.getStringExtra("action");

        tvName.setText(action );

        switch (action){
            case "add": String label = intent.getStringExtra("strLabel");
                tvName.setText(String.valueOf(label));
                break;
            case "view":
                int phone = intent.getIntExtra("phoneNumber", 0);
                tvName.setText(String.valueOf(phone));
                break;
        }
    }
}