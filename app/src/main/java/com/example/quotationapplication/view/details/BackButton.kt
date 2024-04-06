package com.example.quotationapplication.view.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import com.example.quotationapplication.R
import com.example.quotationapplication.ui.theme.mulishFontFamily

@Composable
fun BackButton(navController: NavController) {
    TextButton( modifier = Modifier.padding(end=180.dp),
        onClick = { navController.popBackStack() },
        ) {
        Image(
            painter = painterResource(id = R.drawable.back_icon),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(0.1f).padding(end = 5.dp)
        )
        Text( stringResource(R.string.back) , color = Color(0xFFA7AAAE),fontFamily = mulishFontFamily)
    }
}