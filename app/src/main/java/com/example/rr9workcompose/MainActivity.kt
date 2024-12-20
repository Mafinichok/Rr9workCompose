package com.example.rr9workcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rr9workcompose.ui.theme.Rr9workComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Rr9workComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Романов Михаил ИКБО-11-22",
                        modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

Column (

    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {


    Box(
        modifier = Modifier

            .background(Color.Cyan)
            .padding(16.dp)
            .size(200.dp)
            .border(2.dp, Color.Red)
            .shadow(8.dp, RoundedCornerShape(10.dp))

    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
//        Box(
//            modifier = Modifier
//                .padding(16.dp)
//                .background(Color.Blue)
//                .size(200.dp)
//                .border(2.dp, Color.Red)
//        ) {
//            Text(
//                text = "Пример стилизации 2",
//                color = Color.White,
//                fontSize = 20.sp,
//                modifier = Modifier.align(Alignment.Center)
//            )
//        }



}