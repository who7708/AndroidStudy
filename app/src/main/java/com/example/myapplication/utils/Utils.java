package com.example.myapplication.utils;

import android.content.Context;

/**
 * @author Chris
 * @version 1.0
 * @since 2022-12-28
 */
public class Utils {
    public static int dip2px(Context context, float dpValue) {
        // 获取当前手机的像素密度(1个dp对应多少px)
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (density * dpValue + 0.5);
    }
}
