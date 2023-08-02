package com.example.amboinaexploration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBudayaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_budaya);

        ImageView imageViewBudaya = findViewById(R.id.imageViewBudaya);
        TextView textViewNamaBudaya = findViewById(R.id.textViewNamaBudaya);
        TextView textViewPenjelasanBudaya = findViewById(R.id.textViewPenjelasanBudaya);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String namaBudaya = extras.getString("nama_budaya");
            int gambarBudaya = extras.getInt("gambar_budaya");
            String penjelasanBudaya = extras.getString("penjelasan_budaya");

            imageViewBudaya.setImageResource(gambarBudaya);
            textViewNamaBudaya.setText(namaBudaya);
            textViewPenjelasanBudaya.setText(penjelasanBudaya);
        }
    }
}