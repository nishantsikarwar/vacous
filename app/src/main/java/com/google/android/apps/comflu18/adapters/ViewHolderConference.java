package com.google.android.apps.comflu18.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.apps.comflu18.R;

public class ViewHolderConference extends RecyclerView.ViewHolder {

    TextView dateStart;
    TextView location;
    TextView headline;
    ImageView favorite;

    public ViewHolderConference(View v) {
        super(v);
        dateStart = (TextView) v.findViewById(R.id.dateStart);
        location = (TextView) v.findViewById(R.id.location);
        headline = (TextView) v.findViewById(R.id.headline);
        favorite = (ImageView) v.findViewById(R.id.favorite);
    }
}

