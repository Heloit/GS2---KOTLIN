package com.gs2_2025_rm552323_rm552233.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gs2_2025_rm552323_rm552233.AppDestinations

@Composable
fun MenuScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("MENU")
        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick = { navController.navigate(AppDestinations.IMC_ROUTE) }) {
            Text("Cálculo de IMC")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate(AppDestinations.EQUIPE_ROUTE) }) {
            Text("Equipe")
        }
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate(AppDestinations.LOGIN_ROUTE) {
                popUpTo(AppDestinations.MENU_ROUTE) { inclusive = true }
            }
        }) {
            Text("Voltar")
        }
    }
}