package com.insightsuen.uistyle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.insightsuen.base.view.BaseActivity;

/**
 * Created by InSight Suen on 2017/11/17.
 * Main Activity
 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }

    public void onClick(View v){
        if (v.isEnabled()) {
            // nothing
        }
    }
}
