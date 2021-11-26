package com.android45.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AddContactActivity extends AppCompatActivity {
    TextView tvName, tvPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        tvName = findViewById(R.id.tvAddName);
        tvPhoneNumber = findViewById(R.id.tvAddPhone);

        Intent intent = getIntent();

        String name = intent.getStringExtra("KeyName");
        int phone = intent.getIntExtra("phoneNumber",978149);

        tvName.setText(name);
        tvPhoneNumber.setText(String.valueOf(phone));
    }
}