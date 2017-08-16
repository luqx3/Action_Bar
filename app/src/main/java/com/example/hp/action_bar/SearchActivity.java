package com.example.hp.action_bar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by HP on 2017/8/16.
 */

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // 或者是下面的代码
        //getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}