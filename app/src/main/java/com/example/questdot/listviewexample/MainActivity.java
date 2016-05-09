package com.example.questdot.listviewexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;

        ListView listView = (ListView)findViewById(R.id.listView);

        MyListAdapter listAdapter = new MyListAdapter();

        listView.setAdapter(listAdapter);

    }

    class MyListAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            TextView view = null;
            if(convertView!=null){
                view =(TextView)convertView;
            }
            else{
                view = new TextView(context);
            }

            view.setText("position"+position);

            return view;
        }
    }
}
