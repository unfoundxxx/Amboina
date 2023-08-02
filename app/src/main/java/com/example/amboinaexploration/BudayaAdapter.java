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

public class BudayaAdapter extends ArrayAdapter<String> {

    private Context context;
    private HashMap<String, Budaya> budayaData;

    public BudayaAdapter(Context context, ArrayList<String> budayaNames, HashMap<String, Budaya> budayaData) {
        super(context, R.layout.list_item_budaya, budayaNames);
        this.context = context;
        this.budayaData = budayaData;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.list_item_budaya, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.imageViewBudayaItem = convertView.findViewById(R.id.imageViewBudayaItem);
            viewHolder.textViewNamaBudayaItem = convertView.findViewById(R.id.textViewNamaBudayaItem);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        String budayaName = getItem(position);
        Budaya budaya = budayaData.get(budayaName);

        if (budaya != null) {
            viewHolder.imageViewBudayaItem.setImageResource(budaya.getImage());
            viewHolder.textViewNamaBudayaItem.setText(budaya.getName());
        }

        return convertView;
    }

    private static class ViewHolder {
        ImageView imageViewBudayaItem;
        TextView textViewNamaBudayaItem;
    }
}