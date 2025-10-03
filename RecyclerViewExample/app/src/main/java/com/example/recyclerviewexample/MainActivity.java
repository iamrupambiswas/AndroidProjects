package com.example.recyclerviewexample;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    RecyclerView recyclerContact;
    RecyclerContactAdapter adapter;
    FloatingActionButton btnOpenDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerContact = findViewById(R.id.recyclerContact);
        recyclerContact.setLayoutManager(new LinearLayoutManager(this));
        btnOpenDialog = findViewById(R.id.btnOpenDialog);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_layout);

                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name = "", number = "";

                        if(!edtName.getText().toString().isEmpty()) {
                            name = edtName.getText().toString();
                        } else {
                            Toast.makeText(MainActivity.this, "Please enter contact name!", Toast.LENGTH_SHORT).show();
                        }

                        if(!edtNumber.getText().toString().isEmpty()) {
                            number = edtNumber.getText().toString();
                        } else {
                            Toast.makeText(MainActivity.this, "Please enter contact number!", Toast.LENGTH_SHORT).show();
                        }

                        arrContacts.add(new ContactModel(name, number));
                        adapter.notifyItemInserted(arrContacts.size()-1);
                        recyclerContact.scrollToPosition(arrContacts.size()-1);
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "A", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "B", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "C", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "D", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "E", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "F", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "G", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "H", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "I", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "J", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "K", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "L", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "M", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "M", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "N", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "O", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "P", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "Q", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "R", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "S", "9999999999"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_background, "T", "9999999999"));

        adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerContact.setAdapter(adapter);

    }
}