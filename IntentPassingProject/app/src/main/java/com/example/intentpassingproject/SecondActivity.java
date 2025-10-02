package com.example.intentpassingproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        Intent fromAct = getIntent();

        String title = fromAct.getStringExtra("title");
        String name = fromAct.getStringExtra("name");
        int age = fromAct.getIntExtra("age", 0);

        TextView tvName;
        tvName = findViewById(R.id.tvName);
        tvName.setText("Name: "+name);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

    }
}