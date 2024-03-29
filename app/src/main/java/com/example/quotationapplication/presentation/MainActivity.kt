package com.example.quotationapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import com.example.quotationapplication.core.presentation.signup.SignUpPage1
import com.example.quotationapplication.view.LauncherPage
import com.example.quotationapplication.view.LoginPage
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            qApp()
        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun qApp() {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = "launcherPage") {
            composable("launcherPage") { LauncherPage(navController) }
            composable("SignUpPage1") { SignUpPage1(navController) }
            composable("LoginPage") { LoginPage(navController) }
        }
    }
}
