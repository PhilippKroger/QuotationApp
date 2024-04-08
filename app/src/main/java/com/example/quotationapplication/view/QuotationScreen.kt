package com.example.quotationapplication.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.quotationapplication.R
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
                painter = painterResource(id = R.drawable.logo_icon),
                contentDescription = "",
                modifier = Modifier
                    .width(36.dp)
                    .padding(top = 5.dp)
            )


            Text(
                modifier = Modifier
                    .padding(start = 0.dp)
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
                            painter = painterResource(id = R.drawable.pl_icon),
                            contentDescription = "",
                            modifier = Modifier
                                .width(24.dp)
                                .fillMaxSize(1.0f),
                        )
                    }

                    IconButton(onClick = { /*TODO*/ }) {
                        Image(
                            painter = painterResource(id = R.drawable.settings_icon),
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




    //val (searchValue, setEmailValue) = remember { mutableStateOf("") }
    //SearchTextField(searchValue = searchValue, onSearchValueChange = setEmailValue)

    var searchQuery by remember { mutableStateOf("") }

    // Function to handle changes in the search text field
    val onSearchQueryChanged = { query: String ->
        searchQuery = query
    }

    // Function to handle the execution of the search
    val onSearchExecuted = {
        // Do something with searchQuery, like calling a view model function
        // For now, let's just print the current query
        println("Search executed for query: $searchQuery")
    }

    // Call the SearchBar function, passing the required parameters
    SearchBar(
        searchQuery = searchQuery,
        onSearchQueryChanged = onSearchQueryChanged,
        onSearchExecuted = onSearchExecuted
    )


    val interestList = remember {
        listOf(
            Interest(0, "Рекомендации"),
            Interest(1, "Любовь"),
            Interest(2, "Бизнес"),
            Interest(3, "Жизнь"),
            Interest(4, "Музыка"),
            Interest(5, "IT")
        )
    }

    InterestListSearch(interestList = interestList)


    val postList = remember {
        listOf(
            Quote(1, author = Author(1, "Квинтилиан М. Ф.", "писатель", "писатель"), text="Практика без теории ценнее, чем теория без практики", 120, 12, categories = listOf(Category(1, "Физика"))),
            Quote(2, author = Author(2, "Котляр П. И.", "писатель", "писатель"), text="Быстро - это хорошо, только ракете пиздец", 123, 24, categories = listOf(Category(2, "Математика"))),
            Quote(3, author = Author(3, "Эрхарт А.", "писатель", "писатель"), text="Сложнее всего начать действовать, все остальное зависит только от упорства", 5, 1, categories = listOf(Category(2, "Математика"))),
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
            .padding(top = 150.dp)
            .padding(start = 15.dp)
    ) {

        LazyRow {

            itemsIndexed(interestList) { index, interest ->
                val textColor = if (index == 0) Color(0xFF283C63) else Color(0xFFA7AAAE) // Изменение цвета текста для первого элемента
                val borderColor = if (index == 0) Color(0xFF283C63) else Color(0xFFA7AAAE)
                OutlinedButton(
                    onClick = { /* Обработка нажатия */ },
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp),
                    border = BorderStroke(1.5.dp,borderColor),

                ) {
                    Text(text = interest.name, color = textColor, fontFamily = mulishFontFamily)
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
        LazyColumn {
            items(posts) { post ->
                Box(
                    modifier = Modifier
                        .padding(bottom = 4.dp)
                        .padding(top = 20.dp)
                ) {
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 25.dp)
                        .padding(bottom = 0.dp)) {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.q_logo_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(22.dp)
                                    .padding(top = 7.dp)
                            )


                            Text(modifier = Modifier
                                .padding(start=5.dp),
                                text = "${post.author.name}",
                                color = Color(0xFF283C63),
                                fontSize = 18.sp,
                                fontFamily = mulishFontFamily
                            )
                            Spacer(modifier = Modifier.weight(0.5f))



                            val expanded = remember { mutableStateOf(false) }

                            Box(
                                modifier = Modifier.padding(end = 30.dp),
                            ) {
                                IconButton(onClick = { expanded.value = true }) {
                                    Image(
                                        painter = painterResource(id = R.drawable.param_icon),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(40.dp)
                                            .padding(end = 0.dp)
                                            .padding(bottom = 22.dp)
                                    )
                                }

                                DropdownMenu(modifier = Modifier
                                    .background(Color.White)
                                    .clip(RoundedCornerShape(2.dp)),
                                    expanded = expanded.value,
                                    onDismissRequest = { expanded.value = false },
                                ) {
                                    MenuItemContent(painterResource(id = R.drawable.copy_icon), "Копировать")
                                    MenuItemContent(painterResource(id = R.drawable.dublicate_icon), "Дубликат")
                                    MenuItemContent(painterResource(id = R.drawable.warning_icon), "Пожаловаться")
                                }
                            }
                        }



                        Text(modifier = Modifier
                            .padding(start = 0.dp)
                            .padding(top = 40.dp)
                            .padding(end = 30.dp),
                            text = "${post.text}",
                            color = Color(0xFF111111),
                            fontSize = 16.sp,
                            fontFamily = mulishFontFamily
                        )



                    }

                    Row(
                        modifier = Modifier
                            .padding(top = 80.dp)
                            .padding(start = 10.dp)
                    ) {
                        IconButton(
                            onClick = {  }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.up_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(18.dp)
                                    .fillMaxSize(1.0f),
                            )
                        }

                        Text(
                            modifier = Modifier
                                .padding(top=15.dp),
                            text = "${post.likes}",
                            fontFamily = mulishFontFamily
                        )

                        IconButton(
                            onClick = {  }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.down_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(18.dp)
                                    .fillMaxSize(1.0f),
                            )
                        }

                        Text(
                            modifier = Modifier
                                .padding(top=15.dp),
                            text = "${post.dislikes}",
                            fontFamily = mulishFontFamily
                        )

                        IconButton(
                            onClick = {  }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.share_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .width(16.dp)
                                    .fillMaxSize(1.0f),
                            )
                        }

                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color.LightGray)
                )
            }
        }
    }
}



@Composable
fun SearchBar(
    searchQuery: String,
    onSearchQueryChanged: (String) -> Unit,
    onSearchExecuted: () -> Unit
) {
    OutlinedTextField(
        value = searchQuery,
        onValueChange = onSearchQueryChanged,
        placeholder = { Text(modifier = Modifier, text = "Поиск", fontFamily = mulishFontFamily, color = Color(0xFFA7AAAE)) },
        leadingIcon = {
            Icon(
                modifier = Modifier
                    .size(18.dp),
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search",
                tint = Color(0xFFA7AAAE)
            )
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(onSearch = { onSearchExecuted() }),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 80.dp)
            .padding(start = 20.dp)
            .padding(end = 20.dp)
            .border(BorderStroke(0.dp, Color.Transparent))
            .background(Color(0xFFEFF1F4))
            .height(50.dp)
            ,
        shape = RoundedCornerShape(8.dp), // Adjust the corner size to match the design

    )
}

@Composable
fun MenuItemContent(iconPainter: Painter, text: String) {
    Row(modifier = Modifier
        .padding(top = 5.dp)
        .padding(bottom = 5.dp)
        .padding(start = 8.dp)
        .padding(end = 8.dp)

        ,verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = iconPainter,
            contentDescription = null,
            modifier = Modifier.size(18.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text, fontFamily = mulishFontFamily)
    }
}

@Composable
fun AdvertisingPost() {

}
