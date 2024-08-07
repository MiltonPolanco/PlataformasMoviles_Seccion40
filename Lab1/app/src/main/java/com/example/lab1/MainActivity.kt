package com.example.lab1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1.ui.theme.Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1Theme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Texto 1", modifier = Modifier.padding(bottom = 8.dp))
        Text(text = "Texto 2", modifier = Modifier.padding(bottom = 8.dp))
        Text(text = "Texto 3", modifier = Modifier.padding(bottom = 8.dp))

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            count++
            Log.d("MainActivity", "Botón presionado $count veces")
        }) {
            Text(text = "Presioname")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Botón presionado $count veces")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Lab1Theme {
        MyApp()
    }
}
