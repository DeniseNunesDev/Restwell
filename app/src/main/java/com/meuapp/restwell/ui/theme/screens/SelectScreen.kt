package com.meuapp.restwell.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
fun SelectScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Back (canto superior esquerdo)
        IconButton(
            onClick = { /* ação de voltar */ },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(
                    id = try { R.drawable.back } catch (e: Exception) { android.R.drawable.ic_menu_revert }
                ),
                contentDescription = "Voltar"
            )
        }

        // iconsreen (canto superior direito)
        IconButton(
            onClick = { /* ação do ícone */ },
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(
                    id = try { R.drawable.iconscreen } catch (e: Exception) { android.R.drawable.ic_menu_info_details }
                ),
                contentDescription = "IconScreen"
            )
        }

        // Opções no centro
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(
                    id = try { R.drawable.chillselect } catch (e: Exception) { android.R.drawable.ic_menu_gallery }
                ),
                contentDescription = "Chill Select",
                modifier = Modifier
                    .size(120.dp)
                    .clickable { navController.navigate("chill") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(
                    id = try { R.drawable.forbbsselect } catch (e: Exception) { android.R.drawable.ic_menu_gallery }
                ),
                contentDescription = "For Babies Select",
                modifier = Modifier
                    .size(120.dp)
                    .clickable { navController.navigate("for_babies") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(
                    id = try { R.drawable.slepselect } catch (e: Exception) { android.R.drawable.ic_menu_gallery }
                ),
                contentDescription = "Sleep Select",
                modifier = Modifier
                    .size(120.dp)
                    .clickable { navController.navigate("sleep") }
            )
        }
    }
}
