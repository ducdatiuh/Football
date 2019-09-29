package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FootballAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Football>footballList;

    public FootballAdapter(Context context, int layout, List<Football> footballList) {
        this.context = context;
        this.layout = layout;
        this.footballList = footballList;
    }

    @Override
    public int getCount() {
        return footballList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= inflater.inflate(layout,null);

        //anh sa
        TextView txtten= view.findViewById(R.id.ten);
        TextView txtuoi= view.findViewById(R.id.namsinh);
        ImageView imganh1= view.findViewById(R.id.anh1);
        ImageView imganh2= view.findViewById(R.id.anh2);

        //gan gia tri
        Football football = footballList.get(i);
        txtten.setText(football.getTen());
        txtuoi.setText(football.getNamsinh());
        imganh1.setImageResource(football.getAnh1());
        imganh2.setImageResource(football.getAnh2());


        return view;
    }
}
