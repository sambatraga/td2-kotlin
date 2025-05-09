package fr.unica.mbds.pizzapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import fr.unica.mbds.pizzapp.data.DataSource
import fr.unica.mbds.pizzapp.screens.PizzaMenu
import fr.unica.mbds.pizzapp.ui.theme.PizzAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PizzAppTheme {
             MyApp()
            }
        }
    }
}



