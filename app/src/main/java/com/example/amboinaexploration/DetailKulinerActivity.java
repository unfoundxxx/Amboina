package com.example.amboinaexploration;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailKulinerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuliner);

        ImageView imageViewKuliner = findViewById(R.id.imageViewKuliner);
        TextView textViewNamaKuliner = findViewById(R.id.textViewNamaKuliner);
        TextView textViewPenjelasanKuliner = findViewById(R.id.textViewPenjelasanKuliner);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String namaKuliner = extras.getString("nama_kuliner");
            int gambarKuliner = extras.getInt("gambar_kuliner");
            String penjelasanKuliner = extras.getString("penjelasan_kuliner");

            imageViewKuliner.setImageResource(gambarKuliner);
            textViewNamaKuliner.setText(namaKuliner);
            textViewPenjelasanKuliner.setText(penjelasanKuliner);
        }
    }
}
