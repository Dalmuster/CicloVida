package com.example.ciclovida

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ciclovida.ui.theme.CicloVidaTheme

class MainActivity : ComponentActivity() {

    var Inicio: Long = 0
    var Final: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CicloVidaTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "Happy birthday Daniel",
                        from = "Daniel",
                        modifier = Modifier.padding(8.dp)
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
fun GreetingText(message:String, from:String, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier,
        verticalArrangement = Arrangement.Center
        ){
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    CicloVidaTheme {
        GreetingText(message = "Happy birthday Daniel", from = "Daniel")
    }
}

