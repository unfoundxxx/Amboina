package com.example.amboinaexploration;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class FestivalActivity extends AppCompatActivity {

    private ListView listViewFestival;
    private HashMap<String, Festival> festivalData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival);

        listViewFestival = findViewById(R.id.listViewFestival);
        festivalData = getFestivalData();

        ArrayList<String> festivalNames = new ArrayList<>(festivalData.keySet());
        FestivalAdapter adapter = new FestivalAdapter(this, festivalNames, festivalData);
        listViewFestival.setAdapter(adapter);

        listViewFestival.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String festivalName = festivalNames.get(position);
                Festival festival = festivalData.get(festivalName);

                Intent intent = new Intent(FestivalActivity.this, DetailFestivalActivity.class);
                intent.putExtra("nama_festival", festival.getName());
                intent.putExtra("gambar_festival", festival.getImage());
                intent.putExtra("penjelasan_festival", festival.getDescription());
                startActivity(intent);
            }
        });
    }


    private HashMap<String, Festival> getFestivalData() {
        HashMap<String, Festival> data = new HashMap<>();
        data.put("Festival Pattimura",  new Festival("Festival Pattimura", R.drawable.festival_pattimura, "Festival Pattimura merupakan perayaan yang sangat berarti di Ambon sebagai bentuk penghormatan dan kenangan kepada Pattimura, seorang pahlawan nasional yang berjuang melawan penjajah Belanda pada abad ke-18. Setiap tahun, festival ini digelar dengan berbagai rangkaian kegiatan, seperti upacara adat, pawai, pertunjukan seni, dan berbagai kompetisi budaya. Festival Pattimura menjadi momen yang penting untuk memupuk semangat patriotisme dan menghargai jasa-jasa pahlawan dari Maluku.\n\nTiap pelaksanaan festival ini, termasuk pada tanggal 13-15 Mei, memiliki nilai dan makna mendalam bagi masyarakat di Maluku. Festival-festival ini menjadi sarana penting untuk melestarikan dan menghormati warisan budaya dan sejarah suku-suku di Maluku, serta memperkuat identitas budaya yang khas dari masing-masing suku."));
        data.put("Festival Abda'u",  new Festival("Festival Abda'u", R.drawable.festival_abdau, "Festival Abda'u merupakan salah satu perayaan budaya lokal di Negeri Tulehu, Maluku, yang menggabungkan kulturisasi agama dan budaya. Festival ini merupakan bagian dari upacara perayaan Hari Raya Idul Adha yang melibatkan unsur-unsur tradisional suku Ambon dengan nilai-nilai keagamaan Islam.\n\nAbda'u merupakan bentuk kulturisasi agama dan budaya, di mana festival ini tidak hanya sekadar perayaan agama, tetapi juga mencerminkan kekayaan budaya dan adat istiadat suku Ambon. Parade budaya yang diselenggarakan setiap tahun pada Hari Raya Idul Adha ini menjadi momen yang menggambarkan harmoni antara tradisi agama Islam dengan kearifan lokal suku Ambon.\n\nDalam Festival Abda'u, terdapat beragam atraksi budaya seperti arak-arakan, hadrat, tarian Pattimura, dan atraksi Debus yang menunjukkan keberanian para pemuda. Tari Pattimura dengan sentuhan mistis dan atraksi Debus yang mengesankan dengan menusukkan benda tajam ke tubuh para pemuda, menunjukkan nilai-nilai keberanian dan kesetiaan terhadap tradisi leluhur, sambil tetap memegang teguh keyakinan agama mereka.\n\nTidak hanya itu, ada juga tradisi menggendong kambing sebelum disembelih yang menjadi simbol pengabdian dan penghormatan terhadap nilai-nilai keagamaan dalam perayaan Idul Adha. Para pemuda yang terlibat dalam Festival Abda'u dengan semangat berlomba merebut bendera hijau berenda kuning menunjukkan semangat persaudaraan dan kekompakan dalam budaya lokal.\n\nFestival Abda'u merupakan contoh nyata kulturisasi agama dan budaya yang harmonis, di mana nilai-nilai keagamaan dan kearifan lokal bersatu padu dalam perayaan yang meriah dan penuh kebahagiaan. Hal ini mencerminkan keragaman budaya Indonesia yang berakar pada tradisi leluhur dan nilai-nilai agama yang menguatkan kebersamaan dan keharmonisan masyarakat Ambon, Maluku."));
        data.put("Festival Pukul Sapu", new Festival("Festival Pukul Sapu", R.drawable.festival_pukul_sapu, "Sejak tahun 1646, tradisi Pukul Manyapu atau 'Palasa' atau 'Baku Pukul Manyapu' telah diwariskan dari generasi ke generasi dan menjadi perayaan rutin setiap tujuh hari setelah Lebaran. Dalam bahasa daerah Morella, masyarakat menyebutnya 'Palasa' atau 'Baku Pukul Manyapu', yang mengacu pada tradisi saling memukul dengan menggunakan sapu lidi. Perayaan tradisi ini melibatkan peserta, sebagian besar adalah pemuda dari Negeri Morella, yang dibagi menjadi dua kelompok atau regu. Setiap regu terdiri dari minimal 10 orang yang mengenakan celana pendek, bertelanjang dada, dan memiliki pengikat kepala merah yang disebut \"kain berang\".\n\nSebelum para pemuda tersebut memasuki area untuk melakukan Pukul Manyapu, mereka mengikuti ritual adat di baileo (rumah adat) yang dipimpin oleh para tua-tua adat."));
        data.put("Festival Lawapipi",  new Festival("Festival Lawapipi", R.drawable.festival_lawapipi, "Di Desa Negeri Hila, Kecamatan Leihitu, Kabupaten Maluku Tengah, terdapat sebuah tradisi unik yang diadakan setiap tahun dalam rangka menyambut Iduladha, yang disebut dengan festival lawa pipi. Tradisi ini berupa mengarak hewan kurban dan telah menjadi bagian dari kegiatan spiritual dan keagamaan masyarakat setempat selama berabad-abad.\n\nLawa pipi memiliki arti \"lari kambing\" dalam bahasa Hila. Tradisi ini biasanya dilaksanakan sehari setelah salat Iduladha. Kambing yang akan dijadikan kurban, yang disebut \"tema,\" dipilih dengan cermat dan biasanya berusia di atas 2 tahun serta tidak memiliki cacat.\n\nAcara dimulai ketika masyarakat berkumpul di rumah raja (rumah Tua Oolong) membawa hewan kurban. Di sana, mereka bersama-sama berdoa dan mengumandangkan takbir. 'Tema' sebagai hewan kurban akan ditempatkan di pintu masuk rumah raja, dan orang-orang yang datang akan mengusapkan uang atau dedaunan rempah-rempah kepadanya sebagai bentuk penolak sial.\n\nSelanjutnya, masyarakat mengarak hewan kurban dalam barisan yang dipimpin oleh seorang pemimpin barisan yang dijuluki 'mama biang' atau dukun beranak. Hewan kurban harus dipikul di atas bahu selama mengelilingi kampung sambil bersalawat.\n\nSetelah itu, para warga berlari mengelilingi Masjid Adat Hasan Sulaiman sebanyak tujuh kali, mirip seperti tawaf di Mekah. Tradisi lawa pipi ini tetap dilestarikan oleh masyarakat di Negeri Hila hingga saat ini, sehingga keunikan dan makna spiritual dari tradisi ini terus terjaga dan diwariskan dari generasi ke generasi."));

        return data;
    }

}