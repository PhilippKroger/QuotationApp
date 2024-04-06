package com.example.quotationapplication.presentation

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.core.content.ContextCompat.startActivity
import com.example.quotationapplication.core.presentation.signup.SignUpPage1
import com.example.quotationapplication.view.LauncherPage
import com.example.quotationapplication.view.LoginPage
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quotationapplication.core.presentation.signup.SignUpPage2
import com.example.quotationapplication.core.presentation.signup.SignUpPage3
import com.example.quotationapplication.view.LoadingPage
import com.example.quotationapplication.view.QuotationScreen

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuotationApp()
        }
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun QuotationApp() {
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = "launcherPage") {
            composable("launcherPage") { LauncherPage(navController) }
            composable("LoadingPage") { LoadingPage() }
            composable("LoginPage") { LoginPage(navController) }
            composable("LoadingPage") { LoadingPage() }
            composable("QuotationActivity") { navController.navigate("QuotationActivity") }
            composable("QuotationScreen") { QuotationScreen(navController) }
            composable("SignUpPage1") { SignUpPage1(navController) }
            composable("SignUpPage2") { SignUpPage2(navController) }
            composable("SignUpPage3") { SignUpPage3(navController) }
        }
    }
}