package com.corbetta.ubatubapraias

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.corbetta.ubatubapraias.ui.Home
import com.corbetta.ubatubapraias.ui.Informacoes
import com.corbetta.ubatubapraias.ui.ListasDasCoisas



@Composable
fun AppNavHost () {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Home"
    ) {
        composable("Home") {
            Home(
                navController = navController
            )
        }

        composable("Informacoes/{id}") { idimage ->
            val id = idimage.arguments?.getString("id")
            Informacoes(id)
        }
    }

        }







