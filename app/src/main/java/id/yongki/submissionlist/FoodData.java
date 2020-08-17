package id.yongki.submissionlist;

import java.util.ArrayList;

public class FoodData {
    private static String[] foodNames = {
            "Bebek Peking, China",
            "Dimsum, Hong Kong",
            "Kari Massaman, Thailand",
            "Nasi Goreng, Indonesia",
            "phad Thai, Thailand",
            "Ramen, Jepang",
            "Rendang, Indonesia",
            "Som Tam - Papaya Salad, Thailand",
            "Sushi, Jepang",
            "Tom Yam Goong, Thailand"
    };

    private static String[] foodDetails = {
            "Bebek peking dimasak dengan cara memanggang bebek dengan api kecil sehingga kulitnya menjadi coklat keemasan dengan lemak-lemak yang sangat enak dan daging yang lembut.\n" +
                    "\n" +
                    "Bebek disajikan dengan dipotong kecil-kecil dan dicelupkan ke saus asin untuk menambah rasa nikmatnya.",
            "Makanan tradisional Kanton ini sangat populer di seluruh dunia.\n" +
                    "\n" +
                    "Mulai dari restoran bintang lima hingga kedai pinggir jalan, di Indonesia juga banyak yang menjual dim sum.\n" +
                    "\n" +
                    "Dim sum dibuat dalam potongan kecil-kecil sehingga Anda tidak perlu memotongnya, namun bisa langsung memakannya menggunakan sumpit.\n" +
                    "\n" +
                    "Dim sum biasanya disajikan dengan bubur beras putih yang gurih.\n" +
                    "\n" +
                    "Makanan hong kong ini memiliki berbagai jenis dan isian, umumya hidangan laut dan ayam.",
            "Lagi-lagi, negara ini menyumbangkan masakan khasnya di dalam daftar 10 besar.\n" +
                    "\n" +
                    "Kari Massaman dengan rasa pedas dan santan yang kental ini memiliki kombinasi rasa yang sangat pas.\n" +
                    "\n" +
                    "Bahkan, semua bumbu instan kari Massaman yang dijual di Thailand akan memiliki rasa yang sama enaknya dengan buatan restoran.",
            "Ribuan pembaca memilih nasi goreng sebagai makanan paling enak di dunia.\n" +
                    "\n" +
                    "Lagi-lagi, Indonesia merajai daftar ini.\n" +
                    "\n" +
                    "Sebelumnya, nasi goreng tidak pernah masuk ke dalam daftar 10 besar, namun tahun ini, nasi goreng naik ke peringkat dua.\n" +
                    "\n" +
                    "Para pembaca mengungkapkan bahwa makanan ini dengan kombinasi rasa yang pedas dan telur ceplok sangat menggugah selera.",
            "Pad thai adalah perpaduan antara mie goreng dengan berbagai sayuran yang dimasak dengan bumbu pasta asam.\n" +
                    "\n" +
                    "Rahasia kelezatan makanan ini ada pada pasta yang digunakan.\n" +
                    "\n" +
                    "Pad thai juga memiliki banyak penggemar dalam survey CNN ini.\n",
            "Mi kuah dengan berbagai tambahan isian ini juga sangat terkenal.\n" +
                    "\n" +
                    "Di Jepang, tradisinya jika Anda makan ramen dan ramen itu enak, maka Anda harus memakan ramen dengan gaya menghisap yang menimbulkan suara cukup keras.\n" +
                    "\n" +
                    "Itu untuk menunjukkan penghormatan Anda pada chef yang telah memasak ramen enak itu.\n" +
                    "\n" +
                    "Kuah mi ini dibuat dari kaldu yang gurih dan menimbulkan sensasi hangat saat memakannya.",
            "Rendang adalah makanan khas suku Minang dari Sumatera Utara.\n" +
                    "\n" +
                    "Dibuat dari daging sapi dengan rempah-rempah dan minyak dari kelapa sangrai, makanan yang satu ini memang tidak ada duanya.\n" +
                    "\n" +
                    "Di Indonesia, rendang bisa didapat dengan mudah di seluruh rumah makan Padang.",
            "Papaya salad ini mirip dengan rujak yang ada di Indonesia.\n" +
                    "\n" +
                    "Kuah asam pedasnya terbuat dari buah asam, perasan jeruk nipis, kecap ikan, pasta gula murni, bawang putih dan cabai.\n" +
                    "\n" +
                    "Campuran pepaya muda yang diserut, tomat, kacang panjang, dan ebi goreng disiram kuah pedas ini menjadi primadona di Thailand.",
            "Persatuan nasi dan hasil laut mentah yang segar di Jepang membuat seluruh wisatawan pasti mengidolakan makanan ini.\n" +
                    "\n" +
                    "Sushi adalah contoh makanan yang sederhana, sehat, mengenyangkan, sekaligus sangat enak.\n",
            "Sup dengan kuah kental ini juga digemari banyak orang.\n" +
                    "\n" +
                    "Tom yam biasanya berisi makanan laut seperti udang, ikan, daging kepiting dengan rasa sup yang pedas serta sedikit asam.\n" +
                    "\n" +
                    "Tom yam disajikan saat panas dan memang sup ini memiliki rasa yang enak."



    };

    private static int[] foodImages = {
            R.drawable.bebekpeking,
            R.drawable.dimsum,
            R.drawable.karimassaman,
            R.drawable.nasgor,
            R.drawable.phadthai,
            R.drawable.ramen,
            R.drawable.rendang,
            R.drawable.somtam,
            R.drawable.sushi,
            R.drawable.tomyam
    };

    static ArrayList<FoodModel> getListData() {
        ArrayList<FoodModel> list = new ArrayList<>();
        for (int position = 0; position < foodNames.length; position++) {
            FoodModel food = new FoodModel();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}
