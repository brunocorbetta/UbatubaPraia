package com.corbetta.ubatubapraias

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.corbetta.ubatubapraias.ui.Home
import com.corbetta.ubatubapraias.ui.Informacoes



@Composable
fun AppNavHost (
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home",
    modifier: Modifier = Modifier
) {

    NavHost(
        navController = navController ,
        startDestination =  startDestination,
        modifier = modifier
    ) {
        composable("home") {
            Home(
                onclickTroca = {
                navController.navigateSingleTopTo("informacoes")
                }
            )
        }

        composable("informacoes") {
            Informacoes {
                navController.navigateSingleTopTo("home")
            }
        }
    }}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }

