package com.example.chunk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.chunk.ui.theme.ChunkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreViewMessageCard()
        }
    }
}

@Composable
fun MessageCard(message: String) {
    Text(text = "Hello $message")
}

@Preview
@Composable
fun PreViewMessageCard() {
    MessageCard(message = "Mad")
}