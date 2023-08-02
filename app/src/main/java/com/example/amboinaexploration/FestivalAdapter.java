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

public class FestivalAdapter extends ArrayAdapter<String> {

    private Context context;
    private HashMap<String, Festival> festivalData;

    public FestivalAdapter(Context context, ArrayList<String> festivalNames, HashMap<String, Festival> festivalData) {
        super(context, R.layout.list_item_festival, festivalNames);
        this.context = context;
        this.festivalData = festivalData;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item_festival, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.imageViewFestivalItem = convertView.findViewById(R.id.imageViewFestivalItem);
            viewHolder.textViewNamaFestivalItem = convertView.findViewById(R.id.textViewNamaFestivalItem);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        String festivalName = getItem(position);
        Festival festival = festivalData.get(festivalName);

        if (festival != null) {
            viewHolder.imageViewFestivalItem.setImageResource(festival.getImage());
            viewHolder.textViewNamaFestivalItem.setText(festival.getName());
        }

        return convertView;
    }

    private static class ViewHolder {
        ImageView imageViewFestivalItem;
        TextView textViewNamaFestivalItem;
    }
}
