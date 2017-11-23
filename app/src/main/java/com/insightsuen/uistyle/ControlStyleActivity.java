package com.insightsuen.uistyle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.insightsuen.uistyle.base.UiStyleActivity;

/**
 * Created by InSight Suen on 2017/11/21.
 * 控制控件样式 Activity
 */

public class ControlStyleActivity extends UiStyleActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, ControlStyleActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_style);
    }

    public void onClick(View view) {
        // ignored
    }
}
