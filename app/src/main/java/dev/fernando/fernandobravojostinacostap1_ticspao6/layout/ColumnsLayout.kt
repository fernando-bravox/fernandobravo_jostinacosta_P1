package dev.fernando.fernandobravojostinacostap1_ticspao6.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Columnas(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 8.dp)
            .background(color = Color.Red)
            .fillMaxSize()

    ) {

        Text(
            text = "Computacion TICS PAO 6, Fernando Bravo y Jostin Acosta"
        )
    }

}