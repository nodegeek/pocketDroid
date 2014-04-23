package com.example.myapplication.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Santhosh on 18/3/14.
 */
public class NewsArrayAdapter extends ArrayAdapter<NewsItem>{
    private final Context context;
    private final ArrayList<NewsItem> newsItemList;

    public NewsArrayAdapter(Context context, ArrayList<NewsItem> newsItemList){
        super(context, R.layout.activity_main,newsItemList);
        this.context = context;
        this.newsItemList = newsItemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = null;

        rowView = inflater.inflate(R.layout.activity_main, parent, false);
        ImageView thumnailImgView = (ImageView) rowView.findViewById(R.id.thumbnail);
        TextView  titleView =  (TextView) rowView.findViewById(R.id.main_title);
        ImageView logoView =   (ImageView)  rowView.findViewById(R.id.childView).findViewById(R.id.logo);;
        TextView sourceView  = (TextView) rowView.findViewById(R.id.childView).findViewById(R.id.newSourceTV);
        TextView timeView = (TextView)rowView.findViewById(R.id.childView).findViewById(R.id.time);

        thumnailImgView.setImageResource(newsItemList.get(position).getThumbnail());
        titleView.setText(newsItemList.get(position).getTitle());
        logoView.setImageResource(newsItemList.get(position).getLogo());
        sourceView.setText(newsItemList.get(position).getSource());



        return rowView;

    }
}