package com.example.livestreamingapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ChannelLogo(logo: Int) {
    Image(
        painter = painterResource(id = logo),
        contentDescription = null,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .background(Color.White)
            .padding(4.dp)
    )
}