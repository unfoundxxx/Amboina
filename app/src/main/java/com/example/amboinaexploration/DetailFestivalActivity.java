package com.example.amboinaexploration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFestivalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_festival);

        ImageView imageViewFestival = findViewById(R.id.imageViewFestival);
        TextView textViewNamaFestival = findViewById(R.id.textViewNamaFestival);
        TextView textViewPenjelasanFestival = findViewById(R.id.textViewPenjelasanFestival);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String namaFestival = extras.getString("nama_festival");
            int gambarFestival = extras.getInt("gambar_festival");
            String penjelasanFestival = extras.getString("penjelasan_festival");

            imageViewFestival.setImageResource(gambarFestival);
            textViewNamaFestival.setText(namaFestival);
            textViewPenjelasanFestival.setText(penjelasanFestival);
        }
    }
}