package com.example.livestreamingapp.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.livestreamingapp.viewmodels.ChannelViewModel

@Composable
fun StreamingApp() {
    var searchText by remember { mutableStateOf("") }
    var isSearching by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Search Bar
        SearchBar(
            searchText = searchText,
            onSearchTextChange = { searchText = it },
            onSearchButtonClick = { isSearching = !isSearching }
        )
        LiveStreamChannelList(ChannelViewModel())
    }
}