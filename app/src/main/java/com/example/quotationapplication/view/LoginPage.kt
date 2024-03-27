package com.example.quotationapplication.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextButton
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import com.example.quotationapplication.R
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController


@ExperimentalFoundationApi
@Composable
fun LoginPage(navController: NavController) {
    Box(
        modifier = Modifier
            .background(Color.White)
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
            text = stringResource(R.string.enter),
            color = Color(0xFF283C63),
        )

        Text(modifier = Modifier
            .padding(top=100.dp),
            fontSize = 16.sp,
            text = stringResource(R.string.inp1),
            textAlign = TextAlign.Center,
            color = Color(0xFFA7AAAE)
        )
    }


    val (emailValue, setEmailValue) = remember { mutableStateOf("") }
    val (passwordValue, setPasswordValue) = remember { mutableStateOf("") }

    Column {
        EmailTextField(emailValue = emailValue, onEmailValueChange = setEmailValue)
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField(passwordValue = passwordValue, onPasswordValueChange = setPasswordValue)
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.BottomCenter

    ) {
        TextButton( modifier = Modifier
            .padding(end=180.dp),
            onClick = { navController.popBackStack() },

        ) {
            Image(
                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(0.1f),

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


}



@Composable
fun EmailTextField(
    emailValue: String,
    onEmailValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(top = 170.dp)
            .padding(start = 50.dp),
        textStyle = MaterialTheme.typography.bodyMedium,
        value = emailValue,
        onValueChange = onEmailValueChange,
        label = { Text(stringResource(R.string.email)) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
    )
}

@Composable
fun PasswordTextField(
    passwordValue: String,
    onPasswordValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(start=50.dp),
        value = passwordValue,
        onValueChange = onPasswordValueChange,
        label = { Text(stringResource(R.string.password)) },
        textStyle = MaterialTheme.typography.bodyMedium,
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
    )
}


