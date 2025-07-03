// app/src/main/java/com/meuapp/restwell/ui/navigation/NavGraph.kt
package com.meuapp.restwell.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.meuapp.restwell.ui.screens.HomeScreen
import com.meuapp.restwell.ui.screens.SelectScreen
import com.meuapp.restwell.ui.theme.screens.ChillScreen
import com.meuapp.restwell.ui.theme.screens.ForBabiesScreen
import com.meuapp.restwell.ui.theme.screens.SleepScreen
import com.meuapp.restwell.ui.theme.screens.SplashScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("chill") { ChillScreen() }
        composable("for_babies") { ForBabiesScreen() }
        composable("select") { SelectScreen(navController) }
        composable("sleep") { SleepScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun NavGraphPreview() {
    val navController = rememberNavController()
    NavGraph(navController = navController)
}
