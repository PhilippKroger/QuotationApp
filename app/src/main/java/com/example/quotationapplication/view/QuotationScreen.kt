package com.example.quotationapplication.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quotationapplication.R
import com.example.quotationapplication.core.presentation.signup.InterestList
import com.example.quotationapplication.model.Author
import com.example.quotationapplication.model.Category
import com.example.quotationapplication.model.Interest
import com.example.quotationapplication.model.Quote
import com.example.quotationapplication.ui.theme.mulishFontFamily

@Composable
fun QuotationScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .background(Color(0xFFFFFFFF))
            .fillMaxSize()
            .padding(20.dp),
        //contentAlignment = Alignment.TopCenter

    ) {
        Row(modifier = Modifier) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "",
                modifier = Modifier
                    .width(10.dp)
                    .padding(top = 12.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "",
                modifier = Modifier
                    .width(10.dp)
                    .padding(top = 12.dp)
            )

            Text(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 8.dp),
                text = stringResource(R.string.quotationapp),
                color = Color(0xFF283C63),
                fontSize = 20.sp,
                fontFamily = mulishFontFamily
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 0.dp),
                contentAlignment = Alignment.TopEnd
            ) {
                Row {
                    IconButton(
                        onClick = {  }
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.plus_icon),
                            contentDescription = "",
                            modifier = Modifier
                                .width(24.dp)
                                .fillMaxSize(1.0f),
                        )
                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.q_icon),
                            contentDescription = "",
                            modifier = Modifier
                                .width(24.dp)
                                .fillMaxSize(1.0f)

                        )
                    }


                }
            }
        }
    }
    val (searchValue, setEmailValue) = remember { mutableStateOf("") }
    SearchTextField(searchValue = searchValue, onSearchValueChange = setEmailValue)



    val interestList = remember {
        listOf(
            Interest(1, "Интерес 1"),
            Interest(2, "Интерес 2"),
            Interest(3, "Интерес 3"),
            Interest(4, "Интерес 4"),
            Interest(5, "Интерес 5")
        )
    }

    InterestListSearch(interestList = interestList)


    val postList = remember {
        listOf(
            Quote(1, author = Author(1, "PhilippKroger", "wef", "wef"), text="Колобок повесился", 1, 0, categories = listOf(Category(1, "Физика"))),
            Quote(2, author = Author(2, "MaksimBondarev", "wef", "wef"), text="Текст поста", 123, 24, categories = listOf(Category(2, "Математика"))),
        )
    }

    postListOfQuotations(postList)



}

@Composable
fun SearchTextField(
    searchValue: String,
    onSearchValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(top = 70.dp)
            .padding(start = 20.dp),
        textStyle = MaterialTheme.typography.bodyMedium,
        value = searchValue,
        onValueChange = onSearchValueChange,
        label = { Text(stringResource(  R.string.search), fontFamily = mulishFontFamily) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)

    )
}

@Composable
fun InterestListSearch(interestList: List<Interest>) {
    Box(
        modifier = Modifier
            .padding(top = 140.dp)
            .padding(start = 15.dp)
    ) {

        LazyRow {
            items(interestList) { interest ->
                OutlinedButton(
                    onClick = { /* Обработка нажатия */ },
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp),
                    border = BorderStroke(1.5.dp, Color(0xFF283C63)),

                ) {
                    Text(text = interest.name, color = Color(0xFF283C63), fontFamily = mulishFontFamily)
                    // , color = Color(0xFF283C63), fontFamily = mulishFontFamily
                }
            }
        }
    }
}


@Composable
fun postListOfQuotations(posts: List<Quote>) {
    Box(
        modifier = Modifier
            .padding(top = 200.dp)
            .fillMaxSize()
    ) {
        Column {
            posts.forEach { post ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 20.dp)
                ) {
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img_1),
                            contentDescription = "",
                            modifier = Modifier
                                .width(4.dp)
                                .padding(top = 5.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.img_1),
                            contentDescription = "",
                            modifier = Modifier
                                .width(4.dp)
                                .padding(top = 5.dp)
                        )

                        Text(modifier = Modifier
                            .padding(start=5.dp),
                            text = "${post.author.name}",
                            color = Color(0xFF283C63),
                            fontSize = 14.sp,
                            fontFamily = mulishFontFamily
                        )

                        Box {

                        }

                        Image(
                            painter = painterResource(id = R.drawable.menu_icon),
                            contentDescription = "",
                            modifier = Modifier
                                .width(24.dp)
                                .padding(top = 5.dp),
                        )

                    }
                }
            }
        }
    }
}
