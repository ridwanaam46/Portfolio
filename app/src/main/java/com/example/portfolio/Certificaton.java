package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Certificaton extends AppCompatActivity {
    CardView dm, android, scrum, sap, scm100,scm300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificaton);

        dm = findViewById(R.id.carddm);
        android = findViewById(R.id.cardandroid);
        scrum = findViewById(R.id.cardscrum);
        sap = findViewById(R.id.cardsap);
        scm100 = findViewById(R.id.cardscm100);
        scm300 = findViewById(R.id.cardscm300);

        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Setifikasi Fundamental Digital Marketing yang di selenggarakan oleh google grage", Toast.LENGTH_LONG).show();
            }
        });
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Setifikasi Android yang di selenggarakan oleh Dicoding Academy", Toast.LENGTH_LONG).show();
            }
        });
        scrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Setifikasi Scrum yang di selenggarakan oleh Agile MAster Indonesia", Toast.LENGTH_LONG).show();
            }
        });
        sap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Setifikasi SAP Fundamental yang di selenggarakan oleh Edugate", Toast.LENGTH_LONG).show();
            }
        });
        scm100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Setifikasi SCM100 yang di selenggarakan oleh  Edugate", Toast.LENGTH_LONG).show();
            }
        });
        scm300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Setifikasi SCM300 yang di selenggarakan oleh  Edugate", Toast.LENGTH_LONG).show();
            }
        });
    }
}
