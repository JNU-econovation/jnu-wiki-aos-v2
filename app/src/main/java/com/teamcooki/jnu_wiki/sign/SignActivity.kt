package com.teamcooki.jnu_wiki.sign

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
import com.teamcooki.jnu_wiki.sign.ui.theme.Jnu_WikiTheme

class SignActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jnu_WikiTheme {

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SignPreview() {
    Jnu_WikiTheme {
    }
}