package com.manuelsantos.examenej2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Ejercicio2() {
    val listaColores = listOf(
        Color.Red,
        Color.Black,
        Color.Blue,
        Color.Gray,
        Color.White,
        Color.Magenta,
        Color.Cyan,
        Color.Green,
        Color.Yellow
    )
    var colorSeleccionado by remember { mutableStateOf(Color.White) }
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(stringResource(id = R.string.ejercicio2), style = MaterialTheme.typography.titleLarge, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            LazyVerticalGrid(
               columns = GridCells.Fixed(3),
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                items(listaColores) { color->
                    Box(
                        modifier = Modifier.height(130.dp)
                            .padding(16.dp)
                            .background(color)
                            .border(5.dp, Color.Black)
                            .clickable { colorSeleccionado = color }
                    )
                }
            }
            Spacer(modifier = Modifier.padding(vertical = 20.dp))
            ElementoCuadrado(colorSeleccionado)
        }
    }
}

@Composable
fun ElementoCuadrado(colorEstado: Color) {
    Box(
        modifier = Modifier.height(250.dp)
            .width(250.dp)
            .padding(16.dp)
            .background(colorEstado)
            .border(5.dp, Color.Black)
    )
}