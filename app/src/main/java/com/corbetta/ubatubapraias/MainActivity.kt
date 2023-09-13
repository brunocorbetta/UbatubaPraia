package com.corbetta.ubatubapraias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.corbetta.ubatubapraias.ui.theme.UbatubaPraiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UbatubaPraiaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize() .padding(4.dp),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                   Home()
                }
            }
        }
    }
}





