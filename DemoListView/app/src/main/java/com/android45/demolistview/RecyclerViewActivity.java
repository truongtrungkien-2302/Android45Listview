package com.android45.demolistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ContactDemo> contactDemoList;
    ContactDemo contact01, contact02, contact03, contact04, contact05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.rvContact);

        contactDemoList = new ArrayList<>();
        contactDemoList.add(new ContactDemo("Android", 99999, true));
        contactDemoList.add(new ContactDemo("IOS", 88888, false));
        contactDemoList.add(new ContactDemo(".Net", 77777, true));
        contactDemoList.add(new ContactDemo("PHP", 66666, false));
        contactDemoList.add(new ContactDemo("Flutter", 55555, true));

    }
}