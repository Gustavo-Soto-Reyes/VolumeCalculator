package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {
     private ArrayList<Shape> shapeList;
     Context context;


    public MyCustomAdapter(@NonNull Context context, ArrayList<Shape> shapeList) {
        super(context, R.layout.grid_item, shapeList);
        this.shapeList = shapeList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape = getItem(position);
        ViewHolder vh;
        if (convertView == null){
            vh = new ViewHolder();
            LayoutInflater layinflate = LayoutInflater.from(getContext());
            convertView = layinflate.inflate(R.layout.grid_item, parent, false);
            vh.shapeName = (TextView) convertView.findViewById(R.id.textView);
            vh.shapeImage = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.shapeName.setText(shape.shapeText);
        vh.shapeImage.setImageResource(shape.shapeImageRes);

        return convertView;



    }

    private static class ViewHolder{
        TextView shapeName;
        ImageView shapeImage;

    }
}
