package com.android45.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    List<ContactDemo> contactDemoList;
    ContactDemo contact01, contact02, contact03, contact04, contact05;

    RelativeLayout btnAdd;

    ImageButton imgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lvContact);
        btnAdd = findViewById(R.id.btnAdd);

        contactDemoList = new ArrayList<>();
        contactDemoList.add(new ContactDemo("Android", 99999, true));
        contactDemoList.add(new ContactDemo("IOS", 88888, false));
        contactDemoList.add(new ContactDemo(".Net", 77777, true));
        contactDemoList.add(new ContactDemo("PHP", 66666, false));
        contactDemoList.add(new ContactDemo("Flutter", 55555, true));

        AdapterContact adapterContact = new AdapterContact(contactDemoList);

        lvContact.setAdapter(adapterContact);
        Intent intent = new Intent(getBaseContext(), AddContactActivity.class);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("KeyName", "Android Studio");
                startActivity(intent);
            }
        });

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ContactDemo contactDemo = contactDemoList.get(i);
                intent.putExtra("phoneNumber", contactDemo.getPhoneNumber());
                startActivity(intent);
            }
        });

//        imgBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                intent.putExtra("action", "add");
//                intent.putExtra("strLabel", "Name");
//                startActivity(intent);
//            }
//        });
//
//        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                intent.putExtra("action", "view");
//                intent.putExtra("phoneNumber", contactDemoList.get(i).getPhoneNumber());
//                startActivity(intent);
//            }
//        });

    }
}