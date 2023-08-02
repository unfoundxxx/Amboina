package com.example.amboinaexploration;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.HashMap;

public class BudayaActivity extends AppCompatActivity {

    private ListView listViewBudaya;
    private HashMap<String, Budaya> budayaData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

        listViewBudaya = findViewById(R.id.listViewBudaya);
        budayaData = getBudayaData();

        ArrayList<String> budayaNames = new ArrayList<>(budayaData.keySet());
        BudayaAdapter adapter = new BudayaAdapter(this, budayaNames, budayaData);
        listViewBudaya.setAdapter(adapter);

        listViewBudaya.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String budayaName = budayaNames.get(position);
                Budaya budaya = budayaData.get(budayaName);

                Intent intent = new Intent(BudayaActivity.this, DetailKulinerActivity.class);
                intent.putExtra("nama_budaya", budaya.getName());
                intent.putExtra("gambar_budaya", budaya.getImage());
                intent.putExtra("penjelasan_budaya", budaya.getDescription());
                startActivity(intent);
            }
        });
    }


    private HashMap<String, Budaya> getBudayaData() {
        HashMap<String, Budaya> data = new HashMap<>();
        data.put("Suku Ambon",  new Budaya("Suku Ambon", R.drawable.suku_ambon,  "Suku Ambon, di antara suku-suku lain yang ada di wilayah Maluku, merupakan suku terbesar dan paling berpengaruh. Karena pengaruhnya yang signifikan, sering kali orang di Maluku keliru menganggap orang Ambon sebagai orang Maluku, padahal keduanya berasal dari suku yang berbeda. Suku Ambon memiliki latar belakang campuran antara kelompok etnis Austronesia-Papua dan diduga berasal dari Kepulauan Lease serta wilayah barat Pulau Seram. Namun, asal usul nama \"Ambon\" tidak dapat dipastikan dengan pasti dari sumber mana asalnya.\n\nMenurut masyarakat suku tersebut, istilah \"Ambon\" berasal dari kata 'ombong', yang dalam bahasa lokal Ambon berarti embun. Nama ini diambil karena puncak-puncak gunung di wilayah Ambon sering tertutup oleh embun.\n\nDi sisi lain, ada pendapat lain yang menyatakan bahwa istilah \"orang Ambon\" (Ambonezen) digunakan oleh Belanda untuk merujuk pada orang mestizo yang berasal dari Ambon. Namun, seiring berjalannya waktu, istilah ini juga digunakan untuk menyebut orang-orang yang berasal dari Pulau Seram atau Kepulauan Lease. Hal ini menunjukkan hubungan sejarahnya dengan wilayah-wilayah tersebut."));
        data.put("Agama",  new Budaya("Agama", R.drawable.agama,  "Sebelum agama-agama masuk ke suku Ambon, masyarakat memiliki kepercayaan terhadap kekuatan gaib dan makhluk-makhluk halus. Mereka percaya bahwa benda-benda pusaka, tumbuhan, dan hewan merupakan sarana penghubung dengan dunia gaib.\n\nDalam kepercayaan mereka, terdapat dua jenis makhluk halus, yaitu yang baik (upu ama) dan yang jahat. Suku Ambon juga memiliki sebutan khusus untuk Sang Pencipta, yaitu upu lanite dan upu datu. Mereka menganggap bahwa roh leluhur akan melindungi mereka yang menjalankan adat dengan baik, namun juga memberikan hukuman bagi yang melanggar adat.\n\nPada tahun 1512, Portugis mulai masuk ke wilayah suku Ambon dan menyebarkan agama Kristen. Walaupun agama Islam sudah masuk seabad sebelumnya, masyarakat Ambon saat itu masih tetap mempertahankan kepercayaan asli mereka. Namun, penyebaran agama Kristen menjadi pesat setelah banyak pusat penginjilan didirikan pada tahun 1522, dan banyak penginjil datang ke wilayah Ambon.\n\nSaat ini, Islam menjadi agama mayoritas penduduk Maluku. Dukungan Dukcapil Kementerian Dalam Negeri menyatakan bahwa sekitar 52,81% penduduk Maluku beragama Islam pada Juni 2021. Sementara agama Kristen merupakan agama kedua terbesar dengan persentase sekitar 39,42%. Selain itu, terdapat sejumlah kecil penduduk yang menganut agama Hindu, Buddha, dan aliran kepercayaan, serta ada juga yang beragama Konghucu. Maluku memiliki keberagaman agama dan budaya yang kaya, dan merupakan provinsi dengan luas wilayah dan kepadatan penduduk yang unik."));
        data.put("bahasa", new Budaya("Bahasa", R.drawable.bahasa_ambon,  "Dalam komunikasi sehari-hari, masyarakat menggunakan bahasa Ambon. Bahasa Ambon tidak hanya digunakan di kalangan masyarakat Ambon, tetapi juga di hampir seluruh wilayah Maluku, Kepulauan Lease, Pulau Seram, bahkan sebagai bahasa perdagangan di wilayah Kei. Bahasa Ambon atau Melayu Ambon merupakan salah satu dialek bahasa Melayu yang digunakan di wilayah Provinsi Maluku, termasuk Kota Ambon, Pulau Ambon, Pulau-Pulau Lease (Saparua, Haruku, dan Nusalaut), Pulau Buano, Pulau Manipa, Pulau Kelang, dan Pulau Seram. Bahasa ini juga digunakan sebagai bahasa perdagangan di beberapa wilayah seperti Kei, Banda, Kepulauan Watubela, Pulau Buru, Maluku Tenggara, hingga Maluku Barat Daya.\n\nBahasa Melayu di Ambon berasal dari Indonesia bagian barat atau yang dulu disebut Nusantara bagian barat. Bahasa ini telah digunakan sebagai bahasa antarsuku di seluruh kepulauan Nusantara selama berabad-abad. Sebelum kedatangan bangsa Portugis di Ternate pada tahun 1512, bahasa Melayu sudah digunakan di Maluku sebagai bahasa perdagangan.\n\nPerbedaan bahasa Melayu Ambon dengan bahasa Melayu Ternate terkait dengan perbedaan budaya dan pengaruh suku-suku di kedua wilayah tersebut. Bahasa Melayu Ambon memiliki banyak pengaruh dari bahasa Melayu Makassar, bahasa Portugis, dan bahasa Belanda. Pada masa kekuasaan Belanda di Maluku, bahasa Melayu Ambon digunakan sebagai bahasa pengantar di sekolah-sekolah, gereja-gereja, dan dalam terjemahan beberapa kitab dari Alkitab.\n\nBahasa Melayu Ambon juga mengalami pengaruh dari bahasa Indonesia baku setelah bahasa Indonesia mulai diajarkan di sekolah-sekolah di Maluku. Beberapa kata serapan dari bahasa Indonesia baku disesuaikan dengan logat setempat dan dimasukkan ke dalam bahasa Melayu Ambon.\n\nPenggunaan bahasa Melayu Ambon juga memiliki ciri khas tersendiri, seperti nasalisasi pada akhiran 'n', yang diperkirakan merupakan pengaruh Jepang. Panggilan sosial juga memiliki variasi, tergantung pada kalangan dan budaya, seperti babang/abang, caca, usy, broer/bung/bu, nona, nyong, tanta, nene, tete, dan bapa raja.\n\nBahasa Melayu Ambon memiliki struktur yang agak berbeda dengan bahasa Melayu pada umumnya, namun lazim di Indonesia Timur. Beberapa kata ganti orang yang digunakan adalah beta, ose, ale, dia, katong, dorang, kamong atau kamorang. Terdapat pula ungkapan khas dalam bahasa Melayu Ambon seperti \"ao e!\", \"mamae!\", \"sio mama!\", \"tuang ala!\", \"tuang ana!\", \"ai!\", \"gaga batul!\", dan lain-lain.\n\nBahasa Melayu Ambon juga memiliki banyak kata serapan dari bahasa Eropa, seperti Portugal dan Belanda. Beberapa contoh kata serapan adalah capeu (topi), bandera (bendera), rim (ikat pinggang), fork (garpu), lenso (saputangan), mestiza (selendang leher), blus (kemeja wanita), dan banyak lagi.\n\nDengan ciri khas dan sejarahnya yang kaya, bahasa Melayu Ambon tetap menjadi bahasa yang hidup dan digunakan oleh masyarakat di wilayah Maluku."));
        data.put("Upacara Adat",  new Budaya("Upacara Adat", R.drawable.upacara_adat,  "Salah satu aspek budaya yang dijaga dengan baik oleh masyarakat suku Ambon adalah upacara cuci negeri atau disebut juga nae baileu. Dalam upacara ini, seluruh wilayah suku Ambon harus dibersihkan, termasuk rumah-rumah, pekarangan, dan baileo (rumah adat), yang kemudian diikuti dengan acara makan-makan dan minum bersama.\n\nMasyarakat suku Ambon meyakini bahwa jika upacara ini tidak dilaksanakan, maka bencana dan malapetaka dapat dengan mudah datang. Bahkan, hasil panen dapat gagal jika upacara ini sengaja diabaikan. Oleh karena itu, upacara cuci negeri diadakan secara rutin sebagai bentuk perlindungan dari segala bentuk malapetaka, serta sebagai cara untuk mendekatkan diri pada Sang Pencipta dan menghormati leluhur mereka. Upacara ini menjadi sarana spiritual dan simbol penting dalam menjaga keselarasan dan kesejahteraan masyarakat suku Ambon."));

        return data;
    }
}