package com.insightsuen.uistyle.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by InSight Suen on 2017/11/23.
 * 应用配置工具类
 */

public final class ConfigUtil {

    public static final int THEME_IDLE = -1;
    public static final int THEME_DEFAULT = 0;
    public static final int THEME_COLORFUL = 1;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({THEME_IDLE, THEME_DEFAULT, THEME_COLORFUL})
    public @interface Theme {}

    private static final String NAME_APP_CONFIG = "AppConfig";
    private static final String KEY_APP_THEME = "AppTheme";

    private static @Theme int sTheme = THEME_IDLE;

    @Theme
    public static int getAppTheme(@NonNull Context context) {
        if (sTheme > -1) {
            return sTheme;
        }
        SharedPreferences sp = context.getSharedPreferences(NAME_APP_CONFIG, Context.MODE_PRIVATE);
        int theme = sp.getInt(KEY_APP_THEME, THEME_DEFAULT);
        sTheme = getCanonicalTheme(theme);
        return sTheme;
    }

    public static void saveAppTheme(@NonNull Context context, @Theme int theme) {
        int canonicalTheme = getCanonicalTheme(theme);
        if (sTheme != canonicalTheme) {
            sTheme = canonicalTheme;
            SharedPreferences.Editor editor = context.getSharedPreferences(NAME_APP_CONFIG, Context.MODE_PRIVATE).edit();
            editor.putInt(KEY_APP_THEME, sTheme);
            editor.apply();
        }
    }

    @Theme
    private static int getCanonicalTheme(int theme) {
        switch (theme) {
            case THEME_DEFAULT: return THEME_DEFAULT;
            case THEME_COLORFUL: return THEME_COLORFUL;
            default: return THEME_DEFAULT;
        }
    }

}
