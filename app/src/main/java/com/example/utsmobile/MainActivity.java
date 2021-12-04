package com.example.utsmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button biodata, koleksipakaian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        biodata = (Button) findViewById(R.id.biodata_btn);
        koleksipakaian = (Button) findViewById(R.id.koleksi_btn);


        biodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, BiodataDiriActivity.class);
                startActivity(intent);
            }
        });

        koleksipakaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KoleksiPakaianActivity.class);
                startActivity(intent);

            }
        });


    }
}