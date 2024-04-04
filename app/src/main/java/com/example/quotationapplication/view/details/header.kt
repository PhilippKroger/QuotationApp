package com.example.quotationapplication.view.details

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotationapplication.R
import com.example.quotationapplication.ui.theme.mulishFontFamily

@Composable
fun Header(title1: String, title2: String) {
    Box(
        modifier = Modifier
            .background(Color(0xFFFFFFFF))
            .fillMaxSize()
            .padding(20.dp),
        contentAlignment = Alignment.TopCenter

    ) {
        Row(modifier = Modifier) {
            Image(
                painter = painterResource(id = R.drawable.app_logo
                ),
                contentDescription = "",
                modifier = Modifier.width(36.dp)
            )



            Text(modifier = Modifier
                .padding(top=5.dp),
                text = stringResource(R.string.quotationapp),
                color = Color(0xFF283C63),
                fontSize = 20.sp,
                fontFamily = mulishFontFamily
            )
        }


        Text(modifier = Modifier
            .padding(70.dp),
            text = title1,
            color = Color(0xFF283C63),
            fontSize = 20.sp,
            fontFamily = mulishFontFamily

        )

        Text(modifier = Modifier
            .padding(top = 100.dp)
            .align(Alignment.TopCenter),
            fontSize = 16.sp,
            text = title2,
            textAlign = TextAlign.Center,
            color = Color(0xFFA7AAAE),
            fontFamily = mulishFontFamily
        )
    }
}