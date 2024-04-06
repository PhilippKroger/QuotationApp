package com.example.quotationapplication.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import com.example.quotationapplication.R
import com.example.quotationapplication.ui.theme.mulishFontFamily


@ExperimentalFoundationApi
@Composable
fun LauncherPage(navController: NavController) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.launcher_logo_icon),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(0.3f)
                .padding(bottom = 100.dp)
        )

        OutlinedButton(
            modifier = Modifier.padding(top=500.dp),
            onClick = { navController.navigate("SignUpPage1") },
            border = BorderStroke(1.5.dp, Color(0xFF283C63)),
        ) {
            Text(stringResource(R.string.reg) , color = Color(0xFF283C63), fontFamily = mulishFontFamily)
        }

        TextButton(
            modifier = Modifier.padding(top=600.dp),
            onClick = { navController.navigate("LoginPage") }
        ) {
            Text(stringResource(R.string.enter) , color = Color(0xFF283C63), fontFamily = mulishFontFamily)
        }

    }
}
