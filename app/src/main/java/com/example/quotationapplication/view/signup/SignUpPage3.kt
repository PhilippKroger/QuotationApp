package com.example.quotationapplication.core.presentation.signup


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.res.stringResource

import androidx.navigation.NavController

import com.example.quotationapplication.model.Interest
import com.example.quotationapplication.R
import com.example.quotationapplication.view.details.BackButton
import com.example.quotationapplication.view.details.Header
import com.example.quotationapplication.view.details.NextButton


@ExperimentalFoundationApi
@Composable
fun SignUpPage3(navController: NavController) {
    Header(title1 = stringResource(R.string.intersts), title2 = stringResource(R.string.br_that_int))

    val interestList = remember {
        listOf(
            Interest(1, "Интерес 1"),
            Interest(2, "Интерес 2"),
            Interest(3, "Интерес 3"),
            Interest(4, "Интерес 4"),
            Interest(5, "Интерес 5")
        )
    }

    InterestList(interestList = interestList)

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        BackButton(navController = navController)
        NextButton(navController = navController, nxt_page = "SignUpPage3")
    }
}


@Composable
fun InterestList(interestList: List<Interest>) {
    Box(
        modifier = Modifier.padding(top=200.dp)
    ) {
        Column {
            interestList.forEach { interest ->
                OutlinedButton(
                    onClick = {  },
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(text = interest.name)
                }
            }
        }
    }

}
