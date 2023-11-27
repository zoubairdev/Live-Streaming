package com.example.livestreamingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.livestreamingapp.composables.StreamingApp
import com.example.livestreamingapp.ui.theme.LiveStreamingAppTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LiveStreamingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    StreamingApp()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LiveStreamChannelListPreview() {
    LiveStreamingAppTheme {
        StreamingApp()
    }
}