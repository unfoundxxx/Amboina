package com.example.amboinaexploration;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class KesenianActivity extends AppCompatActivity {

    private ListView listViewKesenian;
    private HashMap<String, Kesenian> kesenianData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesenian);

        listViewKesenian = findViewById(R.id.listViewKesenian);
        kesenianData = getKesenianData();

        ArrayList<String> kesenianNames = new ArrayList<>(kesenianData.keySet());
        KesenianAdapter adapter = new KesenianAdapter(this, kesenianNames, kesenianData);
        listViewKesenian.setAdapter(adapter);

        listViewKesenian.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String kesenianName = kesenianNames.get(position);
                Kesenian kesenian = kesenianData.get(kesenianName);

                Intent intent = new Intent(KesenianActivity.this, DetailKesenianActivity.class);
                intent.putExtra("nama_kesenian", kesenian.getName());
                intent.putExtra("gambar_kesenian", kesenian.getImage());
                intent.putExtra("penjelasan_kesenian", kesenian.getDescription());
                startActivity(intent);
            }
        });
    }

    private HashMap<String, Kesenian> getKesenianData() {
        HashMap<String, Kesenian> data = new HashMap<>();
        data.put("Tari Cakalele",  new Kesenian("Tari Cakalele", R.drawable.tari_cakalele, "Cakalele adalah tarian tradisional khas dari Maluku, Indonesia, yang memiliki makna dan nilai budaya yang mendalam. Tarian ini biasanya dipertunjukkan oleh kelompok penari pria dan wanita yang berkolaborasi secara harmonis untuk menciptakan gerakan yang energetik dan mengesankan.\n\nTarian Cakalele sering dijadikan bagian dari upacara adat, perayaan penting, atau acara penyambutan tamu istimewa. Selain itu, tarian ini juga dapat menjadi bagian dari kegiatan seni dan budaya untuk mengenang sejarah atau menghormati leluhur.\n\nDalam pertunjukan Cakalele, penari akan mengenakan kostum yang khas dan mencolok dengan warna-warna cerah seperti putih, kuning, dan merah. Kostum ini sering kali dihiasi dengan hiasan tradisional dan aksesoris khas daerah.\n\nIringan musik sangat penting dalam tarian ini. Alat musik yang umum digunakan adalah tifa, yaitu jenis gendang tradisional, bia yang merupakan jenis alat musik tiup, dan suling sebagai alat musik tiup lainnya. Ritme dan melodi yang dimainkan oleh alat musik ini mengiringi gerakan para penari, menciptakan atmosfer yang semakin memikat para penonton.\n\nPara penari pria biasanya membawa properti berupa parang dan tameng yang merupakan simbol keberanian dan kekuatan dalam konteks tarian perang. Properti ini digunakan untuk menambah kesan dramatis dan menggambarkan semangat perjuangan dalam tarian.\n\nSementara itu, para penari wanita memiliki peran yang berbeda dengan memegang sapu tangan di kedua sisi tangan mereka. Gerakan yang dilakukan dengan sapu tangan ini menambah kesan indah dan anggun dalam tarian, menciptakan harmoni antara gerakan pria dan wanita.\n\nCakalele bukan hanya sekedar tarian hiburan semata, tetapi juga mengandung makna dan pesan moral yang terkandung di dalamnya. Tarian ini mencerminkan semangat persatuan, kebersamaan, dan semangat juang dalam menghadapi tantangan, serta memperingati nilai-nilai keberanian dan kehormatan para leluhur.\n\nDengan gerakan yang penuh semangat dan kekuatan, serta iringan musik yang menggema, Cakalele menjadi sebuah tarian yang memukau dan membangkitkan rasa kebanggaan akan warisan budaya Indonesia Timur khususnya Ambon."));
        data.put("Tari Bambu Gila",  new Kesenian("Tari Bambu Gila", R.drawable.bambu_gila, "Tari Bambu Gila, juga dikenal sebagai Tari Bulu Gila, merupakan tarian asli dari Maluku, khususnya kota Ambon. Tarian ini telah ada sejak masa penjajahan Portugis di masa lalu. Tarian ini memang bernuansa mistis dengan melibatkan adanya roh halus yang diyakini akan menggerakkan sebatang bambu panjang yang dibawa oleh tujuh orang dewasa.\n\nTari Bambu Gila pada dasarnya memiliki tingkat kesulitan yang tinggi. Oleh karena itu, setiap penampilannya memerlukan dukun pembaca mantera yang berperan untuk mengundang roh halus dan menjaga agar roh tersebut tetap di bawah kendali para penari. Sang dukun biasanya membawa wadah berisi kemenyan sebagai media untuk menghadirkan roh halus. Bahkan, dalam beberapa atraksi, beberapa penari Bambu Gila bisa kesurupan atau kehilangan kesadaran. Dalam situasi seperti ini, peran sang dukun menjadi sangat penting.\n\nDalam tarian Bambu Gila yang dimodifikasi, nuansa mistis sudah tidak ditemukan lagi. Meskipun kehadiran roh halus merupakan elemen menarik dari tarian ini, makna sebenarnya dari tarian ini bukanlah hal-hal gaib di dalamnya. Sebagai gantinya, gerakan para penari yang mengendalikan bambu secara magis menjadi simbol nilai kebersamaan yang harus dijaga bersama. Gerakan serempak dengan kekuatan menunjukkan semangat gotong royong dalam kehidupan masyarakat Ambon.\n\nTari Bambu Gila sekarang sudah menjadi tarian langka, bahkan di wilayah Ambon sendiri. Hanya ada beberapa tempat di Ambon yang mampu mempertahankan tarian ini secara otentik. Namun, banyak sanggar tari di Ambon yang telah mempelajari dan menyajikan inti dari tarian ini dalam bentuk yang lebih modern. Biasanya, tarian ini dipentaskan sebagai tarian penyambutan tamu atau sebagai hiburan dalam berbagai acara formal. Bambu Gila merupakan identitas khas masyarakat Ambon yang tidak akan ditemukan di wilayah Nusantara lainnya. Lewat tarian ini, semakin jelas bahwa Indonesia adalah negeri yang kaya akan budaya dan seni yang unik."));
        data.put("Tari Lenso", new Kesenian("Tari Lenso", R.drawable.tari_tifa_lenso, "Tari Lenso adalah sebuah tarian yang cukup terkenal di Maluku, khususnya di kota Ambon. Tarian ini merupakan wujud dari perpaduan budaya yang telah mengalami perkembangan sejak masa penjajahan Portugis dan Belanda di Maluku. Nama \"lenso\" sendiri berasal dari bahasa Portugis yang berarti sapu tangan, yang merupakan ciri khas dari tarian ini.\n\nTari Lenso saat ini sering ditampilkan dalam berbagai acara yang bersifat adat, hiburan, dan pertunjukan seni budaya. Sejarah perkembangan tari ini dipengaruhi oleh budaya asing selama beratus-ratus tahun yang lalu. Awalnya, tari Lenso diperkenalkan oleh bangsa Portugis. Namun, pada masa penjajahan Belanda, tarian ini menjadi lebih populer dan ditampilkan di depan masyarakat dalam pesta rakyat yang dibuat oleh Belanda pada perayaan ulang tahun Ratu Wihelmina pada tanggal 31 Agustus 1612 di Ambon.\n\nTarian Lenso memiliki nuansa mistis dan dilibatkan roh halus yang diyakini akan menggerakkan batang bambu panjang yang dibawa oleh tujuh penari dewasa. Namun, seiring dengan berjalannya waktu, banyak tarian Lenso yang mengalami modifikasi dan tidak lagi menggunakan elemen mistis dengan roh halus dalam pertunjukannya. Biasanya, tarian modifikasi ini melibatkan batang bambu yang lebih pendek dan penari sebagian besar adalah wanita yang memegang sapu tangan.\n\nMeskipun beberapa elemen mistis telah dihilangkan dari tarian ini, Tari Lenso tetap menghadirkan keindahan gerakan dan nilai-nilai budaya dari masa lampau. Kesenian ini menjadi bagian penting dalam melestarikan warisan budaya Ambon dan mengenalkannya kepada generasi muda."));
        data.put("Tari Katreji", new Kesenian("Tari Katreji", R.drawable.tari_katreji, "Tari Katreji merupakan salah satu tarian tradisional yang terkenal di Ambon, Maluku. Tarian ini sering dipentaskan pada acara-acara besar seperti pernikahan adat, penyambutan tamu, serta upacara pelantikan Kepala Desa, Gubernur, dan Bupati di Ambon.\n\nTari Katreji memiliki keunikan tersendiri dibandingkan dengan tari-tari tradisional lainnya di Ambon, Maluku. Hal ini karena tarian ini merupakan hasil perpaduan dua budaya, yaitu budaya Eropa (Belanda dan Portugis) dengan budaya Maluku.\n\nTarian Katreji dilakukan oleh sekitar 12 penari pria dan wanita yang berpasangan dengan ekspresi ceria dan penuh semangat. Para penari tersebut tentunya mengenakan kostum tradisional Maluku, di mana wanita mengenakan kebaya dan rok panjang, sementara pria mengenakan baju dan celana berwarna putih, sesuai dengan tradisi tarian di Ambon.\n\nTarian ini memiliki makna sebagai tarian pergaulan dalam masyarakat, terutama di kalangan muda-mudi di Ambon. Tarian Katreji ditampilkan dengan ekspresi yang ceria dan penuh semangat, mencerminkan kegembiraan dan keceriaan para penarinya dalam lingkungan budaya Ambon. Tarian ini menjadi simbol dari kebersamaan dan kegembiraan dalam masyarakat Ambon, serta menjadi bagian penting dari warisan budaya dan seni tradisional di daerah tersebut."));


        return data;
    }
}
