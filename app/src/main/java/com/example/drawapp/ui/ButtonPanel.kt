package com.example.drawapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonPanel(onClick: (Color) -> Unit ) {
    Column(
        modifier = Modifier.fillMaxWidth()
            .background(Color.LightGray),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
    ) {
        ColorList(){
            color -> onClick(color)
        }
    }
}

@Composable
fun ColorList(onClick: (Color) -> Unit ) {
    val colors = listOf(
        Color.Red,
        Color.Green,
        Color.Blue,
        Color.Yellow,
        Color.Magenta,
        Color.Black
    )
    LazyRow(
        modifier = Modifier.padding(10.dp)
    ) {
        items(colors) { color ->
            Box(modifier = Modifier
                .padding(end = 10.dp)
                .clickable {
                    onClick(color)
                }
                .size(40.dp)
                .background(color, CircleShape)
            )

        }

    }
}