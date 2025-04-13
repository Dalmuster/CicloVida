package com.example.ciclovida

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Boton(color: Color){
    Button(
        onClick = { },
        modifier = Modifier
            .size(100.dp)
            .padding(20.dp),
        shape = RectangleShape,

        colors = ButtonDefaults.buttonColors(
            containerColor = color
        )
    ) {
    }
}

@Composable
fun BotonStart() {
    var botonStart by remember { mutableStateOf("Start") }
    Button(
        onClick = {
            botonStart="Reset"
        },
    ) {
        Text(
            text = botonStart
        )
    }
}

fun Sumar (ronda: Int):Int{
    var total=ronda+1
    return total
}

fun MasDe10 (ronda:Int): Dp {
    if (ronda>9){
        return 50.dp
    }
        return 20.dp
}

