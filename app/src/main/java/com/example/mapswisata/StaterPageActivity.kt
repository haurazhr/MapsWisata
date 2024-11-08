package com.example.mapswisata

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mapswisata.Adapter.adapterwisata
import com.example.mapswisata.Model.modelwisata

class StaterPageActivity : AppCompatActivity() {

    private lateinit var RecyclerViewMenu: RecyclerView
    private lateinit var AdapterMenu: adapterwisata

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stater_page)

        val menuIcons = listOf(
            modelwisata(
                R.drawable.jamgadang,
                "Jam Gadang",
                "Bukittinggi",
                "Jam Gadang adalah menara jam yang menjadi penanda atau ikon Kota Bukittinggi, Sumatera Barat, Indonesia. Menara jam ini menjulang setinggi 27 meter dan diresmikan pembangunannya pada 25 Juli 1927.",
                -0.305441, // Latitude for Jam Gadang
                100.3692

                ),
            modelwisata(
                R.drawable.danaus,
                "Danau Singkarak",
                "Solok",
                "Danau Singkarak adalah sebuah danau yang membentang di dua kabupaten yang terdapat di provinsi Sumatera Barat, Indonesia, yaitu kabupaten Solok dan kabupaten Tanah Datar.",
                -0.6033184114409337,   // Latitude for Danau Singkarak
                100.54082521142094

            ),
            modelwisata(
                R.drawable.ngarai,
                "Ngarai Sianok",
                "Bukittinggi - Agam",
                "Ngarai Sianok adalah sebuah lembah yang menakjubkan yang terletak di sekitar Bukittinggi, Sumatera Barat. Dikenal dengan pemandangan alamnya yang spektakuler, Ngarai Sianok dikelilingi oleh tebing curam dan hutan tropis yang rimbun, menciptakan suasana yang tenang dan damai.",
                -0.30774290473790933,
                100.36457177926765

            ),
            modelwisata(
                R.drawable.kebun,
                "Kebun Teh",
                "Alahan panjang",
                "Kebun Teh Alahan Panjang adalah salah satu destinasi wisata alam yang populer di Kabupaten Solok, Sumatera Barat. Berada pada ketinggian sekitar 1.400 meter di atas permukaan laut, kebun teh ini menyajikan pemandangan indah dari hamparan tanaman teh yang hijau dan rapi, berlatar belakang perbukitan dan pegunungan. Suasana di Alahan Panjang sangat sejuk dan segar, menjadikannya tempat ideal untuk melepas penat dan menikmati udara pegunungan yang bersih.",
                -1.0345897676124225,
                100.68416119407189

            ),
            modelwisata(
                R.drawable.pantai,
                "Pantai Air Manis",
                "Padang",
                "Ngarai Sianok adalah sebuah lembah yang menakjubkan yang terletak di sekitar Bukittinggi, Sumatera Barat. Dikenal dengan pemandangan alamnya yang spektakuler, Ngarai Sianok dikelilingi oleh tebing curam dan hutan tropis yang rimbun, menciptakan suasana yang tenang dan damai.",
                -0.9903519302171744,
                100.36064943809477
            ),

            modelwisata(
                R.drawable.gambar1,
                "Istano Pagaruyung",
                "Batusangkar",
                "Istano Basa Pagaruyung adalah istana kebudayaan yang terletak di Batusangkar, Sumatera Barat. Istana ini merupakan simbol kerajaan Minangkabau dan dikenal dengan arsitektur tradisionalnya yang megah, yang mencerminkan ciri khas budaya Minangkabau.",
                -0.47115692936286124,
                100.62143708057593
            )

        )

        RecyclerViewMenu = findViewById(R.id.RvMenu)
        RecyclerViewMenu.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        AdapterMenu = adapterwisata(menuIcons)
        RecyclerViewMenu.adapter = AdapterMenu

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}