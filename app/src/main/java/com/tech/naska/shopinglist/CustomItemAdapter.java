package com.tech.naska.shopinglist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by yuta on 2017/12/20.
 */

public class CustomItemAdapter extends ArrayAdapter<ListData>{

    private LayoutInflater mInflater;
    private int mItemLayoutResource;

    //コンストラクタ
    public CustomItemAdapter(Context context, int resource, List<ListData> objects){
        super(context, resource, objects);
        this.mInflater = (LayoutInflater.from(context));
        mItemLayoutResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent){
        final ItemLayout view;

        if(convertView == null){
            view = (ItemLayout) mInflater.inflate(mItemLayoutResource,null);
        }else {
            view = (ItemLayout) convertView;
        }

        view.bindView(getItem(position));

        return view;
    }
}
