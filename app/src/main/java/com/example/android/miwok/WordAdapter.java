package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private  int mcolor;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words,int color) {
        super(context,0 ,words);
        mcolor=color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentitem = getItem(position);
        View listview = convertView;
        if(listview == null)
        {
            listview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        TextView miwoktr = (TextView) listview.findViewById(R.id.miwok_text);
        TextView defaulttr = (TextView) listview.findViewById(R.id.default_text);
        ImageView img = (ImageView) listview.findViewById(R.id.imageView);
        miwoktr.setText(currentitem.getMiwokTranslation());
        defaulttr.setText(currentitem.getDefaultTranslation());
        if(currentitem.hasimage())
        {
            img.setImageResource(currentitem.getImage());
            img.setVisibility(View.VISIBLE);
        }
        else{
            img.setVisibility(View.GONE);
        }
        View layout = listview.findViewById(R.id.layout);
        int color= ContextCompat.getColor(getContext(),mcolor);
        layout.setBackgroundColor(color);
        return listview;
    }
}
