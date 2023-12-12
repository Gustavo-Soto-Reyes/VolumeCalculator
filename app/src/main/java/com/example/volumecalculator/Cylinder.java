package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    TextView result;
    EditText radius, height;
    Button calculateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        radius = findViewById(R.id.cylinderRadius);
        height = findViewById(R.id.cylinderHeight);
        result = findViewById(R.id.cylinderResult);
        calculateButton = findViewById(R.id.cylinderButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radiusVal = radius.getText().toString();
                String heightVal = radius.getText().toString();
                int radiusInt = Integer.parseInt(radiusVal);
                int heightInt = Integer.parseInt(heightVal);
                double volume = (radiusInt*radiusInt*3.14159*heightInt);
                result.setText("V = " + volume + " m^3");
            }
        });
    }
}