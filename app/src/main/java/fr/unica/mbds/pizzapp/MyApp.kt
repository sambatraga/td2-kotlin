package fr.unica.mbds.pizzapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import fr.unica.mbds.pizzapp.data.DataSource
import fr.unica.mbds.pizzapp.screens.PizzaDetail
import fr.unica.mbds.pizzapp.screens.PizzaMenu

@kotlinx.serialization.Serializable
object PizzaList
// route vers la page de la liste des pizzas

@kotlinx.serialization.Serializable
data class PizzaRoute(val idPizza: Int)
// route vers la page de detail d'une pizza identidiee par son id

@Composable
fun MyApp() {
    var navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = PizzaList
    ) {
        composable<PizzaList> {
            PizzaMenu(
                menu = DataSource().loadPizzas(),
                modifier = Modifier
                    .fillMaxSize().padding(16.dp),
                navController = navController
            )
        }
        composable<PizzaRoute> { backStackEntry ->
            val pizzaRoute = backStackEntry.toRoute<PizzaRoute>()

            PizzaDetail(
                pizza = DataSource().loadPizza(pizzaRoute.idPizza),
                modifier = Modifier.fillMaxSize().padding(16.dp)
            )
        }
    }
}