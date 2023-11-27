package com.example.livestreamingapp.viewmodels

import androidx.lifecycle.ViewModel
import com.example.livestreamingapp.R
import com.example.livestreamingapp.data.Channel

class ChannelViewModel : ViewModel() {
    // TODO: Implement fetching channels from a data source
    val channels: List<Channel> = listOf(
        Channel("Canal +", "https://streamurl2.com", R.drawable.ic_canal_plus),
        Channel("CNN", "https://streamurl1.com", R.drawable.ic_cnn),
        Channel("Fox News", "https://streamurl2.com", R.drawable.ic_fox_news),
        Channel("HBO", "https://streamurl2.com", R.drawable.ic_hbo),
        Channel("Digi 24", "https://streamurl2.com", R.drawable.ic_digi),
        Channel("BBC", "https://streamurl2.com", R.drawable.ic_bbc),
        Channel("Cartoon Network", "https://streamurl2.com", R.drawable.ic_cartoon_network),
        Channel("Disney Now", "https://streamurl1.com", R.drawable.ic_disney_now),
        Channel("Espn", "https://streamurl2.com", R.drawable.ic_espn),
        Channel("MTV", "https://streamurl2.com", R.drawable.ic_mtv),
        Channel("Showtime", "https://streamurl2.com", R.drawable.ic_showtime),
        Channel("RTL", "https://streamurl2.com", R.drawable.ic_rtl),
        Channel("TV5", "https://streamurl2.com", R.drawable.tv5),
        Channel("MTV", "https://streamurl2.com", R.drawable.ic_mtv),
        Channel("ARTE", "https://streamurl2.com", R.drawable.ic_arte),
        Channel("TF1", "https://streamurl2.com", R.drawable.ic_tf1),
        Channel("Eurosport", "https://streamurl2.com", R.drawable.ic_eurosport),
        Channel("CCTV", "https://streamurl1.com", R.drawable.ic_cctv),
        Channel("France 24", "https://streamurl1.com", R.drawable.ic_france_24_logo),
        Channel("Nickelodeon", "https://streamurl2.com", R.drawable.ic_nickelodeon)

    )
}