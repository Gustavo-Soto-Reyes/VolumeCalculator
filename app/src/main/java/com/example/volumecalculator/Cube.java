package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {
    TextView result;
    EditText edge;
    Button cubeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        edge = findViewById(R.id.editTextCube);
        result = findViewById(R.id.cubeResult);
        cubeButton = findViewById(R.id.cubeButton);

        cubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edgeSize = edge.getText().toString();
                int edgeSizeInt = Integer.parseInt(edgeSize);
                double volume = (edgeSizeInt*edgeSizeInt*edgeSizeInt);
                result.setText("V = " + volume + " m^3");
            }
        });
    }
}