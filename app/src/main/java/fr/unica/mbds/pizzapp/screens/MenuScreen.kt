package fr.unica.mbds.pizzapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import fr.unica.mbds.pizzapp.PizzaRoute
import fr.unica.mbds.pizzapp.R
import fr.unica.mbds.pizzapp.data.DataSource
import fr.unica.mbds.pizzapp.model.Pizza
import fr.unica.mbds.pizzapp.ui.theme.PizzAppTheme

@Composable
fun PizzaCard(pizza: Pizza, modifier: Modifier = Modifier, onClickPizza: ()-> Unit = {}){
    Card(modifier= modifier,
        onClick=onClickPizza
    ){
        Column(modifier = modifier){
            Text(
                text = "Pizza ${pizza.name}",
                style = MaterialTheme.typography.headlineSmall,
                modifier = modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)

            )
            Image(
                painter = painterResource(id= pizza.image),
                contentDescription = "Pizza ${pizza.name}",
                modifier = modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Prix = ${pizza.price} $",
                style = MaterialTheme.typography.headlineSmall,
                modifier = modifier
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PizzaCardPreview(){
    PizzAppTheme {
        PizzaCard(pizza = Pizza("Margherita", 8.5, R.drawable.pizza2))
    }
}

@Composable
fun PizzaMenu(menu: List<Pizza>, modifier: Modifier = Modifier, navController: NavController) {
    LazyColumn (modifier = modifier) {
        items(menu) {
            PizzaCard(
                pizza = it,
                modifier = Modifier.padding(16.dp),
                onClickPizza = {
                    navController.navigate(route = PizzaRoute(idPizza = menu.indexOf(it)))
                }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PizzaMenuPreview(){
    PizzAppTheme {
        PizzaMenu(
            menu = DataSource().loadPizzas(),
            modifier = Modifier.fillMaxSize(),
            navController = rememberNavController()
        )
    }
}
