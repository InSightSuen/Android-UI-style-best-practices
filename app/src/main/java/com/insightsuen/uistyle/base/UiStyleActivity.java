package com.insightsuen.uistyle.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.insightsuen.base.view.BaseActivity;
import com.insightsuen.uistyle.R;
import com.insightsuen.uistyle.util.ConfigUtil;

/**
 * Created by InSight Suen on 2017/11/23.
 * App base activity
 */

public abstract class UiStyleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initTheme();
        super.onCreate(savedInstanceState);
    }

    protected void initToolBar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            Switch swColorfulTheme = toolbar.findViewById(R.id.sw_colorful);
            if (swColorfulTheme != null) {
                swColorfulTheme.setChecked(ConfigUtil.getAppTheme(this) == ConfigUtil.THEME_COLORFUL);
                swColorfulTheme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        changeTheme(isChecked);
                    }
                });
            }
            setSupportActionBar(toolbar);
        }
    }

    private void initTheme() {
        int theme = ConfigUtil.getAppTheme(this);
        switch (theme) {
            case ConfigUtil.THEME_DEFAULT:
                setTheme(R.style.AppTheme);
                break;
            case ConfigUtil.THEME_COLORFUL:
                setTheme(R.style.AppTheme_Colorful);
                break;
            case ConfigUtil.THEME_IDLE:
            default:
                setTheme(R.style.AppTheme);
                break;

        }
    }

    private void changeTheme(boolean useColorfulTheme) {
        int currentTheme = ConfigUtil.getAppTheme(UiStyleActivity.this);
        int newTheme = useColorfulTheme ? ConfigUtil.THEME_COLORFUL : ConfigUtil.THEME_DEFAULT;
        if (currentTheme != newTheme) {
            ConfigUtil.saveAppTheme(UiStyleActivity.this, newTheme);
            recreate();
        }
    }
}
