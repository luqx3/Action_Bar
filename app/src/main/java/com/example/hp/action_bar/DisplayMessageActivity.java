package com.example.hp.action_bar;

import android.os.Bundle;

/**
 * Created by HP on 2017/8/16.
 */

public class DisplayMessageActivity extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymessage);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // 如果你的minSdkVersion属性是11活更高, 应该这么用:
         getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
