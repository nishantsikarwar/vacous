package com.google.android.apps.comflu18.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.apps.comflu18.R;
import com.google.android.apps.comflu18.objects.AboutItem;

import java.util.List;

public class AboutAdapter extends ArrayAdapter<AboutItem> {

    public AboutAdapter(Context context, int resource, List<AboutItem> objects) {
        super(context, resource, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ViewHolder holder;
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.adapter_about, parent, false);

            holder = new ViewHolder();
            holder.title = (TextView) v.findViewById(R.id.title);
            holder.subtitle = (TextView) v.findViewById(R.id.subtitle);
            holder.image = (ImageView) v.findViewById(R.id.image);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }

        holder.title.setText(getItem(position).getTitle());
        holder.subtitle.setText(getItem(position).getSubtitle());
        holder.image.setImageResource(getItem(position).getDrawable());

        return v;
    }

    private class ViewHolder {
        TextView title;
        TextView subtitle;
        ImageView image;
    }
}
