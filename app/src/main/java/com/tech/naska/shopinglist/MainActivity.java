package com.tech.naska.shopinglist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ListData> mListData = new ArrayList<>() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Debug","=== create1 ===");

        createArray();

        Log.d("Debug","=== create2 ===" );

        final ListView listView = (ListView)findViewById(R.id.listView);

        Log.d("Debug","=== create3 ===");

        listView.setAdapter(new CustomItemAdapter(this, R.layout.shoping_row, mListData));

        Log.d("Debug","=== create4 ===" + mListData);

    }

    //表示する情報を生成
    void createArray(){
        for(int i = 0; i< 20 ; i++ ){
            final ListData listData = new ListData();
            listData.textItem = "アイテム名";
            //textPriceはintに変換する。
            listData.textPrice = "値段";
            listData.editText = "";
            mListData.add(listData);
        }
    }

}
