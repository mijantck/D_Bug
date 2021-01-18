package com.mrsoftit.dbug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class galleryActivity extends AppCompatActivity {

    TextView view_all;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        view_all = findViewById(R.id.view_all);

        view_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(galleryActivity.this,galleryExpendActivity.class));
            }
        });

    }

}
