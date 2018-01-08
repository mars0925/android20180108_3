package com.mars.android20180108_3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String str [] = {"AAA","BBB","CCC","DDD"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter();
        lv.setAdapter(adapter);
    }

     class MyAdapter extends BaseAdapter
     {

         @Override
         //有幾個item要顯式
         public int getCount() {
             return str.length;
         }

         @Override
         public Object getItem(int i) {
             return null;
         }

         @Override
         public long getItemId(int i) {
             return 0;
         }

         @Override
         //position是item的索引值
         //getView指的是listitem裡面每一個列要放甚麼進去
         public View getView(int position, View view, ViewGroup viewGroup) {
             //裡面也可以放入自訂的layout
             //LayoutInflater inflater
             LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
             View v1 = inflater.inflate(R.layout.layout1,null);


             //TextView tv = new TextView(MainActivity.this);//創出一個TextvTEXTVIEW
             TextView tv = v1.findViewById(R.id.textView);//找到v1的textView);
             tv.setText(str[position]);//在textview顯示陣列的內容

             //tv.setText("Hello " + position);
             return v1;
         }
     }


}
