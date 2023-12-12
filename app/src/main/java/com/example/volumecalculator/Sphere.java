package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    TextView sphereTitle, result;
    EditText radius;
    Button sphereButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        radius = findViewById(R.id.editTextSphere);
        sphereTitle = findViewById(R.id.sphereTitle);
        result = findViewById(R.id.sphereResult);
        sphereButton = findViewById(R.id.sphereButton);

        sphereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rad = radius.getText().toString();
                int radiusInt = Integer.parseInt(rad);
                double volume = (4/3) * 3.14159 * radiusInt*radiusInt;
                result.setText("V = " + volume + " m^3");
            }
        });

    }
}