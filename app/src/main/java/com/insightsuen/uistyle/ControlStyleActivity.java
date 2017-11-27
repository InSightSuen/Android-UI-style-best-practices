package com.insightsuen.uistyle;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

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
        initView();
    }

    private void initView() {
        TypedArray ta = null;
        try {
            ta = getTheme().obtainStyledAttributes(R.styleable.AppCompatTheme);
            int color = ta.getColor(R.styleable.AppCompatTheme_colorControlNormal, -1);
            if (color != -1) {
                TextView tvControlNormal = findViewById(R.id.tv_control_normal);
                tvControlNormal.setBackgroundColor(color);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ta != null) {
                ta.recycle();
            }
        }
    }

    public void onClick(View view) {
        // ignored
    }
}
