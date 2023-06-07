package com.easy.fit.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    val platformName = getPlatformName()
    Column(modifier = Modifier.fillMaxSize().background(Color.DarkGray).padding(20.dp)) {
        Text("First, I am gonna show some text")
        Divider(Modifier.height(20.dp))
        Button(onClick = {
            text = "Hello, ${platformName}"
        }) {
            Text(text)
        }
    }
}
