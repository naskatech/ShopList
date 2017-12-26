package com.tech.naska.shopinglist;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by yuta on 2017/12/20.
 */

public class ItemLayout extends LinearLayout{
    TextView mTextItem;
    TextView mTextPrice;
    EditText mEditText;

    public ItemLayout(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    @Override
    protected void onFinishInflate(){
        super.onFinishInflate();

        mTextItem = (TextView)findViewById(R.id.textItem);
        mTextPrice = (TextView)findViewById(R.id.textPrice);
        mEditText = (EditText)findViewById(R.id.editText);

    }

    public void bindView(ListData item) {
        mTextItem.setText(item.textItem);
        mTextPrice.setText(item.textPrice);
        mEditText.setText(item.editText);
    }

}
