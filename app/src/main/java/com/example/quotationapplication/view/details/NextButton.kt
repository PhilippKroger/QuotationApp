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
fun NextButton(navController: NavController, nxt_page: String) {
    TextButton( modifier = Modifier.padding(start=180.dp).padding(top=140.dp),
        onClick = { navController.navigate(nxt_page) },
    ) {
        Text( stringResource(R.string.next) , color = Color(0xFF283C63), fontFamily = mulishFontFamily)
        Image(
            painter = painterResource(id = R.drawable.next_icon),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(0.12f).padding(start = 5.dp).padding(top = 3.dp)
        )
    }
}