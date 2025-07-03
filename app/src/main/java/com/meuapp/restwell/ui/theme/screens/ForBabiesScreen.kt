package com.meuapp.restwell.ui.theme.screens

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.meuapp.restwell.R

@Composable
fun ForBabiesScreen() {
    val context = LocalContext.current
    var isPlaying by remember { mutableStateOf(false) }
    var mediaPlayer by remember { mutableStateOf<MediaPlayer?>(null) }

    DisposableEffect(isPlaying) {
        if (isPlaying) {
            mediaPlayer = MediaPlayer.create(context, R.raw.bbs)
            mediaPlayer?.isLooping = true
            mediaPlayer?.start()
        } else {
            mediaPlayer?.pause()
            mediaPlayer?.release()
            mediaPlayer = null
        }
        onDispose {
            mediaPlayer?.release()
            mediaPlayer = null
        }
    }

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

        // iconscreen (canto superior direito)
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

        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // babies (centro)
            Image(
                painter = painterResource(
                    id = try { R.drawable.babies } catch (e: Exception) { android.R.drawable.ic_menu_gallery }
                ),
                contentDescription = "Babies",
                modifier = Modifier.size(160.dp)
            )
            Spacer(modifier = Modifier.height(24.dp))
            // play (abaixo de babies)
            IconButton(onClick = { isPlaying = !isPlaying }) {
                Icon(
                    imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                    contentDescription = if (isPlaying) "Pause sound" else "Play sound",
                    tint = Color.White
                )
            }
        }
    }
}
