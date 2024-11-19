package com.manuelsantos.examenej2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.manuelsantos.examenej2.ui.theme.ExamenEJ2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenEJ2Theme {
                Ejercicio2()
            }
        }
    }
}
