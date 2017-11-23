package com.insightsuen.uistyle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.insightsuen.uistyle.base.UiStyleActivity;

/**
 * Created by InSight Suen on 2017/11/21.
 * 文字样式Activity
 */

public class TextStyleActivity extends UiStyleActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, TextStyleActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_style);
    }

}
