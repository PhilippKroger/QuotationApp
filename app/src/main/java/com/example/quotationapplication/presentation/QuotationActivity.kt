package com.example.quotationapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quotationapplication.view.QuotationScreen

class QuotationActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QApp()
        }
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun QApp() {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = "QuotationScreen") {
            composable("QuotationScreen") { QuotationScreen(navController) }

        }
    }
}