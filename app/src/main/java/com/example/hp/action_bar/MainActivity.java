package com.example.hp.action_bar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.more_action_button,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textview);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_item1:
                //click_func("action_item1");
                Intent intent=new Intent();
                intent.setClass(this,SearchActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_item2:
                click_func("action_item2");
                return true;
            case R.id.action_item3:
                click_func("action_item3");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    void click_func(String ID){
        textView.setText("you click the "+ID);
    }
}
