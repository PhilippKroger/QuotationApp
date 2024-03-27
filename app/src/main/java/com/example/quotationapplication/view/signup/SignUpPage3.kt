package com.example.quotationapplication.core.presentation.signup


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.quotationapplication.model.BaseModel
import com.example.quotationapplication.model.Interest


@ExperimentalFoundationApi
@Composable
fun SignUpPage3() {
    val interestList = remember {
        listOf(
            Interest(baseModel = BaseModel(1), "Интерес 1"),
            Interest(baseModel = BaseModel(2), "Интерес 2"),
            Interest(baseModel = BaseModel(3), "Интерес 3"),
            Interest(baseModel = BaseModel(4), "Интерес 4"),
            Interest(baseModel = BaseModel(5), "Интерес 5")
        )
    }

    MaterialTheme {
        Surface {
            InterestList(interestList = interestList)
        }
    }
    /*
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




    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter

    ) {
        TextButton( modifier = Modifier
            .padding(end=180.dp),
            onClick = { /*TODO*/ },

            ) {
            Image(
                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(0.1f)
            )
            Text( stringResource(R.string.back) , color = Color(0xFFA7AAAE))
        }

        TextButton( modifier = Modifier
            .padding(start=180.dp),
            onClick = { /*TODO*/ },
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

     */
}


@Composable
fun InterestList(interestList: List<Interest>) {
    LazyRow(
        modifier = Modifier.padding(8.dp)
    ) {
        items(interestList) { interest ->
            OutlinedButton(
                onClick = { /* Действие при нажатии кнопки */ },
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                Text(text = interest.name)
            }
        }
    }
}
/*
@Composable
fun InterestList(interestList: List<Interest>) {
    Row(
        modifier = Modifier.padding(8.dp)
    ) {
        interestList.forEach { interest ->
            OutlinedButton(
                onClick = { /* Действие при нажатии кнопки */ },
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                Text(text = interest.name)
            }
        }
    }
}

 */
