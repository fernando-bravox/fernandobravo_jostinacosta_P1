package dev.fernando.fernandobravojostinacostap1_ticspao6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.fernando.fernandobravojostinacostap1_ticspao6.layout.Columnas
import dev.fernando.fernandobravojostinacostap1_ticspao6.ui.theme.FernandoBravoJostinAcostaP1_TICSPAO6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Columnas()

        }
    }
}