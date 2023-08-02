package com.example.amboinaexploration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class KesenianAdapter extends ArrayAdapter<String> {

    private Context context;
    private HashMap<String, Kesenian> kesenianData;

    public KesenianAdapter(Context context, ArrayList<String> kesenianNames, HashMap<String, Kesenian> kesenianData) {
        super(context, R.layout.list_item_kesenian, kesenianNames);
        this.context = context;
        this.kesenianData = kesenianData;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item_kesenian, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.imageViewKesenianItem = convertView.findViewById(R.id.imageViewKesenianItem);
            viewHolder.textViewNamaKesenianItem = convertView.findViewById(R.id.textViewNamaKesenianItem);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        String kesenianName = getItem(position);
        Kesenian kesenian = kesenianData.get(kesenianName);

        if (kesenian != null) {
            viewHolder.imageViewKesenianItem.setImageResource(kesenian.getImage());
            viewHolder.textViewNamaKesenianItem.setText(kesenian.getName());
        }

        return convertView;
    }

    private static class ViewHolder {
        ImageView imageViewKesenianItem;
        TextView textViewNamaKesenianItem;
    }
}
