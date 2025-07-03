package com.meuapp.restwell.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.meuapp.restwell.R

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // nome (1) - centro superior
            Image(
                painter = painterResource(
                    id = try { R.drawable.nome_1_ } catch (e: Exception) { android.R.drawable.ic_menu_info_details }
                ),
                contentDescription = "Nome",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 24.dp)
            )

            // startselect (centro)
            Image(
                painter = painterResource(
                    id = try { R.drawable.startselect } catch (e: Exception) { android.R.drawable.ic_menu_gallery }
                ),
                contentDescription = "Start Select",
                modifier = Modifier
                    .size(160.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // start (abaixo de startselect)
            Image(
                painter = painterResource(
                    id = try { R.drawable.start } catch (e: Exception) { android.R.drawable.ic_media_play }
                ),
                contentDescription = "Start",
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.CenterHorizontally)
            )
        }
    }
}
