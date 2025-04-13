package com.example.ciclovida

import android.os.Bundle
import android.text.Layout
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ciclovida.ui.theme.CicloVidaTheme
import com.example.ciclovida.Boton


class MainActivity : ComponentActivity() {

    var Inicio: Long = 0
    var Final: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CicloVidaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JetpackCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        Log.d("Estado", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Inicio=System.currentTimeMillis()
        Log.d("Estado", "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d("Estado", "onResume")
    }

    override fun onPause(){
        super.onPause()
        Final=System.currentTimeMillis()
        val TiempoActivo =(Final-Inicio)/1000
        Log.d("Tiempo", "$TiempoActivo Segundos")
        Log.d("Estado", "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("Estado","OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Estado", "OnDestroy")
    }

}

@Composable
fun JetpackCompose(modifier: Modifier = Modifier) {
    var ronda by remember { mutableStateOf(0) }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Column (
            horizontalAlignment = Alignment.End,
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 121.dp)

        ){

        }
        Row {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.padding(top=48.dp)
            ){
                Boton(Color.Blue)
                Boton(Color.Red)
                BotonStart()
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
            ){
                Text(
                    text = "Ronda",
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "$ronda",
                    modifier = modifier
                        .border(
                            width = 2.dp,
                            color = Color.Black
                        )
                        .padding(horizontal = MasDe10(ronda))
                        .align(Alignment.CenterHorizontally)
                )
                Boton(Color.Green)
                Boton(Color.Yellow)
                Button(
                    onClick = {
                        MasDe10(ronda)
                        ronda=Sumar(ronda)
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Sumar 1"
                    )
                }
            }
        }

        }
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CicloVidaTheme {
        JetpackCompose()
    }
}