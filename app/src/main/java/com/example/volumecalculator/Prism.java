package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    EditText length, width, height;
    TextView result;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        length = findViewById(R.id.prismLength);
        width = findViewById(R.id.prismWidth);
        height = findViewById(R.id.prismHeight);

        result = findViewById(R.id.prismResult);
        button = findViewById(R.id.prismButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lengthSize = length.getText().toString();
                String widthSize = width.getText().toString();
                String heightSize = height.getText().toString();

                int lengthInt = Integer.parseInt(lengthSize);
                int widthInt = Integer.parseInt(widthSize);
                int heightInt = Integer.parseInt(heightSize);
                double volume = (lengthInt*widthInt*heightInt);
                result.setText("V = " + volume + " m^3");
            }
        });

    }
}