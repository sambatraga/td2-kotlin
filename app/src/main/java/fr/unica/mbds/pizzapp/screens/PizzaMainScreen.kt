package fr.unica.mbds.pizzapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.unica.mbds.pizzapp.R
import fr.unica.mbds.pizzapp.model.Pizza

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PizzaMain(){
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("PizzaApp") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFE9DEFF),
                    titleContentColor = Color.Black,

                )

                )
        },
        bottomBar = {
            Column(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Button(
                    onClick = {},
                    modifier = Modifier.width(250.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFF6750A4),
                        contentColor = Color.White
                    ),
                    ){
                    Text("Voir le menu")
                }
                Spacer(modifier = Modifier.height(12.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.width(250.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFF6750A4),
                        contentColor = Color.White
                    ),
                ){
                    Text("Voir le commande")
                }
                Spacer(modifier = Modifier.height(12.dp))
                Button(
                    onClick = {},
                    modifier = Modifier.width(250.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0XFF6750A4),
                        contentColor = Color.White
                    ),
                ){
                    Text("Payer le commande")
                }
            }
        },
        content = {
            innerPadding ->
            Column (
                modifier = Modifier.padding(innerPadding).fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,

            ){
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Da leo",
                    contentScale = androidx.compose.ui.layout.ContentScale.FillBounds,
                    modifier = Modifier
                        .size(200.dp)
                        .padding(16.dp)
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Da Leo",
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(16.dp).align(Alignment.CenterHorizontally)
                    
                )
            }
        }

    )
}

@Preview(showBackground = true)
@Composable
fun PizzaMainPreview() {
    PizzaMain()
}