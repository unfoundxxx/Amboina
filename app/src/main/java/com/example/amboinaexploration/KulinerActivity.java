package com.example.amboinaexploration;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class KulinerActivity extends AppCompatActivity {

    private ListView listViewKuliner;
    private HashMap<String, Kuliner> kulinerData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        listViewKuliner = findViewById(R.id.listViewKuliner);
        kulinerData = getKulinerData();

        ArrayList<String> kulinerNames = new ArrayList<>(kulinerData.keySet());
        KulinerAdapter adapter = new KulinerAdapter(this, kulinerNames, kulinerData);
        listViewKuliner.setAdapter(adapter);

        listViewKuliner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String kulinerName = kulinerNames.get(position);
                Kuliner kuliner = kulinerData.get(kulinerName);

                Intent intent = new Intent(KulinerActivity.this, DetailKulinerActivity.class);
                intent.putExtra("nama_kuliner", kuliner.getName());
                intent.putExtra("gambar_kuliner", kuliner.getImage());
                intent.putExtra("penjelasan_kuliner", kuliner.getDescription());
                startActivity(intent);
            }
        });
    }

    // Metode untuk mengisi data kuliner
    private HashMap<String, Kuliner> getKulinerData() {
        HashMap<String, Kuliner> data = new HashMap<>();
        data.put("Sagu Tumbu",  new Kuliner("Sagu Tumbu", R.drawable.sagu_tumbu,  "Salah satu makanan tradisional khas Ambon yang unik adalah kue Sagu Tumbu, yang juga dikenal sebagai Paumauido oleh masyarakat setempat. Makanan ini memiliki ciri khas yang istimewa karena bahan dasarnya berasal dari tanaman khas Maluku, yaitu sagu dan kenari.\n\nSagu Tumbu dibuat dengan menggunakan tepung sagu kering, gula merah, dan biji kenari. Proses pembuatannya dilakukan secara tradisional dengan cara ditumbuk. Sagu kering yang digunakan bisa berupa sagu lempeng atau sagu batangan. Proses memasaknya dilakukan dengan cara membakar sagu dalam cetakan yang terbuat dari batu atau tanah liat yang disebut forna, menghasilkan lempengan sagu berwarna kecokelatan.\n\nBiji kenari yang digunakan juga harus berkualitas baik, yang sudah dikeringkan selama seminggu atau lebih untuk mengandung banyak minyak kenari. Sebelum digunakan, biji kenari direndam dalam air hangat agar kulit arinya mudah dilepaskan. Setelah itu, biji kenari disangrai agar minyak kenari bisa mudah keluar.\n\nDengan bahan-bahan alami ini, Sagu Tumbu memiliki cita rasa yang istimewa dan menjadi makanan tradisional yang sangat disukai oleh masyarakat Ambon."));
        data.put("Sambal Colo colo",  new Kuliner("Sambal colo colo", R.drawable.sambal_colo_colo,  "Apabila mengunjungi Kota Ambon di Maluku, pasti Anda akan menemui Ikan Bakar atau ikan asar dengan Colo-colo sebagai hidangan yang khas. Hidangan ini merupakan ikan bakar atau ikan asar yang disajikan dengan sambal colo-colo di atasnya.\n\nBiasanya, ikan yang digunakan untuk hidangan ini biasnya bervariasi dan dapat dipilih , yang mungkin terdengar asing bagi sebagian orang. \n\nKeistimewaan dari hidangan ikan bakar khas Ambon ini terletak pada sambal colo-colo yang pedas dan segar. Sambal ini memberikan cita rasa yang luar biasa pada hidangan Ikan Bakar Colo-colo. Rasanya begitu lezat hingga satu porsi nasi hangat pun mungkin takkan cukup untuk menemani kenikmatan menyantap hidangan ikan ini."));
        data.put("Nasi Lapola", new Kuliner("Nasi Lapola", R.drawable.nasi_lapola,  "Makanan khas Maluku ini adalah Nasi Lapola, yang merupakan sejenis nasi liwet yang terbuat dari perpaduan nasi putih dan kacang merah. Nasi Lapola memiliki cita rasa gurih yang khas karena menggunakan santan kelapa. Tekstur nasinya lembut karena dikukus dan dicampur dengan kelapa parut, kelapa merah, dan daun pandan untuk memberikan aroma yang sedap. Biasanya, Nasi Lapola disajikan pada hari-hari besar sebagai hidangan istimewa."));
        data.put("Talam Sagu Bakar",  new Kuliner("Talam Sagu Bakar", R.drawable.talam_sagu_bakar,  "Makanan khas Maluku, Talam Sagu Bakar, menggunakan bahan sagu rangi sebagai bahan utamanya. Di daerah Maluku, masih banyak makanan yang diolah dari sagu, dan Talam Sagu Bakar menjadi salah satu camilan khas Provinsi Maluku. Bahan-bahan yang digunakan untuk membuat camilan ini termasuk tepung beras, mentega, kacang brenobon atau kacang merah, gula merah, kenari, dan beberapa rempah lainnya. Proses memasaknya cukup sederhana, dimulai dengan merendam sagu hingga mekar, lalu mencampurnya dengan bahan-bahan lain hingga membentuk adonan. Adonan tersebut kemudian dikukus selama 10 menit, dan Talam Sagu siap disajikan.\n\nCitarasa Talam Sagu Bakar sangat manis dan nikmat berkat campuran gula merah dan kacang-kacangan yang ada di dalamnya. Camilan ini sering dinikmati sebagai sajian cemilan saat bersantai bersama keluarga dan kerabat. Meskipun mirip dengan woku komo-komo dalam penampilan, Talam Sagu Bakar tidak mengandung jeroan ikan pada adonannya. Namun, keduanya merupakan olahan sagu yang populer di kalangan masyarakat setempat.\n\nBagi yang penasaran dengan Talam Sagu Bakar, bisa mencicipinya di berbagai cafe yang ada di Maluku dengan harga yang beragam."));
        data.put("Papeda",  new Kuliner("Papeda", R.drawable.papeda, "Saat ditanya tentang makanan pertama dan wajib dicoba saat berkunjung ke Maluku, jawabannya adalah papeda ikan kuah kuning. Hidangan ini memiliki ciri khas yang begitu kuat sehingga sering digunakan oleh travel agent di Ambon, Provinsi Maluku, untuk menyambut tamu wisatawan. Dalam hidangan tersebut, terdapat papeda kenyal yang direndam dalam kuah kuning yang gurih, disajikan dengan ikan kakap segar. Pemandangan ini pasti membuat siapa pun yang melihatnya penasaran dan dijamin akan menikmati kenikmatan rasanya."));
        data.put("Sinoli",  new Kuliner("Sinoli", R.drawable.sinoli,  "Salah satu makanan yang menarik adalah Sinole, yang merupakan olahan sagu dan parutan kelapa dengan citarasa yang sangat unik. Makanan ini menjadi alternatif pilihan bagi mereka yang ingin mencoba sesuatu berbeda selain Papeda.\n\nMembuat Sinole ternyata cukup sederhana. Pertama, sagu mentah yang telah dijemur dipersiapkan dan diayak hingga menjadi tepung halus. Selanjutnya, kelapa parut dimasukkan ke dalam wajan panas, kemudian dicampur dengan tepung sagu, gula pasir, dan garam. Semua bahan diaduk hingga merata dan diproses sangrai hingga tepung sagu berubah menjadi warna kecokelatan. Setelah itu, Sinole siap untuk disajikan.\n\nRasa Sinole sangat unik, dengan sentuhan manis yang berpadu harmonis dengan cita rasa gurih dari parutan kelapa. Tekstur lembut tepung sagu tetap dapat terasa meskipun makanan ini sudah dimasak hingga matang. Kelembutan tekstur ini sengaja dipertahankan untuk menjaga kenikmatan makanan ini. Sinole bisa dinikmati dengan berbagai cara, bisa menjadi pengganti makanan pokok seperti beras, atau menjadi teman yang pas saat menikmati teh pada pagi atau sore hari."));
        data.put("Bagea",  new Kuliner("Bagea", R.drawable.bagea, "Masyarakat Indonesia bagian Timur dikenal dengan kegemaran memasak makanan berbahan dasar sagu, dan makanan pokok ini sering dikonsumsi sehari-hari oleh penduduk di daerah Papua, Maluku, Manado, dan Ternate.\n\nSalah satu panganan yang populer dari berbahan dasar sagu adalah kue Bagea, yang menjadi cemilan khas masing-masing daerah di wilayah Timur tersebut.\n\nKue Bagea adalah sejenis kue kering yang utamanya terbuat dari sagu, dengan tambahan bahan seperti kenari, gula, kayu manis, dan berbagai rempah-rempah. Meskipun agak keras karena menggunakan sagu sebagai bahan dasar, kue ini diminati banyak orang, terutama oleh para pengunjung yang berkunjung ke daerah ini.\n\nRasa Bagea yang gurih dan tidak terlalu manis, serta kehadiran potongan kenari di dalamnya, membuatnya begitu menggugah selera. Aroma khas kue ini semakin terasa saat membuka bungkusnya yang dibalut dengan daun enan atau daun lontar."));
        data.put("Kopi Rarobang",  new Kuliner("Kopi Rarobang", R.drawable.kopi_rarobang, "Kopi Rarobang pada dasarnya adalah kopi Arabica yang banyak tumbuh di Indonesia. Namun, minuman ini menjadi khas karena modifikasi dari penduduk setempat yang mencampurkan rempah-rempah khas Ambon ke dalam sajian kopi. Selain memberikan kenikmatan dan rasa menenangkan seperti kopi pada umumnya, Kopi Rarobang juga diharapkan memberikan manfaat kesehatan dengan tambahan rempah-rempah yang telah lama menjadi hasil utama di wilayah Maluku.\n\nUntuk menyajikan Kopi Rarobang, bahan-bahan seperti kopi Arabica, jahe, cengkih, kayumanis, gula pasir, sereh, dan kacang kenari digunakan. Semua bahan, kecuali kacang kenari, direbus dalam air panas hingga mendidih. Setelah matang, air rebusan tersebut disaring untuk menghasilkan campuran kopi yang berbeda dari kopi biasa. Sebagai sentuhan akhir, irisan kacang kenari ditaburkan di atas kopi yang telah disajikan di dalam cangkir. Jika suka dengan kopi susu, sedikit susu kental juga bisa ditambahkan dan diaduk untuk menikmati Kopi Rarobang.\n\nCiri khas dari Kopi Rarobang terletak pada paduan aroma kopi yang khas dengan rempah-rempah seperti jahe, cengkih, dan sereh. Minuman ini menghadirkan aroma kopi yang kuat dan hangat dari rempah-rempah, menciptakan sensasi yang menenangkan. Karena alasan ini, Kopi Rarobang sering dinikmati pada sore hari ketika para pekerja pulang dari pekerjaan mereka dan butuh relaksasi.\n\nKopi Rarobang merupakan salah satu contoh bagaimana masyarakat Indonesia memiliki inisiatif untuk memodifikasi kopi menjadi sesuatu yang unik dan berbeda. Meskipun Indonesia dikenal sebagai negara penghasil kopi besar, tetapi kreativitas seperti dalam Kopi Rarobang menjadi bukti dari kearifan lokal masyarakat Indonesia. Kopi ini dengan segala keunikan dan manfaatnya telah menjadi kopi khas Maluku yang patut diapresiasi.\n\nKetika menikmati secangkir Kopi Rarobang, waktu berlalu begitu cepat dan suasana malam pun mulai menyelimuti. Sambil mendengarkan musik khas Maluku, saya menyadari bahwa Kopi Rarobang dan camilan pisang sambal telah habis dinikmati. Waktu telah tiba untuk pulang, menikmati makan malam, dan beristirahat setelah sehari penuh aktivitas. Meskipun badan lelah, kenikmatan hangat dari Kopi Rarobang masih terasa, memberikan rasa nyaman di seluruh tubuh bagi para penikmatnya."));
        data.put("Nasi Kelapa",  new Kuliner("Nasi Kelapa", R.drawable.nasi_kelapa, "Nasi Kelapa merupakan hidangan khas Ambon yang sering dihidangkan dengan serundeng, ikan bakar, dan colo-colo. Jika tidak tersedia ikan bakar, ikan ashar juga dapat dijadikan alternatif selama ada colo-colo. Proses pembuatannya dimulai dengan nasi yang dikukus setengah matang, kemudian disiram dengan santan pekat, dan dikukus kembali hingga matang sempurna. Serundengnya terbuat dari kelapa yang sebelumnya telah dikukus agar tidak mudah basi, lalu dicampur dengan cabai, bawang putih, bawang merah, dan tentunya lemon cina yang memberikan sentuhan gurih pada serundeng. Setelah semuanya matang, Nasi Kelapa siap untuk disajikan."));
        data.put("Woku Komo Komo",  new Kuliner("Woko Komo Komo", R.drawable.woku_komo_komo, "Indonesia dikenal dengan beragam kuliner menarik yang seringkali merupakan resep turun-temurun dari nenek moyang, termasuk di Maluku. Salah satu hidangan khas dari Ambon yang menggunakan sagu sebagai bahan utamanya adalah Woku Komo-Komo. Hidangan ini menjadi primadona bagi para pengunjung yang berkunjung ke Maluku, Indonesia Timur. Woku Komo-Komo merupakan makanan pokok masyarakat setempat dan sering dijadikan lauk dari hidangan utama.\n\nWoku Komo-Komo dibuat dengan menggunakan sagu atau batang rumbia yang direndam dalam air selama satu jam. Rempah-rempah seperti bawang putih, bawang merah, merica, serai, jahe, dan santan kental digunakan untuk menciptakan cita rasa khusus pada hidangan ini. Selanjutnya, jeroan ikan yang sudah ditumis, seringkali dipotong kotak menyerupai dadu, dicampurkan dengan adonan rempah tersebut. Proses selanjutnya adalah membungkus adonan ini dengan daun pisang dan memanggangnya di atas bara api hingga matang. Penggunaan daun pisang tidak hanya berfungsi untuk menjaga keawetan hidangan ini, tetapi juga memberikan tampilan yang menarik.\n\nWoku Komo-Komo memiliki cita rasa yang legit dan gurih, dengan aroma khas yang dihasilkan oleh penggunaan rempah-rempah asli. Meskipun mirip dengan talam sagu bakar pada pandangan pertama, namun Woku Komo-Komo memiliki proses pembuatan yang berbeda. Hidangan ini menjadi salah satu favorit di Maluku karena kesederhanaan pembuatannya dan ketersediaan bahan-bahannya yang mudah ditemui. Jika kamu berkunjung ke Maluku, jangan lewatkan untuk mencicipi kelezatan dari Woku Komo-Komo ini."));
        data.put("Kue Sarut",  new Kuliner("Kue Sarut", R.drawable.kue_sarut, "Kue Sarut adalah kue kering khas Ambon yang menjadi favorit banyak orang. Makanan ini terbuat dari campuran kenari yang memberikan cita rasa yang khas dan nikmat. Proses pembuatannya dilakukan secara tradisional dengan cara dipanggang, sehingga kue ini memiliki tekstur yang renyah dan kriuk-kriuk saat digigit.\n\nCitarasa manis dari Kue Sarut membuatnya menjadi pilihan yang sempurna untuk dinikmati sebagai camilan. Rasanya yang lezat juga sangat cocok disandingkan dengan secangkir kopi atau teh. Ketika sedang bersantai sambil minum kopi atau teh, Kue Sarut menjadi teman yang pas untuk menemani momen santai Anda.\n\nKue Sarut juga sering dijadikan sebagai hidangan saat perayaan atau acara tertentu di Ambon. Bentuknya yang cantik dan rasanya yang istimewa membuat kue ini menjadi favorit dalam berbagai kesempatan.\n\nDengan berbagai keunggulan dan kelezatannya, Kue Sarut telah menjadi bagian penting dari kuliner khas Ambon. Banyak orang yang menyukai kue ini dan mencarinya saat berkunjung ke Ambon atau sebagai oleh-oleh untuk dibawa pulang."));
        data.put("Asida",  new Kuliner("Asida", R.drawable.asida, "Asida adalah sebuah kue dengan cita rasa mirip dodol, manis dengan sentuhan aroma kayu manis yang khas. Meskipun teksturnya kenyal seperti dodol, kue ini berbeda karena tidak menggunakan tepung ketan, melainkan tepung terigu.\n\nAwalnya, Asida merupakan kue khas dari Arab, namun di Ambon, makanan ini telah menjadi sangat populer dan akrab di lidah penduduk setempat, terutama sebagai camilan favorit selama bulan Ramadan.\n\nKeistimewaan Asida tidak hanya dari rasanya yang manis dan lezat, tapi juga karena bagian atasnya dilumuri dengan mentega cair yang memberikan sentuhan gurih yang menggugah selera. Kombinasi manis dan gurih ini membuat Asida menjadi santapan unik yang sangat disukai."));
        data.put("Sagu Lempeng",  new Kuliner("Sagu Lempeng", R.drawable.sagu_lempeng, "Sagu lempeng adalah makanan yang terbuat dari tepung sagu yang dipanggang menggunakan cetakan batu atau tanah liat yang disebut forna. Hasilnya adalah lempengan sagu yang padat dengan warna kecokelatan. Untuk membuatnya, tepung sagu diayak beberapa kali agar benar-benar halus. Selama proses pembakaran yang berlangsung sekitar 30-60 menit, ditambahkan pelengkap seperti parutan kelapa atau gula merah. Sagu lempeng seringkali dijadikan camilan ringan yang enak disantap sambil dicelupkan ke dalam secangkir kopi atau teh."));


        return data;
    }
}