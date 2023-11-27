package com.example.livestreamingapp.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ChannelName(name: String) {
    CompositionLocalProvider(LocalContentColor provides contentColorFor(MaterialTheme.colorScheme.primary)) {
        Surface(
            shape = MaterialTheme.shapes.medium,
            shadowElevation = 1.dp,
            modifier = Modifier
                .height(30.dp)
                .fillMaxWidth(),
            color = MaterialTheme.colorScheme.surface
        ) {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 4.dp),
            )
        }
    }
}