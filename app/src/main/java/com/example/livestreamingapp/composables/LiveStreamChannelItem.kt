package com.example.livestreamingapp.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.livestreamingapp.data.Channel

@Composable
fun LiveStreamChannelItem(channel: Channel) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        // Channel logo
        ChannelLogo(logo = channel.logo)

        Spacer(modifier = Modifier.height(8.dp))

        // Channel name
        ChannelName(name = channel.name)

        Spacer(modifier = Modifier.height(8.dp))
    }
}