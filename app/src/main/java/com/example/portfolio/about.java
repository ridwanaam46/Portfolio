package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

public class about extends AppCompatActivity {
    HorizontalScrollView SCview;
    Button cvbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        SCview = findViewById(R.id.scrolviewabout);
        SCview.setHorizontalScrollBarEnabled(false);
        cvbtn = findViewById(R.id.btncv);

        cvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://drive.google.com/drive/folders/1YEhtzfDKerT2U6Y9Pt8xmGZM0F5ALjQn6");
                Intent webIntencv = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntencv);
            }
        });
    }
}
