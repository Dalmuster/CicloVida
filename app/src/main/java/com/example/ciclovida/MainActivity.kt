package com.example.ciclovida

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ciclovida.ui.theme.CicloVidaTheme

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
                        ronda = 0,
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
fun JetpackCompose(ronda: Int, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Ronda"
        )
        Text(
            text = "$ronda",
            modifier = modifier
                .border(
                    width = 2.dp,
                    color = Color.Black
                )
                .padding(horizontal = 20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CicloVidaTheme {
        JetpackCompose(0)
    }
}