package com.example.quotationapplication

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotationapplication.R

@ExperimentalFoundationApi
@Composable
fun LoginPage() {
    Box(
        modifier = Modifier
            .background(Color(0xFFFFFFFF))
            .fillMaxSize()
            .padding(20.dp),
        contentAlignment = Alignment.TopCenter

    ) {
        Row(modifier = Modifier) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "",
                modifier = Modifier.width(10.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "",
                modifier = Modifier.width(10.dp)
            )

            Text(modifier = Modifier
                .padding(start=10.dp),
                text = "Цитатник",
                color = Color(0xFF283C63),
                fontSize = 20.sp,
            )
        }

        Text(modifier = Modifier
            .padding(70.dp),
            text = "Вход",
            color = Color(0xFF283C63),
        )

        Text(modifier = Modifier
            .padding(top=100.dp),
            fontSize = 16.sp,
            text = "Введите почту и пароль для входа",
            color = Color(0xFFA7AAAE)
        )
    }
}