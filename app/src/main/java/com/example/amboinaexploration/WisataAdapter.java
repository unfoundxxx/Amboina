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

public class WisataAdapter extends ArrayAdapter<String> {

    private Context context;
    private ArrayList<String> wisataNames;
    private HashMap<String, Wisata> wisataData;

    public WisataAdapter(Context context, ArrayList<String> wisataNames, HashMap<String, Wisata> wisataData) {
        super(context, R.layout.list_item_wisata, wisataNames);
        this.context = context;
        this.wisataNames = wisataNames;
        this.wisataData = wisataData;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_wisata, parent, false);
        }

        String wisataName = wisataNames.get(position);
        Wisata wisata = wisataData.get(wisataName);

        TextView textViewNamaWisata = convertView.findViewById(R.id.textViewNamaWisata);
        ImageView imageViewWisata = convertView.findViewById(R.id.imageViewWisata);

        textViewNamaWisata.setText(wisataName);
        imageViewWisata.setImageResource(wisata.getImage());

        return convertView;
    }
}
