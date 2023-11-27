package com.example.livestreamingapp.composables


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.livestreamingapp.viewmodels.ChannelViewModel

@Composable
fun LiveStreamChannelList(channelViewModel: ChannelViewModel) {
    val channels = channelViewModel.channels

    LazyVerticalGrid(
        columns = GridCells.Fixed(4),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(channels) { channel ->
            LiveStreamChannelItem(channel = channel)
        }
    }
}