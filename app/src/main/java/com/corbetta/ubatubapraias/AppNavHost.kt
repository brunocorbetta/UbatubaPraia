package com.corbetta.ubatubapraias

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.corbetta.ubatubapraias.ui.Home
import com.corbetta.ubatubapraias.ui.HomeViewModel
import com.corbetta.ubatubapraias.ui.Informacoes
import com.corbetta.ubatubapraias.ui.ListasDasCoisas


@Composable
fun AppNavHost (
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home",
    modifier: Modifier = Modifier
) {
    val homeViewModel: HomeViewModel = viewModel()
    NavHost(
        navController = navController ,
        startDestination =  startDestination,
        modifier = modifier
    ) {
        composable("home") {
            Home(
                onclickTroca = {
                    navController.navigate("informacoes")
                }
            )
        }


        composable("informacoes") {
            Informacoes(
                onclickVolta = {
                    navController.navigate("home")
                }
            )
        }
    }}

