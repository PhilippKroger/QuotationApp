package com.example.quotationapplication.core.presentation.signup


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.quotationapplication.model.Interest
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.quotationapplication.R
import androidx.compose.ui.res.stringResource
import com.example.quotationapplication.fragments.BackButton
import com.example.quotationapplication.fragments.NextButton


@ExperimentalFoundationApi
@Composable
fun SignUpPage3(navController: NavController) {
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
                text = stringResource(R.string.quotationapp),
                color = Color(0xFF283C63),
                fontSize = 20.sp,
            )
        }

        Text(modifier = Modifier
            .padding(70.dp),
            text = stringResource(R.string.intersts),
            color = Color(0xFF283C63),
            fontSize = 20.sp,
        )

        Text(modifier = Modifier
            .padding(top = 100.dp)
            .align(Alignment.TopCenter),
            fontSize = 16.sp,
            text = stringResource(R.string.br_that_int),
            textAlign = TextAlign.Center,
            color = Color(0xFFA7AAAE)
        )
    }

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
        modifier = Modifier
            .padding(top=200.dp)
    ) {
        Column {
            interestList.forEach { interest ->
                OutlinedButton(
                    onClick = { /* Действие при нажатии кнопки */ },
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(text = interest.name)
                }
            }
        }
    }

}
