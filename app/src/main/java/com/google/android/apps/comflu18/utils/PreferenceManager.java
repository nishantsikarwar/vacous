package com.google.android.apps.comflu18.utils;

import android.content.SharedPreferences;

import com.tale.prettysharedpreferences.BooleanEditor;
import com.tale.prettysharedpreferences.LongEditor;
import com.tale.prettysharedpreferences.PrettySharedPreferences;

public class PreferenceManager  extends PrettySharedPreferences {

    public PreferenceManager(SharedPreferences sharedPreferences) {
        super(sharedPreferences);
    }

    public BooleanEditor<PreferenceManager> favorite(String title) {
        return getBooleanEditor(title);
    }

    public LongEditor<PreferenceManager> openingApp() {
        return getLongEditor("nbOpening");
    }
}
