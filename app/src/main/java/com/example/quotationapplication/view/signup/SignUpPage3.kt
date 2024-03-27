package com.example.quotationapplication.core.presentation.signup


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotationapplication.R
import com.example.quotationapplication.model.Interest


@ExperimentalFoundationApi
@Composable
fun SignUpPage3() {
    val interestList = remember {
        listOf(
            Interest(1, "Интерес 1"),
            Interest(2, "Интерес 2"),
            Interest(3, "Интерес 3"),
            Interest(4, "Интерес 4"),
            Interest(5, "Интерес 5")
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
                text = "Цитатник",
                color = Color(0xFF283C63),
                fontSize = 20.sp,
            )
        }

        Text(modifier = Modifier
            .padding(70.dp),
            text = "Интересы",
            color = Color(0xFF283C63),
        )

        Text(modifier = Modifier
            .padding(top = 100.dp)
            .align(Alignment.TopCenter),
            fontSize = 16.sp,
            text = "Выберете то, что вам действительно интересно",
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
            Text( "Назад" , color = Color(0xFFA7AAAE))
        }

        TextButton( modifier = Modifier
            .padding(start=180.dp),
            onClick = { /*TODO*/ },
        ) {

            Text( "Далее" , color = Color(0xFF283C63))
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
