package com.example.bmiproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight, edtHeightFt, edtHeightInch;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout llMain;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightft);
        edtHeightInch = findViewById(R.id.edtHeightInch);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.result);
        llMain = findViewById(R.id.main);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int htFt = Integer.parseInt(edtHeightFt.getText().toString());
                int htInch = Integer.parseInt(edtHeightInch.getText().toString());

                int totalInch = htFt*12 + htInch;
                double totalCm = totalInch*2.53;
                double totalM = totalCm/100;

                double bmi = wt/(totalM*totalM);

                if (bmi>25){
                    txtResult.setText("You are OverWeight!");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorOW));
                } else if(bmi<18) {
                    txtResult.setText("You're underweight!");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorUW));
                } else {
                    txtResult.setText("You are healthy!");
                    llMain.setBackgroundColor(getResources().getColor(R.color.colorH));
                }
            }
        });

    }
}