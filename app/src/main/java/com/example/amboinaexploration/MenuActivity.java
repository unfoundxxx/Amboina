package com.example.amboinaexploration;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ImageView ivMenu;
    private RecyclerView rvMenu;
    private MainDrawerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);

        textView.setText("Jelajahi keindahan Ambon");

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan aksi yang ingin Anda lakukan saat ImageView diklik
                // Misalnya, tampilkan pesan atau buka halaman baru
            }
        });

        findViewById(R.id.cardViewSejarah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, SejarahActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cardViewKuliner).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, KulinerActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cardViewBudaya).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, BudayaActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cardViewFestival).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, FestivalActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.cardViewWisata).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, WisataActivity.class);
                startActivity(intent);
            }
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        ivMenu = findViewById(R.id.imageView2);
        rvMenu = findViewById(R.id.rvMenu);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Home");
        arrayList.add("About");
        arrayList.add("Logout");

        ArrayList<Integer> image = new ArrayList<>();
        image.add(R.drawable.home);
        image.add(R.drawable.tentang);
        image.add(R.drawable.logout);

        adapter = new MainDrawerAdapter(this, arrayList, image);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.setAdapter(adapter);

        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }

    public static void closeDrawer(DrawerLayout drawerLayout) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    @Override
    public void onBackPressed() {
        // Tambahkan aksi yang ingin Anda lakukan saat tombol back ditekan
        // Misalnya, tampilkan dialog konfirmasi sebelum keluar dari aplikasi
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Keluar");
        builder.setMessage("Kamu Yakin Ingin Keluar Dari Aplikasi?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}
