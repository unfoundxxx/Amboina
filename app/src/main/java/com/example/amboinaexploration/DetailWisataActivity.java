package com.example.amboinaexploration;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
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
            double latitudeWisata = intent.getDoubleExtra("latitude_wisata", 0);
            double longitudeWisata = intent.getDoubleExtra("longitude_wisata", 0);

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
                    openGoogleMaps(latitudeWisata, longitudeWisata, namaWisata);
                }
            });
        }
    }

    private void openGoogleMaps(double latitude, double longitude, String label) {
        String uri = "geo:" + latitude + "," + longitude + "?q=" + Uri.encode(label);
        Uri gmmIntentUri = Uri.parse(uri);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else {
            // Tampilkan dialog untuk mengunduh aplikasi Google Maps
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Aplikasi Google Maps tidak terpasang. Apakah Anda ingin mengunduhnya dari Google Play Store?")
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // Buka Google Play Store untuk mengunduh aplikasi
                            Uri googlePlayStoreUri = Uri.parse("market://details?id=com.google.android.apps.maps");
                            Intent googlePlayStoreIntent = new Intent(Intent.ACTION_VIEW, googlePlayStoreUri);
                            startActivity(googlePlayStoreIntent);
                        }
                    })
                    .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // Tampilkan pesan bahwa aplikasi Google Maps tidak terpasang
                            Toast.makeText(DetailWisataActivity.this, "Aplikasi Google Maps tidak terpasang.", Toast.LENGTH_SHORT).show();
                        }
                    });
            // Tampilkan dialog
            builder.create().show();
        }
    }
}
