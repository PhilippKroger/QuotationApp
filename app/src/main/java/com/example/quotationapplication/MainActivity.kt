package com.example.quotationapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.example.quotationapplication.core.presentation.signup.SignUpPage1
import com.example.quotationapplication.core.presentation.signup.SignUpPage2
import com.example.quotationapplication.core.presentation.signup.SignUpPage3
import com.example.quotationapplication.ui.theme.QuotationApplicationTheme
import com.example.quotationapplication.view.LauncherPage
import com.example.quotationapplication.view.LoadingPage
import com.example.quotationapplication.view.LoginPage

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuotationApplicationTheme {
                SignUpPage3()
            }
        }
    }
}
