package com.example.amboinaexploration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class WisataActivity extends AppCompatActivity {

    private ListView listViewWisata;
    private HashMap<String, Wisata> wisataData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        listViewWisata = findViewById(R.id.listViewWisata);
        wisataData = getWisataData();

        ArrayList<String> wisataNames = new ArrayList<>(wisataData.keySet());
        WisataAdapter adapter = new WisataAdapter(this, wisataNames, wisataData);
        listViewWisata.setAdapter(adapter);

        listViewWisata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String wisataName = wisataNames.get(position);
                Wisata wisata = wisataData.get(wisataName);

                Intent intent = new Intent(WisataActivity.this, DetailWisataActivity.class);
                intent.putExtra("nama_wisata", wisata.getName());
                intent.putExtra("gambar_wisata", wisata.getImage());
                intent.putExtra("deskripsi_wisata", wisata.getDescription());
                intent.putExtra("latitude_wisata", wisata.getLatitude());
                intent.putExtra("longitude_wisata", wisata.getLongitude());
                intent.putExtra("maps_url", wisata.getMapUrl());
                startActivity(intent);
            }
        });
    }

    private HashMap<String, Wisata> getWisataData() {
        HashMap<String, Wisata> data = new HashMap<>();

        data.put("Pulau Pombo", new Wisata(
                "Pulau Pombo",
                R.drawable.pulau_pombo,
                "Provinsi Maluku, yang terletak di daerah timur Indonesia, semakin menarik perhatian para wisatawan, terutama karena pesona wisata baharinya. Provinsi ini terdiri dari berbagai pulau, sehingga pantai-pantai yang indah dapat ditemukan sepanjang batas daratan dan laut. Salah satu pantai yang menarik perhatian adalah Pantai Pulau Pombo, yang terletak di Kecamatan Salahhutu, Kabupaten Maluku Tengah, di antara Pulau Haruku dan Pulau Ambon. "
                        + "Meskipun luasnya tidak terlalu besar, hanya sekitar 4 km persegi, Pulau Pombo menyimpan pesona alam yang memukau dan memberikan suasana ketenangan. Keindahan alam darat dan laut yang masih alami serta tanpa penghuni membuat pulau ini menjadi destinasi liburan yang berkesan. Para penyelam pun tak ingin ketinggalan, karena Pulau Pombo juga menjadi spot snorkeling dan diving baru di Maluku yang menarik minat para penyelam dari dalam dan luar negeri. "
                        + "Pulau Pombo memiliki keanekaragaman hayati dan ekosistem yang kaya, sehingga dijadikan kawasan konservasi dengan status cagar alam di daratan dan taman wisata alam laut di perairan sekitarnya. Berbagai kegiatan wisata alam seperti berenang, snorkeling, menyelam, memancing, trekking, pengamatan burung, dan jalan-jalan mengelilingi pulau dapat dinikmati di Pulau Pombo. "
                        + "Keindahan daratan yang terhampar di tengah laut dengan pasir putih dan air laut yang jernih akan memukau mata Anda. Pulau Pombo juga menjadi tempat hidupnya spesies burung pombo yang merupakan burung khas wilayah Maluku. Keberagaman hayati juga terlihat saat air surut, ketika daratan baru mulai terlihat dan terbentuk dari perairan dangkal. Di bawah laut Pulau Pombo, Anda dapat menjumpai banyak spesies ikan, kerang, dan rumput laut yang menakjubkan. "
                        + "Pulau Pombo menjadi destinasi ideal untuk berkemah, karena suasana alamnya yang cocok untuk mendirikan tenda. Pohon-pohon rindang di tengah pulau bisa digunakan untuk berteduh. Namun, Anda perlu memperhatikan cuaca saat mengunjungi pulau ini, karena ombak besar dapat menjadi kendala bagi kapal nelayan yang mengantar wisatawan ke Pulau Pombo. "
                        + "Sebagai pulau kecil yang tidak berpenghuni, Pulau Pombo tetap menjaga keadaan alamnya yang natural, termasuk bagian hutan yang masuk ke dalam hutan cagar alam. Tidak ada fasilitas di sana, bahkan papan penunjuk pun tidak ada. Jika ingin berkunjung, Anda disarankan untuk membawa persediaan makanan dan air, serta membawa kembali sampah dari makanan yang Anda bawa. Jangan lupa juga membawa persediaan obat-obatan darurat karena lokasinya yang terpencil dan jauh dari desa berpenghuni terdekat. Dengan segala keindahannya, Pulau Pombo menawarkan pengalaman liburan yang tak terlupakan bagi para pengunjungnya.",
                -3.5390718,
                128.3734286,
                "https://www.google.com/maps/place/Pulau+Pombo/@-3.5390718,128.3734286,16.25z/data=!4m6!3m5!1s0x2d6c8d16e8744e19:0x33f724fa599db51a!8m2!3d-3.5318271!4d128.3755021!16s%2Fg%2F11tg88d2tq?entry=ttu"));

        data.put("Pantai Liang", new Wisata(
                "Pantai Liang",
                R.drawable.pantai_liang,
                "Pantai yang cantik ini memiliki nama asli Pantai Hunimua, tetapi karena terletak di Desa Liang, masyarakat Ambon sering menyebutnya sebagai Pantai Liang. Para wisatawan yang datang ke sini akhirnya juga mengenalnya dengan nama Pantai Liang. "
                        + "Pada tahun 1990-an, UNDP PBB menyatakan bahwa Pantai Liang adalah pantai terindah yang menduduki peringkat pertama di Indonesia, bahkan mengalahkan popularitas Pantai Bunaken yang sangat terkenal. Pemberian peringkat tersebut benar-benar tepat karena pantai eksotis ini memiliki pesona tersendiri dengan hamparan pantai sepanjang 1 km dan lebar sekitar 300 meter. Kebersihan dan keindahan lautnya menjadikan tempat ini ideal untuk menyelam tanpa tercemar oleh sampah atau limbah. "
                        + "Saat ini, Pantai Liang masih cukup sepi pengunjung meskipun memiliki pesona wisata yang menarik. Kebanyakan pengunjung berasal dari masyarakat setempat dan warga Ambon. Sementara wisatawan dari luar daerah lebih memilih destinasi wisata di kota atau pantai lain yang lebih dekat dari pusat kota Ambon. "
                        + "Pantai Liang menyuguhkan suasana tenang dan damai, jauh dari keramaian perkotaan, sehingga menjadi tempat yang sempurna untuk melepaskan penat dan kelelahan. Pengunjung akan langsung disambut dengan pasir putih yang berkilauan oleh sinar matahari. Air laut bergradasi hijau tosca yang tampak semakin gelap di kejauhan menggoda untuk berenang di sana. "
                        + "Berenang di Pantai Liang adalah pengalaman yang menyenangkan karena ombaknya cukup tenang dan airnya jernih. Bagi penyuka diving, pantai ini menawarkan panorama bawah laut yang menakjubkan, dengan goa bawah laut pada kedalaman 15 meter yang sering dijuluki sebagai surga bawah laut. "
                        + "Pantai Liang juga merupakan tempat yang cocok untuk berburu foto. Terdapat dermaga kayu yang menjadi spot favorit untuk foto instagramable, karena latar belakang lautan lepas yang cantik. Aktivitas lain yang bisa dinikmati di pantai ini termasuk cliff jump, menaiki banana boat, dan sunbathing. "
                        + "Pantai Liang berjarak sekitar 40 kilometer dari pusat Kota Ambon dan bisa diakses menggunakan kendaraan pribadi atau transportasi umum seperti ojek atau angkutan umum. Tiket masuk ke pantai ini sangat terjangkau, sekitar Rp. 10.000 per orang. Fasilitas yang tersedia termasuk ruang berganti baju, ruang bilas, persewaan banana boat, dan warung makanan serta minuman ringan."
                        + "Pantai morela",
                -3.5049263,
                128.3428253,
                "https://www.google.com/maps/place/Pantai+Liang/@-3.5049263,128.3428253,15z/data=!3m1!4b1!4m6!3m5!1s0x2d6c8b4d049b04b7:0x34b7df42fb67f814!8m2!3d-3.5049264!4d128.3428253!16s%2Fg%2F11hb2pqnn9?entry=ttu"
        ));
        data.put("Pantai Natsepa", new Wisata(
                "Pantai Natsepa",
                R.drawable.pantai_natsepa,
                "Pantai Natsepa merupakan sebuah keindahan yang tak akan terlupakan bagi para pengunjung yang pernah mengunjunginya. Keindahan pantai ini telah sampai hingga Eropa, terutama di Belanda, karena banyaknya orang Ambon yang menjadi warga negara Belanda.\n"
                        + "Lokasi Pantai Natsepa berada di Kabupaten Maluku Tengah, dan daya tariknya begitu diminati di Belanda karena adanya komunitas orang Ambon yang tinggal di sana. Kerinduan akan keindahan pantai ini tidak pernah pudar, karena suasana di Pantai Natsepa memiliki daya tarik yang menggoda para wisatawan untuk datang berkunjung lagi.\n"
                        + "Keunikan Pantai Natsepa mencakup beberapa aspek yang membuatnya menarik bagi para wisatawan:\n"
                        + "1. Pasir Pantai Yang Luas: Pantai Natsepa memiliki ciri khas dengan area pasir yang sangat lebar dan panjang. Pasir putih dan ombak yang tidak terlalu besar menambah daya tariknya. Panorama pulau di sekitarnya semakin memperindah pemandangan.\n"
                        + "2. Wisata Keluarga: Pantai Natsepa merupakan destinasi yang nyaman untuk dikunjungi oleh keluarga karena ombak yang tenang dan beragam wahana wisata yang cocok untuk semua kalangan dan usia.\n"
                        + "3. Wisata Kuliner: Ciri khas Pantai Natsepa adalah wisata kulinernya, terutama rujak Natsepa yang tersedia di berbagai kedai di sekitar pantai. Rujak ini sangat segar dan khas, menjadi daya tarik tersendiri bagi para pengunjung.\n"
                        + "Pantai Natsepa terletak di Desa Suli, Kecamatan Salahutu, Kabupaten Maluku Tengah, Provinsi Maluku. Lokasinya hanya sekitar 18 km dari Ambon, dapat ditempuh dalam waktu sekitar 30 menit dengan kendaraan bermotor. Transportasi untuk menuju ke pantai ini sangat mudah, dengan pilihan rental kendaraan atau naik kendaraan umum (angkot).\n"
                        + "Pantai Natsepa buka selama 24 jam, tetapi kunjungan terakhir biasanya sampai pukul 21.00. Tiket masuk ke pantai ini terjangkau, hanya sekitar Rp 3.000 per orang, dan tarif parkir untuk sepeda motor mulai dari Rp 5.000, sedangkan untuk mobil sekitar Rp 10.000.\n"
                        + "Di sekitar Pantai Natsepa, tersedia penginapan atau hotel yang nyaman, beberapa di antaranya bahkan menghadap langsung ke pantai, sehingga Anda dapat menikmati matahari terbit dengan lebih nyaman.",
                -3.6176061,
                128.2878283,
                "https://www.google.com/maps/place/Pantai+Natsepa/@-3.6176061,128.2878283,16z/data=!4m6!3m5!1s0x2d6cece6e8bfa427:0x4f23bfbc3a9673f2!8m2!3d-3.6215465!4d128.2921198!16s%2Fg%2F11cjj0hyrf?entry=ttu"
        ));
        data.put("Pantai Lubang Buaya Morela", new Wisata(
                "Pantai Lubang Buaya Morela",
                R.drawable.pantai_morela,
                "Wisata Pantai Lubang Buaya Morella di Maluku Tengah pulau Ambon menawarkan keindahan alam yang memikat. Nama Morella sendiri menggambarkan pesona alamnya yang cantik. Desa tersebut merupakan destinasi wisata unik di timur Indonesia, khususnya di Maluku Tengah. Selain dikenal dengan Pantai Lubang Buaya, Morella juga memiliki budaya istimewa yang menarik untuk dijelajahi.\n"
                        + "Untuk mencapai Morella, Anda tidak perlu menyeberangi lautan dengan kapal. Cukup menggunakan kendaraan bermotor, perjalanan dari Kota Ambon memakan waktu sekitar 60 hingga 90 menit. Jika Anda berkunjung pada liburan Idul Fitri, ada kesempatan untuk menyaksikan budaya pukul sapu, yang dalam bahasa setempat disebut pukul Manyapu. Tradisi ini mengenang perjuangan sejarah melawan penjajah dan juga menjadi sarana untuk mempererat persaudaraan masyarakat di Morella.\n"
                        + "Pantai Lubang Buaya menawarkan panorama alam yang eksotis dan memukau. Meskipun namanya mengandung kata \"buaya,\" jangan khawatir, karena tidak ada predator di dalamnya. Setiap harinya, Pantai Lubang Buaya dikunjungi oleh para pengunjung yang ingin menikmati udara segar dan keindahan lautan yang jernih. Mitos setempat mengatakan bahwa dulunya ada lubang atau gua yang menjadi sarang buaya putih, sehingga pantai ini dinamai demikian.\n"
                        + "Pantai Lubang Buaya atau juga dikenal sebagai Pantai Namanalu, telah menjadi tujuan favorit bagi para pecinta snorkeling dan diving sejak tahun 2016. Banyak pengguna media sosial seperti Instagram yang menghiasai akun mereka dengan foto-foto penyelaman di kedalaman Lubang Buaya. Sebagai taman laut, destinasi wisata Maluku Tengah ini menyuguhkan pengalaman menyelam yang tak terlupakan. Palung laut, gua-gua menakjubkan, terumbu karang yang indah, dan ikan-ikan berwarna-warni menjadi daya tarik utama tempat ini.\n"
                        + "Sekalipun menawarkan keindahan yang luar biasa, Pantai Lubang Buaya tetap terjangkau bagi para pengunjung. Warga setempat bersama berbagai pihak telah berusaha mengembangkan Morella sebagai destinasi wisata yang ramah kantong. Tiket masuknya cukup terjangkau, hanya sekitar Rp2.000. Pengunjung juga dapat menggunakan jasa pemandu dengan memberikan kontribusi seikhlasnya. Disarankan untuk membawa peralatan snorkeling atau diving pribadi.\n"
                        + "Wisata di Morella tak hanya terbatas pada Pantai Lubang Buaya. Anda juga dapat mengunjungi Pantai Wai Moki, yang berjarak sekitar 3 km dari Pantai Lubang Buaya. Teluk Tilepuwai menawarkan pesona lain yang bisa dinikmati dengan berjalan kaki selama 13 menit. Selain itu, ada objek wisata lain seperti Tanjung Setan dan Benteng Kapahama yang memiliki nilai sejarah bagi masyarakat Morella.\n"
                        + "Jadi, siapkan rencana perjalanan Anda dan nikmati keindahan Morella, sebuah destinasi wisata memikat di Maluku Tengah.",
                -3.5184811,
                128.2237001,
                "https://www.google.com/maps/place/Lubang+Buaya+Morela/@-3.5184811,128.2237001,20.13z/data=!4m14!1m7!3m6!1s0x2d6cf6ae7693ae9f:0x201c7423df81cfcc!2sLubang+Buaya+Morela!8m2!3d-3.5183437!4d128.2236557!16s%2Fg%2F11c45sxdpv?entry=ttu"
        ));
        data.put("Pantai Pintu Kota", new Wisata(
                "Pantai Pintu Kota",
                R.drawable.pantai_pintu_kota,
                "Pantai Pintu Kota Ambon terletak di Dusun Airlouw, Desa Nusaniwe, Kecamatan Nusaniwe, Kota Ambon secara administratif. Pantai ini dinamakan Pintu Kota Ambon karena memiliki karang besar dengan lubang besar yang menyerupai gerbang. Menurut masyarakat sekitar, pantai ini dahulu menjadi gerbang masuk bagi para pedagang dan pelaut dari luar wilayah Ambon sebelum memasuki perairan Ambon.\n"
                        + "Keindahan pantai ini terletak pada panorama indahnya dengan gugusan terumbu karang di sekitar karang berlubang besar. Tempat ini sering dijadikan lokasi pemotretan pre-wedding karena keindahannya. Untuk mencapai bibir pantai, pengunjung harus menuruni tangga yang cukup curam namun tidak terlalu panjang. Air laut berwarna biru dan hijaunya, serta keindahan gugusan batu karang, menciptakan pemandangan yang memukau setiap mata yang melihatnya.\n"
                        + "Rute menuju Pantai Pintu Kota Ambon adalah sekitar 26 km dari pusat kota Ambon atau sekitar 1 jam perjalanan menggunakan kendaraan roda empat. Jika menggunakan transportasi umum, dapat menggunakan angkutan umum berwarna merah menuju Desa Airlouw dengan tarif sekitar Rp 30.000 perjalanan sekali jalan, dilanjutkan dengan ojek pengkolan sekitar 2,5 km atau 7 menit. Pengunjung juga dapat menggunakan kendaraan pribadi karena jalan menuju lokasi sudah beraspal. Bagi pengunjung dari luar Ambon, bisa menyewa taksi dari Bandara Pattimura dengan estimasi dana sekitar Rp 200.000.\n"
                        + "Harga tiket masuk ke Pantai Pintu Kota Ambon terjangkau, hanya sekitar Rp 5.000 per orang, ditambah biaya parkir untuk kendaraan bermotor sekitar Rp 2.000 dan mobil sekitar Rp 5.000. Pantai ini menyediakan fasilitas yang cukup lengkap, termasuk area parkir yang luas dan nyaman, serta beberapa pondokan untuk bersantai dan menikmati pemandangan pantai. Ada juga pilihan penginapan dengan harga terjangkau untuk yang ingin menginap di sekitar pantai.\n"
                        + "Di Pantai Pintu Kota Ambon, pengunjung dapat menikmati keindahan panorama bibir pantai yang memiliki sedikit pasir dan didominasi oleh bebatuan tajam. Pantai ini juga memiliki panorama karang berlubang dengan dinding tebing berwarna coklat kemerahan yang dihantam gelombang ombak, menciptakan pecahan air yang indah. Bagi pecinta snorkeling dan diving, pantai ini menawarkan keindahan bawah laut dengan gugusan terumbu karang yang indah. Pengunjung juga dapat menyewa speedboat untuk menikmati keindahan pantai dari atas laut. Jangan lupa menikmati indahnya sunset dari berbagai sudut tempat yang nyaman di pantai ini.",
                -3.7705365,
                128.1524331,
                "https://www.google.com/maps/place/Pantai+Pintu+Kota+Ambon/@-3.7705365,128.1524331,15z/data=!4m6!3m5!1s0x2d6cc335f61cc1e9:0x456317295a6201a6!8m2!3d-3.7705365!4d128.1524331!16s%2Fg%2F11b7vd74_p?entry=ttu"
        ));
        data.put("Pantai Batu Kapal", new Wisata(
                "Pantai Batu Kapal",
                R.drawable.pantai_batu_kapal,
                "Batu Kapal Liliboi, juga dikenal sebagai Batu Lubang Liliboi, terletak di sebuah pantai berbatu tanpa hamparan pasir putih. Keunikan dari batu karang ini adalah bentuknya yang menyerupai lambung kapal dengan lubang kecil yang menjadi akses untuk masuk ke bagian dalam batu. Lubang ini memiliki lebar sekitar 3 meter persegi. Pantai Batu Kapal memiliki tebing-tebing tinggi sekitar 30 meter di atas permukaan laut, dengan air laut yang sangat jernih dan berbatu, serta pesisir pantai yang dipenuhi dengan kerikil-kerikil.\n"
                        + "Kawasan wisata Batu Kapal mulai dikenal publik pada tahun 2016 dan sejak tahun 2018 hingga saat ini telah menjadi spot wisata populer bagi wisatawan lokal maupun internasional.\n"
                        + "Batu Kapal terdiri dari dua bagian, yaitu bagian luar dan dalam kapal.\n"
                        + "- Bagian luar: Pengunjung akan menuruni anak tangga untuk mencapai pantai yang tidak berpasir, melainkan terdiri dari kerikil-kerikil dengan air laut yang jernih dan berwarna biru. Pada lokasi ini terdapat bebatuan karang besar yang menyerupai sebuah kapal, dengan bagian yang paling terlihat adalah anjungan kapal dan sebuah lubang besar yang menyerupai jendela kapal. Tempat ini cocok untuk bersantai sambil menikmati pemandangan pantai dan juga snorkeling.\n"
                        + "- Bagian dalam: Terdapat sebuah pantai terpisah yang dikelilingi oleh tebing-tebing tinggi dari bagian luar kapal. Pantai ini merupakan pantai air tawar dengan kedalaman antara 30 cm hingga 2 meter. Tempat ini cocok untuk berenang dan bersantai.\n"
                        + "Pantai Batu Kapal Liliboi buka dari jam 07:00 hingga 18:00 WIT. Tiket masuknya hanya Rp 5.000, sementara biaya parkir kendaraan adalah Rp 2.000 untuk motor dan Rp 5.000 untuk mobil. Fasilitas yang tersedia di pantai ini meliputi toilet, rumah makan, area parkir, dan tempat sampah.\n"
                        + "Untuk mencapai Batu Kapal Liliboi dari Bandara Pattimura, dapat menggunakan transportasi darat roda 2 atau roda 4 dengan waktu perjalanan sekitar 15 menit. Dari Kota Ambon, jarak yang ditempuh adalah sekitar 24,2 km dengan waktu perjalanan sekitar 38 menit.\n"
                        + "Pengunjung disarankan untuk tidak mengambil batu di pantai wisata ini. Tebing di Batu Kapal ini curam dan licin, sehingga disarankan menggunakan alas kaki yang sesuai dan nyaman serta selalu berhati-hati. Untuk mencapai pantai, pengunjung harus menuruni tangga sejauh kurang lebih 250 meter, dan perlu berhati-hati karena masih banyak akar pohon yang menjadi pijakan kaki.\n"
                        + "Disarankan untuk datang pada pagi hari untuk menghindari keramaian. Jika datang di siang hari atau sore hari, pantai ini akan lebih ramai dengan pengunjung. Bagian dalam kapal bisa diakses saat air surut, karena pada saat air pasang bisa menjadi berbahaya karena kedalaman air bertambah.\n"
                        + "Pengunjung disarankan membawa makanan, handuk, dan alat snorkeling sendiri, karena tidak ada tempat penyewaan alat snorkeling atau kedai makanan di dekat pantai. Penjual makanan dan minuman biasanya baru berdagang di sore hari.\n"
                        + "Pada dekat lokasi wisata, pengunjung harus teliti untuk melihat papan penunjuk lokasi Batu Kapal yang berukuran tidak terlalu besar sebagai gerbang masuk ke Batu Kapal Liliboi.",
                -3.7409857,
                128.0290293,
                "https://www.google.com/maps/place/Batu+Kapal+Lilibooi/@-3.7409857,128.0290293,16z/data=!4m6!3m5!1s0x2d6cde39a7154e9f:0x1d8350b249e4ad7d!8m2!3d-3.7430841!4d128.0322265!16s%2Fg%2F11c2qk9mmm?entry=ttu"
        ));
        data.put("Pantai Halasi", new Wisata(
                "Pantai Halasi",
                R.drawable.pantai_halasi,
                "Pantai Halassy, yang terletak di ujung timur Negeri Morela dan berbatasan dengan Negeri Liang Kabupaten Maluku Tengah, saat ini telah dijadikan sebagai tempat wisata baru oleh pemilik lahan.\n"
                        + "Pantai Halassy Beach yang baru diresmikan pada awal Januari 2018 telah menarik banyak pengunjung ke lokasi tersebut. Dengan garis pantai seluas 1 hektar, pantai ini menawarkan pemandangan laut yang indah dengan pasir putih dan air laut yang sangat jernih. Lokasi ini sempurna untuk berenang, berjemur, bahkan snorkeling.\n"
                        + "Tidak hanya menawarkan keindahan pantai, Halassy Beach juga memiliki sebuah pelabuhan mini untuk speed boat bersandar. Pelabuhan mini ini sering difungsikan oleh pengunjung untuk mengambil foto karena penataannya yang rapi dan menarik.\n"
                        + "Selain pelabuhan mini, pemilik Halassy Beach juga menyediakan fasilitas berenang untuk anak-anak maupun dewasa, sehingga keluarga yang berlibur di lokasi ini dapat dilayani dengan baik.\n"
                        + "\"Saat ini, Halassy Beach menyediakan 4 kamar nginap dengan ukuran 6x6 meter persegi, lengkap dengan fasilitas di dalamnya,\" ujar Djar Wattiheluw, pengelola Halassy Beach beberapa waktu lalu.\n"
                        + "Wattiheluw juga menyebutkan bahwa selain kamar nginap, Halassy yang dekat dengan tempat wisata Lubang Buaya juga memiliki resort dan fasilitas karaoke.\n"
                        + "Pengunjung yang datang ke Halassy Beach dikenakan tiket masuk dengan harga yang tergolong murah, hanya sebesar Rp. 5.000 saja. Lokasi ini telah menjadi populer dengan kunjungan sekitar 300 orang dalam sehari, dan pada hari Minggu bisa mencapai ribuan pengunjung.\n"
                        + "Pihak pengelola berencana untuk membangun kamar nginap apung yang berada di bawah tebing karang, dengan harapan menjadikan Halassy Beach sebagai tempat favorit yang wajib dikunjungi.",
                -3.5390718,
                128.3734286,
                "https://www.google.com/maps/place/Pantai+Halasi/@-3.5344931,128.2136056,15z/data=!3m1!4b1!4m6!3m5!1s0x2d6cf14728529623:0xd70fd2dd09d53f00!8m2!3d-3.5344931!4d128.2136056!16s%2Fg%2F11f3cm8wwl?entry=ttu"
                ));
        data.put("Pantai Hukurila", new Wisata(
                "Pantai Hukurila",
                R.drawable.pantai_hukurila,
                "Pantai Hukurila adalah salah satu destinasi wisata alam yang menarik di daerah Maluku, Indonesia. Pantai ini menawarkan daya tarik yang luar biasa dengan garis pantai yang membentang sepanjang 1 hektar, pemandangan laut yang indah, dan pasir berwarna coklat yang unik. Pantai Hukurila terletak di Kecamatan Leitimur, Kota Ambon, Maluku, berbatasan langsung antara Pulau Ambon dengan Laut Banda.\n"
                        + "Daya tarik Pantai Hukurila terletak pada karakteristiknya yang khas, dengan pasir coklat dan bebatuan yang menghiasi bibir pantai. Keunikan pantai ini juga terlihat dari warna pasir hitamnya, yang diyakini sebagai sisa-sisa aktivitas vulkanisme di daerah tersebut. Selain itu, keindahan bawah lautnya menawarkan biota laut yang menarik, yang berpadu dengan bebatuan laut yang menakjubkan.\n"
                        + "Untuk mencapai Pantai Hukurila, Anda dapat menggunakan kendaraan pribadi atau transportasi umum, dengan jarak sekitar 15 km dari pusat kota Ambon. Untuk menikmati pesona alam di pantai ini, Anda perlu membayar biaya retribusi yang terjangkau, sekitar Rp 15.000 hingga Rp 25.000, tergantung pada aktivitas seperti diving atau snorkeling.\n"
                        + "Ada banyak kegiatan menarik yang dapat dilakukan di Pantai Hukurila, seperti menikmati keindahan landscape terumbu karang, melakukan aktivitas diving dan snorkeling untuk mengeksplorasi kehidupan bawah laut, menyewa speed boat untuk mengelilingi pulau dan menikmati pesona goa bawah laut. Bagi pecinta fotografi, momen indah di pantai ini dapat diabadikan dengan berbagai keindahan bawah laut dan panorama pantai yang menawan.\n"
                        + "Pantai Hukurila juga menawarkan kesempatan untuk menikmati keindahan matahari terbit di pantai yang menghadap ke arah Timur. Bagi pecinta kuliner, Anda dapat mencari makanan khas daerah sekitar pantai yang disajikan dengan bumbu lezat, seperti ikan asap, ikan bakar, dan papeda.\n"
                        + "Dengan berbagai aktivitas menarik dan keindahan alamnya, Pantai Hukurila menjadi destinasi wisata yang tepat untuk dikunjungi ketika berlibur ke Ambon, Maluku.",
                -3.7381507,
                128.240791,
                "https://www.google.com/maps/place/Pantai+Hukurila/@-3.7381507,128.240791,3a,75y,90t/data=!3m8!1e2!3m6!1sAF1QipNXR4VR0rYoAm9ySFMhWe-4YWcGKAHfvSM4yHYi!2e10!3e12!6shttps:%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipNXR4VR0rYoAm9ySFMhWe-4YWcGKAHfvSM4yHYi%3Dw152-h86-k-no!7i4032!8i2268!4m7!3m6!1s0x2d6cc18e44ac7471:0x666d9152d3bbd2a7!8m2!3d-3.7381507!4d128.240791!10e5!16s%2Fg%2F11cm0lh9yr?entry=ttu"
        ));
        data.put("Talaga Tihu", new Wisata(
                "Talaga Tihu",
                R.drawable.talaga_tihu,
                "Talaga Tihu atau yang disebut Talaga Cinta merupakan destinasi wisata terbaru di Kabupaten Maluku Tengah di pulau Ambon. Telaga seluas 3 hektare ini terletak di tengah permukiman penduduk namun tetap menawarkan pesona cantik dan menawan. Sesuai dengan namanya, Talaga Cinta menghadirkan suasana romantis dan menarik konsep wisata air.\n"
                        + "Lokasi Talaga Cinta berada di Desa Suli, Kecamatan Salahutu, Kabupaten Maluku Tengah, Provinsi Maluku. Untuk mencapai tempat ini, para wisatawan dapat menggunakan sepeda motor, angkot, atau ojek dari pusat Kota Ambon sejauh sekitar 20 kilometer.\n"
                        + "Perjalanan menuju objek wisata Talaga Cinta sedikit menantang karena jalanan rusak dan berbatu, terutama saat hujan yang membuat jalan menjadi licin.\n"
                        + "Talaga Cinta dinamakan demikian karena tepian danau yang teratur dengan rapi, menciptakan suasana romantis yang memukau. Pengunjung bisa menikmati suasana romantis ini dengan harga tiket masuk sebesar Rp5 ribu per orang.\n"
                        + "Di tempat ini, Anda dapat menikmati konsep wisata romantis dengan sejumlah spot menarik seperti panggung I love, panggung musik, payung warna-warni, dan area pemancingan ikan.\n"
                        + "Selain itu, Talaga Cinta juga menawarkan sepeda air atau bebek-bebekan. Pengunjung dapat menaiki wahana ini dengan membayar Rp25 ribu untuk 30 menit. Setiap armada bebek air dapat menampung dua hingga tiga orang pengunjung, dan mereka bisa berkeliling danau sambil berfoto.\n"
                        + "Sebelum dikenal sebagai Talaga Cinta, danau ini awalnya disebut Danau Tihu, yang berarti \"kolam besar\". Dahulu, warga setempat menggunakan tepian danau ini untuk berbagai aktivitas seperti berkebun, mencuci, dan mandi.\n"
                        + "Tetapi setelah banjir melanda akibat hujan deras di pegunungan, warga menghentikan kegiatan berkebun di sana dan beralih berkebun di gunung yang juga merupakan lokasi banyak ternak.\n"
                        + "Wisata Talaga Cinta menjadi favorit bagi kalangan muda yang mencari suasana berpasangan yang romantis, sehingga tempat ini dinamakan Talaga Cinta. Meskipun masih minim fasilitas, tempat ini telah mendatangkan ribuan pengunjung setiap harinya.\n"
                        + "Saat ini, Talaga Cinta masih dikelola secara swadaya dan belum masuk dalam daftar potensi wisata Dinas Pariwisata Kabupaten Maluku Tengah.",
                -3.6927869,
                128.1824825,
                "https://www.google.com/maps/place/Benteng+Nieuw+Victoria/@-3.6927869,128.1824825,15z/data=!4m6!3m5!1s0x2d6ce850f28ddc35:0xe2373ab58800130a!8m2!3d-3.6927869!4d128.1824825!16s%2Fg%2F1q5hbc1bs?entry=ttu"
        ));
        data.put("Siwang Paradise", new Wisata(
                "Siwang Paradise",
                R.drawable.siwang_paradise,
                "Pemandangan Menakjubkan: Dengan ketinggian sekitar 500 mdpl dari permukaan laut, Siwang Paradise menawarkan pemandangan indah dari atas bukit. Anda akan disuguhi panorama perbukitan hijau yang luas dan udara segar yang masih belum terjamah manusia. Keindahan alam yang alami menjadikan tempat ini menjadi favorit untuk berlibur.\n"
                        + "Trek Menantang: Sebelum mencapai puncak, Anda harus menyusuri jalan setapak yang cukup menantang. Meskipun perjalanannya agak melelahkan, tetapi sensasi trekking melalui alam yang asli dan menarik akan memberikan pengalaman yang menyegarkan dari rutinitas sehari-hari.\n"
                        + "Spot Foto Menarik: Dari puncak, Anda dapat menemukan spot foto menarik dengan latar belakang perbukitan, laut, dan langit biru yang cerah. Banyak pengunjung yang mengabadikan momen ini sebagai kenang-kenangan dari kunjungan mereka.\n"
                        + "Alamat, Rute Lokasi, dan Harga Tiket:\n"
                        + "Siwang Paradise terletak di Dusun Siwang, Urimesing, Kecamatan Nusaniwe, Kota Ambon, Maluku. Anda dapat mengakses lokasi ini dengan mudah menggunakan kendaraan sewaan atau angkutan umum karena akses jalan yang baik. Siwang Paradise buka 24 jam dan tiket masuknya sekitar Rp 8.000 per orang. Jika Anda menggunakan fasilitas toilet, akan dikenakan biaya tambahan sekitar Rp 2.000 per pengunjung.\n"
                        + "Kegiatan Menarik di Siwang Paradise:\n"
                        + "1. Menikmati Keindahan Pemandangan: Utama dari kunjungan ke Siwang Paradise adalah menikmati keindahan panorama alam dari atas bukit. Anda dapat bersantai dan menikmati hamparan perbukitan hijau yang luas serta udara segar yang menenangkan.\n"
                        + "2. Trekking: Nikmati pengalaman trekking melintasi alam yang asli dengan menyusuri jalan setapak menuju puncak. Meskipun melelahkan, sensasi mendaki akan memberikan kepuasan tersendiri.\n"
                        + "3. Berswafoto: Jangan lupa untuk berfoto di berbagai spot menarik di Siwang Paradise. Dengan latar belakang pemandangan alam yang indah, momen ini akan menjadi kenangan berharga dari perjalanan Anda.\n"
                        + "4. Bersantai di Hammock: Nikmati suasana damai dan udara segar sembari bersantai di hammock yang tersedia di lokasi.\n"
                        + "5. Menikmati Hidangan Lezat: Setelah puas menjelajahi bukit, Anda dapat mencicipi hidangan lezat di warung-warung makan yang ada di sekitar lokasi.\n"
                        + "Fasilitas yang Tersedia:\n"
                        + "Fasilitas di Siwang Paradise masih terbatas, namun sudah cukup memadai. Anda dapat menemukan beberapa warung makan, toilet, dan spot foto menarik. Namun, tetap jaga kebersihan dan alam sekitar selama kunjungan Anda.",
                -3.7356988,
                128.1687674,
                "https://www.google.com/maps/place/Siwang+Paradise/@-3.7356988,128.1687674,15z/data=!4m6!3m5!1s0x2d6cc3ea8e452e55:0x3c9aa7085f38397e!8m2!3d-3.7356988!4d128.1687674!16s%2Fg%2F11j2p1c6l_?entry=ttu"
        ));

        data.put("Bukit Seri Paralayang", new Wisata(
                "Bukit Seri Paralayang",
                R.drawable.paralayang,
                "Bukit Seri atau disebut paralayang, Tempat Wisata dengan Pemandangan Alam Indah di Kota Ambon\n"
                        + "Bukit Seri, yang terletak di Kota Ambon, merupakan salah satu tempat wisata alam yang menawarkan pemandangan yang indah dan menarik bagi para pengunjung. Awalnya, bukit ini menjadi salah satu spot untuk aktivitas paralayang, tetapi sekarang aktivitas paralayang sudah tidak lagi diselenggarakan di lokasi ini. Meskipun begitu, Bukit Seri masih menjadi destinasi favorit untuk bersantai dan menikmati keindahan alam di Kota Ambon.\n"
                        + "Daya Tarik Bukit Seri:\n"
                        + "1. Pemandangan Indah: Meskipun aktivitas paralayang tidak lagi tersedia, Anda tetap dapat menikmati pemandangan elok dari atas Bukit Seri. Pepohonan yang rindang dan udara segar akan menyapa Anda saat berada di sini. Pemandangan indah Pantai Seri dan pepohonan hijau di sekitarnya memberikan nuansa yang menenangkan.\n"
                        + "2. Bersantai di Gazebo: Bukit Seri memiliki beberapa gazebo tempat Anda dapat bersantai dan menikmati pemandangan sekitar. Tempat ini cocok untuk menghabiskan waktu santai bersama keluarga atau teman-teman sambil menikmati keindahan alam di sekitarnya.\n"
                        + "3. Melihat Sunrise dan Sunset: Bukit Seri menjadi tempat yang tepat untuk menyaksikan keindahan matahari terbit dan terbenam. Menikmati momen indah ini akan memberikan pengalaman tak terlupakan selama kunjungan Anda.\n"
                        + "Lokasi dan Rute Menuju Bukit Seri:\n"
                        + "Bukit Seri terletak di Desa Airlouw, Kecamatan Nusaniwe, Kota Ambon, Maluku. Anda dapat menggunakan peta atau aplikasi penunjuk arah untuk mencapai lokasi ini. Jika perlu bantuan lebih lanjut, bertanya kepada warga setempat akan membantu Anda menemukan rute terbaik.\n"
                        + "Harga Tiket dan Jam Operasional:\n"
                        + "Untuk menikmati keindahan alam di Bukit Seri, Anda hanya perlu membayar tiket masuk seharga Rp 5.000. Tempat ini buka 24 jam sehingga Anda dapat mengunjunginya kapan saja.\n"
                        + "Fasilitas:\n"
                        + "Bukit Seri telah mengalami beberapa pembaruan untuk meningkatkan kenyamanan pengunjung. Kondisi jalanan telah diaspal untuk keamanan dan kenyamanan saat berjalan atau berolahraga di sana. Terdapat juga beberapa gazebo untuk bersantai. Meskipun ada beberapa penjual makanan dan minuman di sekitar area, disarankan untuk membawa bekal sendiri karena fasilitas sanitasi belum tersedia.",
                -3.7612643,
                128.1474116,
                "https://www.google.com/maps/place/Bukit+Paralayang/@-3.7612643,128.1474116,15z/data=!4m6!3m5!1s0x2d6cdd860e4b37d5:0xb9bd56775558cb07!8m2!3d-3.7612643!4d128.1474116!16s%2Fg%2F11hk6w7mkv?entry=ttu"
        ));

        data.put("Benteng Amsterdam", new Wisata(
                "Benteng Amsterdam",
                R.drawable.benteng_amsterdam,
                "Benteng Amsterdam, Mengenal Situs Bersejarah Peninggalan Belanda di Ambon\n"
                        + "Harga Tiket: Rp 20.000, Jam Operasional: 06.00-18.00 WIT, Alamat: Kaitetu, Kec. Leihitu, Kab. Maluku Tengah, Maluku; Map: Cek Lokasi\n"
                        + "Kota Ambon, selain terkenal dengan pesona alamnya yang indah, juga menawarkan destinasi wisata sejarah yang menarik, seperti Benteng Amsterdam. Destinasi sejarah ini menjadi pilihan menarik bagi keluarga saat liburan tiba.\n"
                        + "Benteng Amsterdam awalnya dibangun sebagai loji perdagangan oleh bangsa Portugis di bawah pimpinan Francisco Serrao pada tahun 1512. Kemudian, setelah Belanda menguasai Ambon pada awal abad ke-17, loji ini diubah menjadi batu yang dikelilingi pagar kayu tinggi yang disebut blokhuis.\n"
                        + "Benteng Amsterdam telah menjadi populer di kalangan masyarakat, namun masih ada yang penasaran dengan daya tariknya. Jika Anda termasuk yang penasaran, berikut adalah ulasan mengenai daya tarik dari Benteng Amsterdam.\n"
                        + "Daya Tarik yang Dimiliki Benteng Amsterdam:\n"
                        + "1. Bangunan Bersejarah dari Zaman Portugis: Benteng Amsterdam awalnya dibangun oleh bangsa Portugis di bawah kepemimpinan Francisco Serrao pada tahun 1512. Pada awalnya, bangunan ini berfungsi sebagai loji perdagangan rempah-rempah. Namun, setelah Belanda menguasai Ambon, loji ini diubah menjadi benteng pertahanan. Pengubahan ini terjadi setelah adanya pertempuran antara penjajah Belanda dengan Kerajaan Hitu yang dipimpin oleh Kapitan Kakialy pada tahun 1633 hingga 1654.\n"
                        + "2. Arsitektur Unik: Benteng Amsterdam memiliki konstruksi bangunan yang unik, mirip dengan rumah dengan sebutan Blok Huis oleh bangsa Belanda. Terdiri dari tiga lantai dengan bahan dan fungsi yang berbeda-beda. Lantai satu berbata merah sebagai tempat tidur, lantai dua berkayu besi sebagai tempat pertemuan, dan lantai tiga berkayu besi sebagai pos pemantau. Di bagian atas terdapat menara pengintai dengan jendela berbentuk lengkung yang memperlihatkan keindahan panorama sekitar.\n"
                        + "3. Tempat Tinggal Seorang Naturalis dan Ahli Sejarah: Benteng Amsterdam pernah ditinggali oleh seorang naturalis dan ahli sejarah Jerman bernama George Everhard Rumphius pada tahun 1672 hingga 1702. Ia adalah orang pertama yang menemukan bunga Anggrek khas Pulau Ambon dan menulis buku tentang gempa dan tsunami yang melanda Maluku pada waktu itu.\n"
                        + "Alamat dan Rute Menuju Lokasi:\n"
                        + "Benteng Amsterdam terletak di perbatasan antara Negeri Hila dan Negeri Kaitetu, Kecamatan Leihitu, Kabupaten Maluku Tengah, Provinsi Maluku. Dari pusat Kota Ambon, lokasi benteng ini berjarak sekitar 42 kilometer dan dapat diakses dengan kendaraan pribadi dalam waktu sekitar 1 jam. Anda dapat menggunakan bantuan Google Maps atau bertanya kepada penduduk setempat untuk mencapai lokasi ini.\n"
                        + "Harga Tiket Masuk dan Jam Operasional:\n"
                        + "Harga tiket masuk ke Benteng Amsterdam tergolong terjangkau, yaitu sekitar Rp 20.000 per orang. Benteng ini buka setiap hari, kecuali hari Sabtu, mulai pukul 6 pagi hingga 6 sore.\n"
                        + "Kegiatan Menarik di Benteng Amsterdam:\n"
                        + "1. Menikmati Keunikan Arsitektur: Nikmati keindahan dan keunikan arsitektur bangunan Benteng Amsterdam yang masih berdiri kokoh hingga saat ini.\n"
                        + "2. Berfoto Selfie di Spot-Spot Menarik: Manfaatkan momen berkunjung untuk berfoto selfie di spot-spot menarik di sekitar benteng. Latar belakang bangunan bersejarah akan menambah estetika foto Anda.\n"
                        + "Fasilitas yang Tersedia:\n"
                        + "Benteng Amsterdam dilengkapi dengan fasilitas pendukung yang memadai, termasuk area parkir luas, warung makan, restoran, dan tempat penginapan dekat dengan lokasi wisata. Harga tiket yang terjangkau dan fasilitas yang lengkap akan membuat kunjungan Anda lebih nyaman dan tak terlupakan.\n"
                        + "Catatan: Selalu jaga kebersihan dan alam sekitar selama berkunjung ke Benteng Amsterdam. Pastikan untuk selalu mengikuti aturan dan petunjuk yang ada di lokasi. Sebelum melakukan perjalanan, pastikan untuk memeriksa informasi terkini dan jam operasional dengan menghubungi pihak berwenang setempat atau instansi pariwisata.",
                -3.5828682,
                128.0831395,
                "https://www.google.com/maps/place/Cagar+Budaya+Benteng+Amsterdam/@-3.5828682,128.0831395,15z/data=!4m6!3m5!1s0x2d6cfad4c6874ac7:0xb2ee545928ea5c55!8m2!3d-3.5828682!4d128.0831395!16s%2Fm%2F0wyjt8d?entry=ttu"
        ));

        data.put("Benteng Victoria", new Wisata(
                "Benteng Victoria",
                R.drawable.benteng_victoria,
                "Benteng Victoria: Destinasi Wisata Bersejarah yang Tak Boleh Dilewatkan di Kota Ambon\n"
                        + "Berkunjung ke Kota Ambon tidak akan lengkap tanpa mengunjungi Benteng Victoria, sebuah bangunan bersejarah peninggalan Portugis yang menarik untuk dijelajahi. Benteng ini menawarkan pemandangan megah, termasuk meriam raksasa, patung kayu berukir, dan berbagai koleksi menarik lainnya.\n"
                        + "Harga tiket masuk ke Benteng Victoria sebesar Rp 20.000, dan jam operasionalnya adalah dari pukul 08.00 hingga 18.00 WIB. Alamatnya terletak di Jalan Slamet Riyadi, Uritetu, Kecamatan Sirimau, Kota Ambon, Maluku.\n"
                        + "Benteng Victoria, yang merupakan peninggalan Portugis, adalah destinasi wisata yang wajib dikunjungi ketika berada di Ambon. Bangunan megah ini telah menjadi cagar budaya Indonesia dan memiliki nilai sejarah yang kaya. Ingin tahu lebih banyak tentang keindahan Benteng Victoria? Berikut adalah informasi lengkap mengenai benteng tertua di Ambon yang dapat menjadi tujuan wisata yang menyenangkan.\n"
                        + "Fakta Sejarah Benteng Victoria\n"
                        + "Benteng Victoria awalnya didirikan oleh Portugis sekitar tahun 1575 dan awalnya diberi nama Nossa Senhora da Anunciada, mengambil nama dari hari Kenaikan Isa Almasih yang disebut \"Anunciada.\" Pada tahun 1689, benteng ini mengalami beberapa perbaikan dan perluasan. Selama pemerintahan Gubernur van Pleuren pada tahun 1775 hingga 1785, perbaikan besar-besaran dilakukan.\n"
                        + "Pada masa pemerintahan Belanda, benteng ini digunakan sebagai pusat pemerintahan kolonial dan juga berfungsi sebagai pelabuhan yang menghubungkan pulau-pulau di sekitarnya. Benteng ini juga berfungsi sebagai tempat pertahanan dari serangan masyarakat pribumi yang memberontak.\n"
                        + "Daya Tarik Benteng Victoria\n"
                        + "Benteng Victoria adalah destinasi wisata yang dicari oleh para pelancong yang tertarik dengan sejarah. Pengunjung akan menikmati bangunan bergaya Eropa yang dibangun oleh Portugis ratusan tahun yang lalu. Meskipun berusia tua, benteng ini masih kokoh dan dihiasi dengan pernak-pernik yang terawat dengan baik.\n"
                        + "Salah satu hal menarik yang bisa ditemukan di sini adalah sisa-sisa meriam berukuran raksasa dan patung-patung kayu berukir yang dipajang di beberapa ruangan. Pengunjung juga dapat melihat peta perkembangan kota Ambon dari abad XVII hingga abad IX.\n"
                        + "Alamat, Rute Lokasi, dan Tiket Masuk\n"
                        + "Benteng Victoria terletak di Jalan Slamet Riyadi, Kecamatan Sirimau, Kota Ambon, Maluku, dan berada di tengah kota sehingga mudah diakses oleh wisatawan. Untuk mencapai Ambon, Anda dapat menggunakan transportasi udara atau laut. Terdapat banyak maskapai penerbangan yang melayani rute ke Bandara Pattimura di Ambon. Jika menggunakan transportasi laut, kapal PELNI Leuser atau PELNI Bukit Raya bisa menjadi pilihan.\n"
                        + "Sebelum menikmati keindahan benteng ini, pengunjung harus membayar tiket masuk seharga Rp 20.000. Benteng beroperasi mulai pukul 8 pagi hingga pukul 6 sore. Disarankan untuk mengunjungi benteng ini pada sore hari untuk menikmati pemandangan matahari terbenam yang indah di Teluk Ambon.\n"
                        + "Kegiatan Menarik di Benteng Victoria\n"
                        + "Selain menikmati bangunan bersejarah, pengunjung dapat menikmati pemandangan indah Teluk Ambon yang menakjubkan dari depan benteng. Saat sore hari, pemandangan matahari terbenam bisa menjadi momen yang sempurna untuk berburu foto indah. Selain itu, di sekitar benteng terdapat banyak warung dan kafe yang menyajikan berbagai kuliner khas Ambon yang lezat.\n"
                        + "Karena lokasinya di pusat kota, pengunjung juga dapat berburu oleh-oleh yang unik dan menarik sebelum pulang. Beberapa pilihan oleh-oleh meliputi aksesoris, baju dengan tulisan Ambon, dan kayu putih yang terkenal sebagai obat tradisional khas Ambon.\n"
                        + "Penginapan Dekat dengan Benteng Victoria\n"
                        + "Di sekitar Benteng Victoria terdapat beberapa penginapan yang dapat menjadi tempat istirahat yang nyaman. Stori Hotel Ambon dan Hotel Santika Premiere Ambon adalah pilihan terpercaya dan cukup dekat dengan benteng.\n"
                        + "Stori Hotel Ambon menyajikan fasilitas yang memadai dengan harga sekitar 200 ribu per malam, sementara Hotel Santika Premiere Ambon menawarkan pemandangan pantai yang indah dari jendela kamar dengan desain modern dan perpaduan warna yang menarik.\n"
                        + "Itulah informasi lengkap mengenai Benteng Victoria, destinasi wisata bersejarah yang tak boleh dilewatkan ketika berkunjung ke Kota Ambon. Dari sisi sejarah hingga kegiatan menarik yang bisa dilakukan, benteng ini menawarkan pengalaman wisata yang tak terlupakan di Maluku.",
                -3.6927869,
                128.1824825,
                "https://www.google.com/maps/place/Benteng+Nieuw+Victoria/@-3.6927869,128.1824825,15z/data=!4m6!3m5!1s0x2d6ce850f28ddc35:0xe2373ab58800130a!8m2!3d-3.6927869!4d128.1824825!16s%2Fg%2F1q5hbc1bs?entry=ttu"
        ));

        data.put("Air Panas Hatuasa Tulehu", new Wisata(
                "Air Panas Hatuasa Tulehu",
                R.drawable.air_panas,
                "Air Panas Hatuasa Tulehu, Menikmati Keeksotisan Pemandian Alami di Kota Ambon\n"
                        + "Harga Tiket: Rp 5.000, Jam Operasional: 09.00–17.00 WIT, Alamat: Tulehu, Kec. Salahutu, Kab. Maluku Tengah, Maluku; Map: Cek Lokasi\n"
                        + "Kota Ambon menawarkan berbagai pesona keindahan alamnya, salah satunya adalah Air Panas Hatuasa Tulehu, sebuah destinasi wisata alam yang menarik perhatian wisatawan. Meskipun masih dikelola secara sederhana, pemandian air panas ini telah menjadi favorit warga lokal dan wisatawan yang datang berkunjung.\n"
                        + "Banyak orang datang ke pemandian air panas ini untuk merasakan sensasi berendam di air panas, yang diklaim mampu menghilangkan kelelahan setelah beraktivitas. Air Panas Hatuasa Tulehu memiliki banyak daya tarik yang jarang diketahui banyak orang, terutama bagi mereka yang belum pernah mengunjungi tempat wisata ini.\n"
                        + "Daya Tarik Air Panas Hatuasa Tulehu:\n"
                        + "1. Penemuan oleh Purnawirawan TNI: Pemandian Air Panas Hatuasa Tulehu ditemukan secara tidak sengaja oleh seorang purnawirawan TNI bernama Haji Muhammad Nahumaruri pada tahun 1990-an. Saat membuka kebun pohon sagu di tanah miliknya, air panas dengan aliran deras muncul. Lama-kelamaan, air panas tersebut dibuka menjadi pemandian air panas yang ada saat ini.\n"
                        + "2. Suasana Sejuk dan Asri: Meskipun suhunya cukup panas, suasana di sekitar pemandian air panas ini terasa sejuk dan asri. Terletak di perbukitan dengan vegetasi pohon yang lebat, suasana di pemandian ini memberikan sensasi menyegarkan bagi pengunjung.\n"
                        + "3. Kolam Dibagi Menjadi Dua Bagian: Di Air Panas Hatuasa Tulehu, terdapat kolam yang dibagi menjadi dua bagian. Pengunjung bisa memilih untuk berendam di kolam dengan air panas atau di kolam dengan air hangat. Terdapat juga kucuran panjang di kolam untuk pijat alami setelah berendam.\n"
                        + "Alamat dan Rute Menuju Lokasi:\n"
                        + "Pemandian Air Panas Hatuasa Tulehu terletak di Desa Tulehu, Kecamatan Salahutu, Kabupaten Maluku Tengah, Provinsi Maluku. Meskipun jaraknya cukup jauh dari pusat Kota Ambon, sekitar satu hingga dua jam perjalanan, tetapi sensasi berendam di pemandian ini akan sebanding dengan perjalanan yang Anda tempuh.\n"
                        + "Harga Tiket Masuk dan Jam Operasional:\n"
                        + "Harga tiket masuk ke Air Panas Hatuasa Tulehu sangat terjangkau, hanya sekitar Rp 5 ribu per orang ditambah biaya parkir kendaraan. Pemandian ini buka mulai pukul 09.00 pagi hingga pukul 17.00 WIT.\n"
                        + "Kegiatan Menarik di Air Panas Hatuasa Tulehu:\n"
                        + "1. Berendam di Kolam Air Panas: Salah satu aktivitas yang wajib dilakukan adalah berendam di kolam air panas ini. Suhu air yang panas dan kucuran panjang di kolam memberikan sensasi pijatan alami yang menyegarkan.\n"
                        + "2. Berfoto Selfie dengan Pemandangan Menarik: Nikmati momen liburan dengan berfoto selfie di area pemandian dengan latar belakang pemandangan alam yang menarik.\n"
                        + "Fasilitas yang Tersedia:\n"
                        + "Air Panas Hatuasa Tulehu menyediakan fasilitas yang memadai bagi kenyamanan pengunjung, termasuk ruang ganti, kamar mandi, warung makan, dan mushola. Harga tiket yang terjangkau dan fasilitas yang lengkap membuat kunjungan Anda lebih menyenangkan.\n"
                        + "Catatan: Selalu jaga kebersihan dan lingkungan sekitar selama berkunjung ke Air Panas Hatuasa Tulehu. Pastikan untuk selalu mengikuti aturan dan petunjuk yang ada di lokasi. Sebelum melakukan perjalanan, pastikan untuk memeriksa informasi terkini dan jam operasional dengan menghubungi pihak berwenang setempat atau instansi pariwisata.",
                -3.5930289,
                128.3064649,
                "https://www.google.com/maps/place/Air+Panas+Tulehu/@-3.5930289,128.3064649,17z/data=!3m1!4b1!4m6!3m5!1s0x2d6ced51d3a82f9d:0x5f4e01bca0cc1e18!8m2!3d-3.5930289!4d128.3086536!16s%2Fg%2F11cnbtyj6f?hl=id&entry=ttu"
        ));

        data.put("Taman Pattimura", new Wisata(
                "Taman Pattimura",
                R.drawable.taman_pattimura,
                "Taman Pattimura di Ambon merupakan destinasi wisata yang menarik, berlokasi tidak jauh dari Gong Perdamaian. Taman ini memiliki luas area 11 ribu meter persegi dan dilengkapi dengan dua lapangan basket dan voli, satu air mancur dan panggung terbuka, taman, serta pedestrian yang mengelilingi taman dengan empat pintu gerbang.\n"
                        + "Di tengah Taman Pattimura berdiri patung Pahlawan Nasional Kapitan Pattimura yang terbuat dari perunggu setinggi tujuh meter dan beratnya hampir mencapai empat ton. Patung ini dibuat sebagai pengingat akan kisah kepahlawanannya sebagai putra Maluku. Pembuatan patung ini memerlukan dana sebesar Rp 2 miliar dan diresmikan oleh Wali Kota Ambon pada 7 September 2019.\n"
                        + "Taman Pattimura juga memiliki makna historis yang mendalam. Monumen Pattimura didukung oleh lima kolam penyangga menunjukkan angka lima sebagai bulan Mei, dan anak tangga menuju monumen berjumlah sepuluh dengan pelataran berpola delapan buah anak panah menunjukkan angka 18. Sementara itu, keempat sisi kolom penyangga monumen dilengkapi dengan 17 balok menunjukkan angka 17, sehingga jika digabungkan, mencerminkan tahun 1817, saat Pattimura memimpin perlawanan melawan penjajahan Belanda di Maluku.\n"
                        + "Patung Pattimura menjadi simbol penting untuk mengenang perjuangan dan kepahlawanannya, terutama dalam pertempuran besar yang mempersatukan rakyat Maluku melawan penjajah Belanda untuk merebut Benteng Duurstede.\n"
                        + "Tak jauh dari Taman Pattimura, sekitar 50 meter dari Patung Pattimura, berdiri Gong Perdamaian. Gong Perdamaian ini merupakan bagian dari upaya pemulihan kehidupan di Ambon pasca tragedi kemanusiaan pada tahun 1999. Gong ini berdiameter sekitar 2 meter dan berisi gambar bendera dari berbagai negara di seluruh dunia, serta beberapa lambang agama besar. Monumen Gong Perdamaian Dunia ini juga dilengkapi dengan lambang Pancasila, menjadi gong perdamaian dunia ke-35 di dunia.\n"
                        + "Kedua destinasi wisata ini memberikan makna yang mendalam bagi warga Kota Ambon dan menjadi pusat kegiatan bagi masyarakat setempat. Taman Pattimura dan Gong Perdamaian merupakan bagian penting dalam melestarikan sejarah dan meningkatkan kesadaran akan perdamaian dan toleransi di daerah tersebut.",
                -3.6905973,
                128.1810274,
                "https://www.google.com/maps/place/Taman+Pattimura/@-3.6905973,128.1810274,17z/data=!4m6!3m5!1s0x2d6ce8519e8f62bd:0xdd06871045372d08!8m2!3d-3.6930491!4d128.1836667!16s%2Fg%2F1pp2vm95d?entry=ttu"
        ));

        data.put("Taman Makam Pahlawan", new Wisata(
                "Taman Makam Pahlawan",
                R.drawable.taman_makam_pahlawan,
                "Ambon, ibukota provinsi Maluku, memiliki daya tarik wisata yang tak hanya terletak pada keindahan alam dan budaya, tetapi juga menyimpan warisan sejarah yang luar biasa. Selain kisah perjuangan meraih kemerdekaan Bangsa Indonesia, kota ini memiliki hubungan sejarah dengan negara lain di luar Indonesia, seperti perjuangan para tentara ANZAC melawan Jepang pada Perang Dunia II.\n"
                        + "ANZAC adalah satuan tentara gabungan Australia dan Selandia Baru yang awalnya bertempur melawan Turki pada Perang Dunia I. Namun, pada Perang Dunia II, pasukan ANZAC diberi misi untuk melawan kekuatan Jepang. Di Ambon, terdapat sebuah taman makam yang menjadi tempat peristirahatan para pejuang ANZAC yang gugur dalam pertempuran melawan Jepang. Makam ini dibentuk dengan indah dan menarik minat wisatawan sebagai salah satu objek wisata yang unik.\n"
                        + "Ternyata, wilayah makam tersebut sebelumnya merupakan penampungan tawanan perang Australia yang kemudian dibeli oleh pemerintah Australia untuk dijadikan tempat pemakaman bagi para serdadu ANZAC dari Batalyon 2/21 Australia \"Gull Force\". Keluarga para serdadu yang gugur sering mengunjungi kompleks pemakaman ini, terutama pada tanggal 25 April sebagai peringatan ANZAC day, hari di mana pasukan ANZAC pertama kali diterjunkan ke Gallipoli, Turki, pada Perang Dunia I.\n"
                        + "Pemerintah Indonesia bekerja sama dengan pemerintah Australia untuk mengelola dan merawat kompleks pemakaman ini dengan baik. Suasana di kompleks pemakaman terasa seperti berada di pemakaman luar negeri dengan rumput yang terawat, makam yang rapi, dan pepohonan yang meneduhkan. Monumen dengan nama-nama para serdadu yang gugur juga menghiasi dekat pintu gerbang.\n"
                        + "Tempat ini juga berdekatan dengan Makam Pahlawan Nasional Indonesia di kota Ambon. Semua biaya perawatan pemakaman ini ditanggung oleh Australia. Melalui kompleks pemakaman ini, para pengunjung dapat mengenang perjuangan dan menghargai jasa para tentara ANZAC yang gugur dalam mempertahankan kemerdekaan dan perdamaian.",
                -3.6756274,
                128.1904399,
                "https://www.google.com/maps/place/Taman+Makam+Pahlawan+Nasional+Kapahaha/@-3.6756274,128.1904399,15z/data=!4m2!3m1!1s0x0:0x91659d8748a280cd?sa=X&ved=2ahUKEwj9k9Hlp7SAAxU1xzgGHQ-9BUMQ_BJ6BAhTEAA&ved=2ahUKEwj9k9Hlp7SAAxU1xzgGHQ-9BUMQ_BJ6BAhgEAg"
        ));

        data.put("Patung Martha Christina Tiahahu", new Wisata(
                "Patung Martha Christina Tiahahu",
                R.drawable.monumen_tiahahu,
                "Patung Christina Martha Tiahahu adalah sebuah monumen bersejarah di Ambon yang menjadi simbol perjuangan wanita dalam membela tanah air di Maluku. Monumen ini didirikan sebagai penghormatan atas keberanian dan dedikasi Christina Martha Tiahahu, seorang pahlawan wanita asal Maluku yang melawan penjajahan Belanda.\n"
                        + "Christina Martha Tiahahu lahir pada tahun 1800 di desa kecil Abubu, Pulau Nusalaut, Maluku Tengah. Sejak kecil, ia sudah menunjukkan sifat pemberani dan bersemangat. Saat ayahnya, Paulus Tiahahu, yang merupakan pemimpin perjuangan rakyat Maluku, terlibat dalam perlawanan melawan penjajahan Belanda, Martha sering ikut serta dalam rapat perencanaan perang.\n"
                        + "Ketika dewasa, Martha Tiahahu aktif berjuang bersama para pejuang dalam berbagai pertempuran melawan penjajah. Meskipun banyak pejuang Maluku tertangkap, termasuk ayahnya yang akhirnya dihukum mati, Martha tidak gentar dan terus melanjutkan perjuangan. Ia terus bergerilya bersama para pejuang di berbagai pertempuran, hingga akhirnya ditangkap dan diasingkan ke Pulau Jawa.\n"
                        + "Meskipun berada dalam kondisi tawanan, Martha tidak menyerah kepada penjajah Belanda. Ia bahkan mogok makan sebagai bentuk protes atas penindasan tersebut. Christina Martha Tiahahu akhirnya meninggal di atas kapal perang milik Belanda, Eversten, dalam perjalanan pengasingan ke Pulau Jawa pada Januari 1818.\n"
                        + "Monumen Christina Martha Tiahahu dibangun sebagai tanda penghormatan atas jasa-jasanya dalam perjuangan melawan penjajah. Monumen ini menjadi salah satu destinasi wisata bersejarah yang menarik di kota Ambon.\n"
                        + "Daya tarik dari monumen ini termasuk pemandangan kota Ambon dari lokasi monumen, spot foto di depan patung yang menggambarkan Christina Martha Tiahahu sedang melempar batu, pemandangan matahari terbenam (sunset) di sore hari, dan sorotan lampu pada patung di malam hari yang membuatnya terlihat estetik.\n"
                        + "Monumen Christina Martha Tiahahu terletak di Karang Panjang, Kecamatan Teluk Ambon, Kota Ambon, Maluku. Lokasinya tidak jauh dari pusat kota Ambon, dan Anda dapat menggunakan Google Maps untuk memudahkan mencarinya.\n"
                        + "Harga tiket masuk ke monumen ini terjangkau, yaitu sekitar Rp 5.000 per orang. Monumen ini buka 24 jam sehingga dapat dikunjungi kapan saja. Di sekitar monumen juga tersedia fasilitas seperti kamar mandi umum, tempat makan, dan area parkir.\n"
                        + "Patung Christina Martha Tiahahu menjadi ikon penuh perjuangan wanita di tanah Maluku dan mengagumkan banyak orang, termasuk segenap bangsa Indonesia yang menghormatinya sebagai Pahlawan Nasional.",
                -3.6875195,
                128.1923212,
                "https://www.google.com/maps/place/Patung+Christina+Martha+Tiahahu/@-3.6875195,128.1923212,15z/data=!4m6!3m5!1s0x2d6ce92a8fd6d89b:0x8966dc572c62f750!8m2!3d-3.6875195!4d128.1923212!16s%2Fg%2F11btykb0zv?entry=ttu"
        ));

        data.put("Gong Perdamaian", new Wisata(
                "Gong Perdamaian",
                R.drawable.gong_perdamaian,
                "Monumen Gong Perdamaian Ambon adalah sebuah monumen yang memiliki makna indah dan mendalam di balik keberadaannya. Monumen ini didirikan sebagai pengingat atas tragedi kemanusiaan yang terjadi di Ambon pada tahun 1999, yang tidak akan pernah terlupakan oleh seluruh Bangsa Indonesia.\n"
                        + "Tragedi tersebut meninggalkan luka yang mendalam dan meninggalkan kesedihan yang masih dirasakan hingga kini. Kerusuhan berbau SARA (Suku, Agama, Ras, dan Antar Golongan) ini menjadi aib memalukan bagi Bangsa Indonesia di mata dunia, yang selama ini dikenal sebagai bangsa yang ramah, toleran, dan menghormati satu sama lain.\n"
                        + "Namun, meskipun tragedi itu menyisakan luka yang dalam, masyarakat Ambon tidak berdiam diri saja. Mereka berjuang untuk pulih dari keterpurukan dan membangun kembali peradaban dengan sikap toleransi yang hampir hilang. Pemerintah juga turut berperan dengan membangun Monumen Gong Perdamaian Dunia sebagai upaya pemulihan kehidupan di Ambon.\n"
                        + "Monumen Gong Perdamaian Dunia ini memiliki diameter sekitar 2 meter dan berisi gambar-gambar bendera negara dari seluruh dunia, serta lambang-lambang agama besar seperti Muslim, Kristen, Hindu, dan Budha. Monumen ini menjadi simbol perdamaian yang diresmikan oleh Presiden Indonesia ke-6, Bapak Susilo Bambang Yudhoyono, pada tanggal 25 November 2009.\n"
                        + "Gong Perdamaian Dunia berada di ketinggian, dan untuk mencapainya, pengunjung harus menaiki beberapa anak tangga. Di bagian atas penyangga gong, tampak jelas lambang Pancasila yang menjelaskan bahwa Pancasila adalah ideologi milik Bangsa Indonesia.\n"
                        + "Monumen ini menjadi refleksi bagi Bangsa Indonesia tentang pentingnya toleransi dalam bernegara dan mewujudkan perdamaian dunia. Lewat Monumen Gong Perdamaian Dunia ini, generasi Indonesia di masa depan diharapkan dapat menciptakan peradaban yang lebih baik dan penuh toleransi daripada generasi sebelumnya.",
                -3.6930873,
                128.1812567,
                "https://www.google.com/maps/place/Monumen+Perdamaian+Dunia/@-3.6930873,128.1812567,15z/data=!4m6!3m5!1s0x2d6ce85058510ac7:0x82e5d75c684bc1d7!8m2!3d-3.6930873!4d128.1812567!16s%2Fg%2F1ptwl3c2q?entry=ttu"
        ));

        data.put("Mesjid Wapauwe", new Wisata(
                "Mesjid Wapauwe",
                R.drawable.mesjid_wapauwe,
                "Mesjid Wapauwe juga menawarkan pengalaman unik karena memiliki keunikan dalam konstruksi bangunannya. Berbeda dengan masjid pada umumnya, bangunan induk masjid ini tidak menggunakan paku atau pasak kayu di setiap sambungan kayunya. Hal ini menjadi salah satu ciri khas yang membedakan Masjid Wapauwe dari masjid-masjid lainnya.\n"
                        + "Daya tarik lain dari Masjid Wapauwe adalah keberadaan dua mushaf Alquran yang ditulis tangan oleh Imam Muhammad Arikulapessy pada tahun 1550 dan Nur Cahya pada tahun 1590. Kedua mushaf tersebut dipamerkan di Festival Istiqlal Jakarta pada tahun 1991 dan 1995, mengesankan banyak orang dengan keindahan tulisannya yang masih terawat dengan baik.\n"
                        + "Selain menjadi tempat ibadah dan pusat keagamaan, masjid ini juga menjadi salah satu tempat wisata religi yang menarik untuk dikunjungi. Wisatawan yang datang dapat menyaksikan arsitektur sederhana masjid yang menggambarkan kehidupan Maluku pada masa lalu. Atapnya yang terbuat dari daun rumbia dan dindingnya dari pelepah sagu kering memberikan nuansa alami dan budaya lokal yang kental.\n"
                        + "Bukan hanya keindahan arsitektur dan nilai sejarahnya, tetapi juga cerita unik tentang Masjid Wapauwe yang pernah berpindah secara gaib. Menurut cerita, ketika penduduk dari kelima kampung yang tinggal di daerah lereng Gunung Wawane turun dan menjadi Negeri Kaitetu, bangunan masjid ini tiba-tiba berada di tengah-tengah kampung lengkap dengan segala isinya. Meskipun usianya sudah tua, mushaf dan manuskrip yang tersimpan di masjid ini tetap terawat dengan baik dan dapat dibaca dengan jelas.\n"
                        + "Bagi para pengunjung, Masjid Wapauwe bukan hanya tempat wisata religi yang bersejarah, tetapi juga menjadi kesempatan untuk bersosialisasi dengan masyarakat sekitar. Berbaur dengan penduduk Negeri Kaitetu, para wisatawan dapat mengenal lebih dekat budaya dan kehidupan masyarakat setempat.\n"
                        + "Jadi, bagi siapa pun yang mengunjungi Maluku, Masjid Wapauwe adalah destinasi yang wajib dikunjungi untuk mengalami pengalaman unik dan memahami lebih dalam sejarah Islam di wilayah tersebut. Dengan arsitektur yang sederhana, peninggalan sejarah berharga, dan cerita yang menarik, masjid ini memberikan pengalaman spiritual dan budaya yang tak terlupakan.",
                -3.5851811,
                128.0842147,
                "https://www.google.com/maps/place/Mesjid+Tua+Wapauwe+Kaitetu/@-3.5851811,128.0842147,15z/data=!4m6!3m5!1s0x2d6cfb2235872847:0xdf25cebb8b53e844!8m2!3d-3.5851811!4d128.0842147!16s%2Fg%2F121bdcn2?entry=ttu"
        ));

        data.put("Mesjid Al Fatah", new Wisata(
                "Mesjid Al Fatah",
                R.drawable.masjid_al_fatah,
                "Masjid Raya Al-Fatah di Ambon adalah sebuah ikonik masjid dengan arsitektur bergaya Arab yang memukau. Selain berfungsi sebagai tempat ibadah bagi umat Islam untuk menjalankan sholat lima waktu, masjid ini juga menjadi tujuan wisata religi yang menarik bagi wisatawan dari luar daerah.\n"
                        + "Masjid Raya Al-Fatah mengalami renovasi besar-besaran pada tahun 2010 yang membuatnya semakin indah dan megah. Terletak berdampingan dengan Masjid Jami' An-Nur, kompleks masjid ini menjadi landmark kota Ambon dan memiliki nilai historis yang signifikan.\n"
                        + "Menariknya, kompleks masjid ini memiliki cerita bersejarah terkait peristiwa kerusuhan pada tahun 1999. Konon, kompleks ini selamat dari serangan perusuh yang tiba-tiba dihentikan oleh pasukan berjubah putih yang muncul dengan misterius.\n"
                        + "Masjid Raya Al-Fatah memiliki berbagai daya tarik bagi pengunjungnya, di antaranya adalah:\n"
                        + "1. Arsitektur Bergaya Arab: Masjid ini memiliki dua menara dan kubah emas yang memukau. Desain pintu berukiran dan mosaik interior menambah pesona arsitektur masjid ini.\n"
                        + "2. Lampu Hias Berwarna-Warni: Di malam hari, masjid ini dilengkapi dengan lampu hias berwarna-warni yang menciptakan pemandangan indah dan unik.\n"
                        + "3. Taman yang Rindang: Masjid ini memiliki taman yang sejuk dan memberikan kesejukan di sekitarnya.\n"
                        + "4. Pemandangan Perbukitan: Kompleks masjid dikelilingi oleh pemandangan perbukitan yang menambah pesona tempat ini.\n"
                        + "5. Bedug Besar di Teras Masjid: Keberadaan bedug besar menambah nilai budaya Islam Nusantara di masjid ini.\n"
                        + "Masjid Raya Al-Fatah terletak di Jalan Sultan Baabullah, Kelurahan Honipopu, Kecamatan Sirimau, Kota Ambon, Maluku. Masjid ini terbuka untuk umum dan tidak membebankan harga tiket masuk. Jam operasionalnya adalah 24 jam, tetapi perubahan jam operasional bisa terjadi tergantung kebijakan pencegahan Covid-19.\n"
                        + "Selain sebagai tempat ibadah, masjid ini juga menjadi pusat kegiatan keagamaan dan sosial masyarakat, seperti pemberdayaan infaq, shodaqoh, zakat, dan wakaf, penyelenggaraan kegiatan pendidikan, dakwah Islam, dan perayaan hari besar Islam.\n"
                        + "Fasilitas yang tersedia di kompleks masjid mencakup area parkir, tempat penitipan alas kaki, ruang belajar (madrasah/TPA), aula serbaguna, gudang, perlengkapan pengurusan jenazah, mobil ambulance, poliklinik, perpustakaan, kantor sekretariat, penyejuk udara/AC, multimedia, dan sound system.\n"
                        + "Wisata religi di Masjid Raya Al-Fatah Ambon akan memberikan pengalaman tak terlupakan bagi pengunjung, dan bagi umat Islam, masjid ini menjadi tempat yang penting untuk menjalankan syariat dan mendalami keberagaman kultur di daerah tersebut.",
                -3.6965846,
                128.1774513,
                "https://www.google.com/maps/place/Masjid+Raya+Al-Fatah/@-3.6965846,128.1774513,15z/data=!4m2!3m1!1s0x0:0xb9617aaf30ddcd08?sa=X&ved=2ahUKEwibxayBqbSAAxW48TgGHQCEBwwQ_BJ6BAhOEAA&ved=2ahUKEwibxayBqbSAAxW48TgGHQCEBwwQ_BJ6BAhcEAg"
        ));

        data.put("Gereja Tua Imanuel", new Wisata(
                "Gereja Tua Imanuel",
                R.drawable.gereja_tua_imanuel,
                "Gereja Tua Immanuel yang juga dikenal sebagai Gereja Tua Hila Ambon, adalah gereja bersejarah yang memiliki banyak kenangan dan makna bagi penulis. Gereja ini dibangun pada tahun 1659 dan merupakan gereja tertua di Provinsi Maluku. Terletak di Desa Hila, Kecamatan Salahutu Leihitu, Kabupaten Maluku Tengah, gereja ini berjarak sekitar 42 km dari pusat kota Ambon.\n"
                        + "Sejarah Gereja Tua Hila mencatat bahwa gereja ini pernah mengalami kerusakan total akibat perang saudara di Provinsi Maluku pada tahun 1999. Namun, setelah kesepakatan bersama, gereja ini berhasil dibangun kembali dengan arsitektur dan bentuk yang sama seperti semula. Bangunannya sangat sederhana, terbuat dari dinding kayu, dan memiliki tiga jendela di setiap sisi dindingnya.\n"
                        + "Satu hal yang membuat penulis menyukai gereja tua ini adalah cerita dan makna di baliknya. Gereja ini berada di lingkungan yang mayoritas Muslim dan dekat dengan Benteng Amsterdam, yang juga memiliki nilai sejarah yang tinggi. Meskipun saat penulis berkunjung, gereja tersebut sudah tidak lagi digunakan sebagai tempat ibadah oleh warga Nasrani setempat, penulis tetap memanjatkan doa agar konflik di daerah ini dapat reda dan perdamaian terwujud.\n"
                        + "Gereja Tua Immanuel menjadi bukti hidup dari sejarah panjang Maluku dan juga menjadi warisan bersejarah bagi daerah tersebut. Meskipun sederhana, gereja ini memiliki daya tarik tersendiri dengan cerita dan kenangan yang melingkupinya. Bagi penulis, kunjungan ke gereja ini bukan sekadar melihat bangunan tua, tetapi juga menyentuh hati dan merenungkan arti perdamaian dan persaudaraan di tengah perbedaan yang ada.",
                -3.583286,
                128.0458446,
                "https://www.google.com/maps/place/Gereja+Tua+Immanuel/@-3.583286,128.0458446,14z/data=!4m10!1m2!2m1!1sgereja+tua+imanuel+peta!3m6!1s0x2d6cfbd15fd55999:0x2b1cee1ce78e3f25!8m2!3d-3.583286!4d128.0839534!15sChdnZXJlamEgdHVhIGltYW51ZWwgcGV0YZIBEXByb3Rlc3RhbnRfY2h1cmNo4AEA!16s%2Fg%2F11g0ds9rtm?entry=ttu"
        ));

        return data;
    }
}