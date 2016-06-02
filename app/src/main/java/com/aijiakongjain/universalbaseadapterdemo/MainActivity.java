package com.aijiakongjain.universalbaseadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);
        List<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        assert listView != null;

        listView.setAdapter(new UniversalBaseAdapter<String>(this,data,R.layout.list_item) {
            @Override
            protected void convert(ViewHolder viewHolder, String item) {
                viewHolder.setText(R.id.textView,item);
            }
        });
    }
}
