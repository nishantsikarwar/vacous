package com.google.android.apps.comflu18.utils;


import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;

//import com.android.internal.util.Predicate;
import com.google.android.apps.comflu18.objects.Conference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Utils {
    public static double getScreenDiagonal(final Context ctx) {
        if (ctx == null || ctx.getResources() == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        return Math.sqrt(Math.pow(displayMetrics.heightPixels, 2)
                + Math.pow(displayMetrics.widthPixels, 2));
    }
    public static int getScreenWidth(final Context ctx) {
        if (ctx == null || ctx.getResources() == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels;
    }
    public static int getScreenHeight(final Context ctx) {
        if (ctx == null || ctx.getResources() == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }
    public static int dpToPx(int dp, final Context ctx) {
        if (ctx == null || ctx.getResources() == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        return (int)(dp * (displayMetrics.densityDpi / 160f));
    }

    public static int pxToDp(int px, final Context ctx) {
        if (ctx == null || ctx.getResources() == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = ctx.getResources().getDisplayMetrics();
        return (int)(px / (displayMetrics.densityDpi / 160f));
    }

    public static boolean arrayContains(@NonNull String[] array, @NonNull String toFind) {
        for (String s: array) {
            if (s.contains(toFind)) {
                return true;
            }
        }
        return false;
    }

    public static <T> ArrayList<T> filter(Collection<T> target, Predicate<T> predicate) {
        ArrayList<T> result = new ArrayList<T>();
        for (T element: target) {
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static boolean isLollipop() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }
}
