package com.corbetta.ubatubapraias

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.corbetta.ubatubapraias.ui.Home
import com.corbetta.ubatubapraias.ui.Informacoes


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
            Informacoes(navController = navController,id)
        }
    }

        }







