package com.insightsuen.uistyle;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.insightsuen.uistyle.base.UiStyleActivity;

/**
 * Created by InSight Suen on 2017/11/17.
 * Main Activity
 */

public class MainActivity extends UiStyleActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();
    }

    public void onClickTextStyle(View view) {
        TextStyleActivity.start(this);
    }

    public void onClickControlStyle(View view) {
        ControlStyleActivity.start(this);
    }

    public void onClickDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Dialog title")
                .setMessage("Dialog message")
                .setPositiveButton("OK", null)
                .setNegativeButton("Cancel", null);
        builder.show();
    }
}
