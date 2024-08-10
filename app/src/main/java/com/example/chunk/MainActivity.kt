package com.example.chunk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chunk.ui.theme.ChunkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.golang_char_2),
                    contentDescription = ""
                )
                Column {
                    PreViewMessageCard()
                }
            }
        }
    }
}

data class Message(val one: String, val two: String, val three: String)

@Composable
fun MessageCard(message: Message) {
    Text(text = message.one)
    Text(text = message.two)
    Text(text = message.three)
}

@Preview
@Composable
fun PreViewMessageCard() {
    MessageCard(message = Message("1", "2", "3"))
}