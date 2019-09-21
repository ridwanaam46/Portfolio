package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Project extends AppCompatActivity {
Button btnopendata, btnaset, btngadai, btnportfolio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        btnaset = findViewById(R.id.findaset);
        btngadai = findViewById(R.id.findgadai);
        btnopendata = findViewById(R.id.findopendata);
        btnportfolio = findViewById(R.id.findportofolio);

        btnopendata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Project Open Data belum di masukan", Toast.LENGTH_LONG).show();
            }
        });

        btnportfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Aplikasi ini adalah poject portfolio", Toast.LENGTH_LONG).show();
            }
        });

        btngadai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Project Gadai Online belum di masukan", Toast.LENGTH_LONG).show();
            }
        });

        btnaset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Project Aset belum di masukan", Toast.LENGTH_LONG).show();
            }
        });
    }
}
