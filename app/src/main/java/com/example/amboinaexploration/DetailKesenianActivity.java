package com.example.amboinaexploration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailKesenianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kesenian);

        ImageView imageViewKesenian = findViewById(R.id.imageViewKesenian);
        TextView textViewNamaKesenian = findViewById(R.id.textViewNamaKesenian);
        TextView textViewPenjelasanKesenian = findViewById(R.id.textViewPenjelasanKesenian);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String namaKesenian = extras.getString("nama_kesenian");
            int gambarKesenian = extras.getInt("gambar_kesenian");
            String penjelasanKesenian = extras.getString("penjelasan_kesenian");

            imageViewKesenian.setImageResource(gambarKesenian);
            textViewNamaKesenian.setText(namaKesenian);
            textViewPenjelasanKesenian.setText(penjelasanKesenian);
        }
    }
}