package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ArrayList<Singer> singers;
    ListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView list_singer = findViewById(R.id.list_singer);
            singers = new ArrayList<>();
            singers.add(new Singer ("Trương Minh Hà","Thanh Hà"," người Mỹ gốc Việt",5,R.drawable.thanhha));
            singers.add(new Singer ("Mabel Alabama-Pearl McVey","Mabel "," người Anh",10,R.drawable.mabel));
            singers.add(new Singer ("Nguyễn Tuấn Hưng","Tuấn Hưng"," người Việt",5,R.drawable.tuanhung));
            singers.add(new Singer ("Trương Minh Hà","Thanh Hà"," người Mỹ gốc Việt",5,R.drawable.thanhha));
        adapter = new ListAdapter(ListActivity.this,R.layout.activity_item,singers);
        list_singer.setAdapter(adapter);
    }

}