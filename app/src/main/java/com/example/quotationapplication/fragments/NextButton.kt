package com.example.quotationapplication.fragments

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

@Composable
fun NextButton(navController: NavController, nxt_page: String) {
    TextButton( modifier = Modifier
        .padding(start=180.dp),
        onClick = { navController.navigate("$nxt_page") },
    ) {

        Text( stringResource(R.string.next) , color = Color(0xFF283C63))
        Image(
            painter = painterResource(id = R.drawable.img_4),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(0.10f)
        )
    }
}