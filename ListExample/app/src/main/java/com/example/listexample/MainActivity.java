package com.example.listexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayNames = new ArrayList<>();
    Spinner spinner;
    ArrayList<String> arrayIds = new ArrayList<>();
    AutoCompleteTextView acTextView;
    ArrayList<String> arrLanguages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        acTextView = findViewById(R.id.actxtView);

        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");
        arrayNames.add("Tony Stark");
        arrayNames.add("Steve Rogers");
        arrayNames.add("Bruce Banner");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrayNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==4) {
                    Toast.makeText(getApplicationContext(), "You clicked 5th one!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        arrayIds.add("Aadhaar Card");
        arrayIds.add("Pan Card");
        arrayIds.add("Voter Card");
        arrayIds.add("Ration Card");

        ArrayAdapter<String> spinnerAdapter =  new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrayIds);
        spinner.setAdapter(spinnerAdapter);


        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("C#");
        arrLanguages.add("Python");
        arrLanguages.add("Java");
        arrLanguages.add("PHP");
        arrLanguages.add("JavaScript");

        ArrayAdapter<String> acTVAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrLanguages);
        acTextView.setAdapter(acTVAdapter);
        acTextView.setThreshold(2);



    }
}