package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeArray;

    MyCustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridAdapterView);
        shapeArray = new ArrayList<>();

        shapeArray.add(new Shape(R.drawable.sphere, "Sphere"));
        shapeArray.add(new Shape(R.drawable.cylinder, "Cylinder"));
        shapeArray.add(new Shape(R.drawable.cube, "Cube"));
        shapeArray.add(new Shape(R.drawable.prism, "Prism"));

        myAdapter = new MyCustomAdapter(getApplicationContext(), shapeArray);

        gridView.setAdapter(myAdapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;

                if (shapeArray.get(i).shapeText == "Sphere"){
                    intent = new Intent(getApplicationContext(), Sphere.class);
                } else if (shapeArray.get(i).shapeText == "Cylinder"){
                    intent = new Intent(getApplicationContext(), Cylinder.class);
                } else if (shapeArray.get(i).shapeText == "Cube"){
                    intent = new Intent(getApplicationContext(), Cube.class);
                } else if (shapeArray.get(i).shapeText == "Prism"){
                    intent = new Intent(getApplicationContext(), Prism.class);
                } else {
                    intent = new Intent(getApplicationContext(), MainActivity.class);
                }



                startActivity(intent);

            }
        });
    }
}