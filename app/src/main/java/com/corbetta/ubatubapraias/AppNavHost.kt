package com.corbetta.ubatubapraias

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.corbetta.ubatubapraias.ui.Home
import com.corbetta.ubatubapraias.ui.Informacoes
import com.corbetta.ubatubapraias.ui.ListasDasCoisas


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
        composable("listasdascoisas") {
           ListasDasCoisas(drawable = 0, text = 0,
               onclickTroca = {
                   navController.navigate("informacoes")
               })
        }
    }}
