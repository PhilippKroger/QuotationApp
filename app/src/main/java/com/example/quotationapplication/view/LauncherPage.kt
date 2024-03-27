package com.example.quotationapplication.view

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
import com.example.quotationapplication.R


@ExperimentalFoundationApi
@Composable
fun LauncherPage() {
    Box(
        modifier = Modifier
            .background(Color(0xFFFFFFFF))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.launcher_logo_background),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(0.3f)
                .padding(bottom = 100.dp)
        )

        OutlinedButton(
            modifier = Modifier.padding(top=500.dp),
            onClick = { /*TODO*/ },
        ) {
            Text(stringResource(R.string.reg) , color = Color(0xFF283C63))
        }

        TextButton(
            modifier = Modifier.padding(top=600.dp),
            onClick = { /*TODO*/ }
        ) {
            Text(stringResource(R.string.enter) , color = Color(0xFF283C63))
        }

    }
}

@Composable
fun OutlinedButtonExample(onClick: () -> Unit) {
    OutlinedButton(onClick = { onClick() }) {
        Text("Outlined")
    }
}