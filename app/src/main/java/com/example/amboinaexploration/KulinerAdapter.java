package com.example.amboinaexploration;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amboinaexploration.R;

import java.util.ArrayList;
import java.util.HashMap;

public class KulinerAdapter extends ArrayAdapter<String> {
    private Context context;
    private HashMap<String, Kuliner> kulinerData;

    public KulinerAdapter(Context context, ArrayList<String> kulinerNames, HashMap<String, Kuliner> kulinerData) {
        super(context, R.layout.list_item_kuliner, kulinerNames);
        this.context = context;
        this.kulinerData = kulinerData;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item_kuliner, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.imageViewKulinerItem = convertView.findViewById(R.id.imageViewKulinerItem);
            viewHolder.textViewNamaKulinerItem = convertView.findViewById(R.id.textViewNamaKulinerItem);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        String kulinerName = getItem(position);
        Kuliner kuliner = kulinerData.get(kulinerName);

        if (kuliner != null) {
            viewHolder.imageViewKulinerItem.setImageResource(kuliner.getImage());
            viewHolder.textViewNamaKulinerItem.setText(kuliner.getName());
        }

        return convertView;
    }

    private static class ViewHolder {
        ImageView imageViewKulinerItem;
        TextView textViewNamaKulinerItem;
    }
}
