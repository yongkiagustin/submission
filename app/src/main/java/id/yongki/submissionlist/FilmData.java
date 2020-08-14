package id.yongki.submissionlist;

import java.util.ArrayList;

public class FilmData {
    private static String[] filmNames = {
            "Captain America : Civil War",
            "Deadpool",
            "Guardian Of Galaxy",
            "The Incredible Hulk",
            "Logan",
            "Spiderman - Far From Home",
            "The New Mutant",
            "Thor",
            "Venom",
            "X-men"
    };

    private static String[] filmDetails = {
            "Sesuai dengan judulnya, Captain America : Civil War memang menampilkan pertarungan sengit antara Captain America dengan Iron Man. Di poster filmnya pun terlihat deretan pahlawan super yang saling berhadapan. Satu tim dipimpin Captain America, sementara yang lain dimotori Iron Man.",
            "Film ini bercerita tentang seorang mantan tentara bernama Wade Wilson (Ryan Reynolds). Dia berpacaran dengan Vanessa (Morena Baccarin). Setelah lama berpacaran, Wilson mengajak Vanessa menikah. Sayangnya, saat itu Wilson baru tahu bahwa dirinya punya penyakit kanker. Hal itu membuatnya cukup sedih.",
            "Guardians of the Galaxy mengisahkan seorang pria bernama Peter Quill yang hidup di planet lain luar bumi. Peter Quill hidup sebagai pencuri yang bekerja untuk Ravagers, kelompok perompak luar angkasa. Suatu ketika Peter Quill sedang dalam misi untuk mencuri sebuah bola misterius di suatu planet tak berpenghuni. Tiba-tiba Peter Quill diserang oleh kawanan tentara bersenjata yang tidak dikenalnya, namun Peter Quill berhasil kabur. Selanjutnya, Peter Quill juga harus melawan seorang wanita petarung bernama Gamora yang ingin merebut bola itu darinya.",
            "Seorang profesor bernama Bruce Banner berubah menjadi makhluk hijau raksasa dan kuat setelah terpapar sinar gamma akibat kecelakaan yang terjadi di sebuah laboratorium. Saat menjadi makhluk hijau raksasa, ia dipanggil Hulk.",
            "Bercerita tentang satu karakter X-Men, The Wolverine membuat lini masa X-Men menjadi semakin rumit. Wolverine berkunjung ke Jepang untuk bertemu teman lamanya yang ia selamatkan di Perang Dunia II. Di Jepang modern, Wolverine berada di dunia yang tak dikenalinya saat harus menghadapi musuh bebuyutannya dalam pertempuran hidup dan mati. Film garapan James Mangold ini membawa Wolverine terlibat dalam konflik Yakuza dan mutan.",
            "Spiderman Far From Home menceritakan tentang perjalanan kehidupan Peter Parker ( Tom Holland ) setelah Avangers Endgame. Ia merasa sangat kehilangan Tony Startk alias Iroman selaku mentor dalam perjalanannya menjadi super hero.",
            "'The New Mutants' menceritakan petualangan remaja yang memiliki latar belakang yang berbeda. Lima orang mutan muda yang masing-masing mengetahui kemampuannya dan ditahan di sebuah fasilitas rahasia yang melawan keinginan mereka. Kelima mutan ini harus berjuang melepaskan diri dari dosa masa lalu dan menyelamatkan dirinya sendiri. 'The New Mutants' berdasarkan dari komik dengan judul yang sama.",
            "Beberapa tahun sebelumnya, Bor, Ayah dari Odin (Anthony Hopkins), bertempur melawan Dark Elf Malekith. Malekith (Christopher Eccleston) berencana menghancurkan alam semesta menggunakan senjata bernama Aether. Setelah Bor berhasil mengalahkan mereka, Malekith dikirim menuju penjara dan Aether dilindungi oleh Bor. Sayangnya, beberapa saat kemudian, Malekith berhasil melarikan diri. Beberapa tahun setelahnya, Thor (Chris Hemsworth) bersama prajurit lainnya bertugas menjaga kedamaian.",
            "Venom menceritakan kisah Eddie Brock (Tom Hardy) seorang jurnalis yang mempertanyakan kasus yang dihindari oleh pemerintah. Hal itu membuatnya melakukan investigasi pada perusahaan Life Foundation yang dijalankan oleh Carlton Drake (Riz Ahmed).",
            "Charles Xavier dan Erik Lensherr memimpin dua kelompok mutan dengan misi yang berseberangan. Mutan dan manusia hidup berdampingan di dunia selama berabad-abad."

    };

    private static int[] filmImages = {
            R.drawable.captain,
            R.drawable.deadpool,
            R.drawable.guardian,
            R.drawable.hulk,
            R.drawable.logan,
            R.drawable.spiderman,
            R.drawable.thenewmutant,
            R.drawable.thor,
            R.drawable.venom,
            R.drawable.xmen
    };

    static ArrayList<FilmModel> getListData() {
        ArrayList<FilmModel> list = new ArrayList<>();
        for (int position = 0; position < filmNames.length; position++) {
            FilmModel film = new FilmModel();
            film.setName(filmNames[position]);
            film.setDetail(filmDetails[position]);
            film.setPhoto(filmImages[position]);
            list.add(film);
        }
        return list;
    }
}
