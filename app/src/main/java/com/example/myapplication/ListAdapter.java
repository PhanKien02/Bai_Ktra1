package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter  extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Singer> singers;

    public ListAdapter(Context context, int layout, List<Singer> singers) {
        this.context = context;
        this.layout = layout;
        this.singers = singers;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return singers.size();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.activity_item,null);
        TextView name = view.findViewById(R.id.name_item);
        TextView stageName = view.findViewById(R.id.stageName_item);
        TextView star = view.findViewById(R.id.star_item);
//        ImageView image = view.findViewById(R.id.image_item);

        Singer singer = singers.get(i);
        name.setText(singer.getName());
        stageName.setText(singer.getStageName());
        star.setText(singer.getStar());
//        image.setImageResource(singer.getImage());
        return view;
    }
}
