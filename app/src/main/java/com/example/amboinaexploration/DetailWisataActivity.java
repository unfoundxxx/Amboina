package com.example.amboinaexploration;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailWisataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);

        Intent intent = getIntent();
        if (intent != null) {
            String namaWisata = intent.getStringExtra("nama_wisata");
            int gambarWisata = intent.getIntExtra("gambar_wisata", 0);
            String deskripsiWisata = intent.getStringExtra("deskripsi_wisata");
            String tempatWisata = intent.getStringExtra("tempat_wisata");

            ImageView imageViewWisata = findViewById(R.id.imageViewWisataDetail);
            TextView textViewNamaWisata = findViewById(R.id.textViewNamaWisataDetail);
            TextView textViewDeskripsiWisata = findViewById(R.id.textViewDeskripsiWisata);
            Button buttonViewOnMap = findViewById(R.id.buttonViewOnMap);

            imageViewWisata.setImageResource(gambarWisata);
            textViewNamaWisata.setText(namaWisata);
            textViewDeskripsiWisata.setText(deskripsiWisata);

            buttonViewOnMap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Buka Google Maps dengan lokasi tempat wisata
                    openGoogleMaps(tempatWisata);
                }
            });
        }
    }

    private void openGoogleMaps(String place) {
        Uri gmmIntentUri = Uri.parse(place);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }
}

