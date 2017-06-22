package com.example.frank.paskutinis.dummy;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.frank.paskutinis.R;

import java.util.ArrayList;


public class MyCustomBaseAdapter extends BaseAdapter {
    private static ArrayList<SearchResults> searchArrayList;

    private LayoutInflater mInflater;

    public MyCustomBaseAdapter(Context context, ArrayList<SearchResults> results) {
        searchArrayList = results;
        mInflater = LayoutInflater.from(context);
    }

    public int getCount() {
        return searchArrayList.size();
    }

    public Object getItem(int position) {
        return searchArrayList.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.custom_row_view, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.name);
            holder.txtPrice = (TextView) convertView.findViewById(R.id.cityState);
            holder.txtProfit = (TextView) convertView.findViewById(R.id.phone);
            holder.photo = (ImageView) convertView.findViewById(R.id.photo);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtName.setText(searchArrayList.get(position).getName());
        holder.txtPrice.setText(searchArrayList.get(position).getPrice());
        holder.txtProfit.setText(searchArrayList.get(position).getPhone());
        holder.photo.setImageResource(searchArrayList.get(position).getPhoto());

        return convertView;
    }

    static class ViewHolder {

        ImageView photo;
        TextView txtName;
        TextView txtPrice;
        TextView txtProfit;
    }
}