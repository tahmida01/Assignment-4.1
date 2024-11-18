package com.example.ListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.assignment41.R;

import java.util.ArrayList;

public class ShopAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ShopItem> items;

    public ShopAdapter(Context context, ArrayList<ShopItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        }

        ShopItem currentItem = (ShopItem) getItem(position);

        ImageView itemImage = convertView.findViewById(R.id.itemImage);
        TextView itemName = convertView.findViewById(R.id.itemName);
        TextView itemDescription = convertView.findViewById(R.id.itemDescription);

        itemImage.setImageResource(currentItem.getImageResId());
        itemName.setText(currentItem.getName());
        itemDescription.setText(currentItem.getDescription());

        return convertView;
    }
}