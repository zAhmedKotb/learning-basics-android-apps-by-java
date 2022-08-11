package com.abokotb.baisicandroidlearn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ItemsAdapter extends ArrayAdapter {
   Context adapterContect;
   int adapterResoerce;
   Item[] adapterItems;


    public ItemsAdapter( Context context, int resource, Item[] objects) {
        super(context, resource, objects);

        adapterContect = context;
        adapterResoerce = resource;
        adapterItems = objects;

    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View row ;
        LayoutInflater rowInflater = LayoutInflater.from(adapterContect);
        row=rowInflater.inflate(adapterResoerce,parent,false);
        TextView titel = (TextView) row.findViewById(R.id.textView);
        ImageView logoTitel = (ImageView) row.findViewById(R.id.image_titl);
        ImageView entTitel = (ImageView) row.findViewById(R.id.ent_titl);

        Item items = adapterItems[position];
        titel.setText(items.itemName);

            int imageId = adapterContect.getResources().getIdentifier(items.logoDis,"drawable",adapterContect.getPackageName());
        logoTitel.setImageResource(imageId);
        int imageId2 = adapterContect.getResources().getIdentifier(items.logoEnt,"drawable",adapterContect.getPackageName());
        entTitel.setImageResource(imageId2);



        return row;
    }
}
