package com.gs2_2025_rm552323_rm552233

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gs2_2025_rm552323_rm552233.screens.EquipeScreen
import com.gs2_2025_rm552323_rm552233.screens.ImcScreen
import com.gs2_2025_rm552323_rm552233.screens.LoginScreen
import com.gs2_2025_rm552323_rm552233.screens.MenuScreen

object AppDestinations {
    const val LOGIN_ROUTE = "login"
    const val MENU_ROUTE = "menu"
    const val IMC_ROUTE = "imc"
    const val EQUIPE_ROUTE = "equipe"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestinations.LOGIN_ROUTE
    ) {
        composable(AppDestinations.LOGIN_ROUTE) {
            LoginScreen(navController = navController)
        }
        composable(AppDestinations.MENU_ROUTE) {
            MenuScreen(navController = navController)
        }
        composable(AppDestinations.IMC_ROUTE) {
            ImcScreen(navController = navController)
        }
        composable(AppDestinations.EQUIPE_ROUTE) {
            EquipeScreen(navController = navController)
        }
    }
}