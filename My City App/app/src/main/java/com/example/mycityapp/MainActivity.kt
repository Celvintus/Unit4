package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    MaterialTheme {
        NavHost(navController, startDestination = "home") {
            composable("home") { HomeScreen(navController) }
            composable("cafes") { CafesScreen() }
            composable("restaurants") { RestaurantsScreen() }
            // Добавьте сюда дополнительные экраны...
        }
    }
}

fun composable(s: String, function: () -> Unit) {
    TODO("Not yet implemented")
}

fun rememberNavController(): Any {
    TODO("Not yet implemented")
}

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Путеводитель по Москве") }) }
    ) {

    }
}

@Composable
fun CafesScreen() {
    // Содержимое экрана кафе
}

@Composable
fun RestaurantsScreen() {
    // Содержимое экрана ресторанов
}
