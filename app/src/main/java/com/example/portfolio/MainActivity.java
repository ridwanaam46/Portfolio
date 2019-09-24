package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button skillbtn, sertifbtn, aboutbtn, projectbtn;
HorizontalScrollView SCview, scview;
ImageView IG, WA, Linkedin, Github, drible;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skillbtn = findViewById(R.id.btnskill);
        SCview = findViewById(R.id.scrolview);
        IG = findViewById(R.id.img_ig);
        WA = findViewById(R.id.img_wa);
        Linkedin = findViewById(R.id.img_linkedin);
        Github = findViewById(R.id.img_github);
        sertifbtn = findViewById(R.id.btnsertif);
        aboutbtn = findViewById(R.id.about);
        projectbtn = findViewById(R.id.btnproject);
        drible = findViewById(R.id.img_drible);
        scview = findViewById(R.id.scsosmed);

        scview.setHorizontalScrollBarEnabled(false);

        drible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://dribbble.com/Ridwanaam");
                Intent webIntendrib = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntendrib);
            }
        });

        projectbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent project = new Intent(MainActivity.this, Project.class);
                startActivity(project);
                Toast.makeText(getApplicationContext(), "Kumpulan Project", Toast.LENGTH_SHORT).show();
            }
        });

        aboutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abouts = new Intent(MainActivity.this, about.class);
                startActivity(abouts);
                Toast.makeText(getApplicationContext(), "Find Me Here", Toast.LENGTH_SHORT).show();
            }
        });

        sertifbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sertif = new Intent(MainActivity.this, Certificaton.class);
                startActivity(sertif);
                Toast.makeText(getApplicationContext(), "Kumpulan Sertifikasi yang diperoleh", Toast.LENGTH_SHORT).show();
            }
        });

        IG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.instagram.com/ridwanaam/?hl=id");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        WA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel:081270681704");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

        Linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.linkedin.com/in/muhammad-ridwan-559634148/");
                Intent webIntentlink = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntentlink);
            }
        });

        Github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://github.com/ridwanaam46");
                Intent webIntengit = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntengit);
            }
        });
        SCview.setHorizontalScrollBarEnabled(false);

        skillbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ser = new Intent(MainActivity.this, Skill.class);
                startActivity(ser);
                Toast.makeText(getApplicationContext(), "Kumpulan Skill", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
