package com.android45.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    List<ContactDemo> contactDemoList;
    ContactDemo contact01, contact02, contact03, contact04, contact05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lvContact);

        contactDemoList = new ArrayList<>();

        contact01 = new ContactDemo("Android", 99999, true);
        contact02 = new ContactDemo("IOS", 88888, false);
        contact03 = new ContactDemo(".Net", 77777, true);
        contact04 = new ContactDemo("PHP", 66666, false);
        contact05 = new ContactDemo("Flutter", 55555, true);

        contactDemoList.add(contact01);
        contactDemoList.add(contact02);
        contactDemoList.add(contact03);
        contactDemoList.add(contact04);
        contactDemoList.add(contact05);

        AdapterContact adapterContact = new AdapterContact(contactDemoList);

        lvContact.setAdapter(adapterContact);

    }
}