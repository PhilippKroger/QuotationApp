package com.example.quotationapplication.core.presentation.signup

import android.os.Build
import androidx.annotation.RequiresApi

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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavController

import com.example.quotationapplication.R
import com.example.quotationapplication.view.BackButton
import com.example.quotationapplication.view.NextButton


@RequiresApi(Build.VERSION_CODES.Q)
@ExperimentalFoundationApi
@Composable
fun SignUpPage1(navController: NavController) {
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
            text = stringResource(R.string.enter_data),
            color = Color(0xFF283C63),
            fontSize = 20.sp,
        )

        Text(modifier = Modifier
            .padding(top = 100.dp)
            .align(Alignment.TopCenter),
            fontSize = 16.sp,
            text = stringResource(R.string.enter_data_2),
            textAlign = TextAlign.Center,
            color = Color(0xFFA7AAAE)
        )
    }


    val (emailValue, setEmailValue) = remember { mutableStateOf("") }
    val (passwordValue, setPasswordValue) = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(top = 20.dp)
    ) {
        EmailTextField1(emailValue = emailValue, onEmailValueChange = setEmailValue)
        PasswordTextField1(passwordValue = passwordValue, onPasswordValueChange = setPasswordValue)
        PasswordTextField2(passwordValue = passwordValue, onPasswordValueChange = setPasswordValue)
        Text(
            modifier = Modifier
                .padding(start = 25.dp)
                .padding(end = 25.dp)
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally),
            text = stringResource(R.string.pt_next),
            fontSize = 13.sp,
            color = Color(0xFFA7AAAE),
            textAlign = TextAlign.Center
        )
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        BackButton(navController = navController)
        NextButton(navController = navController, nxt_page = "SignUpPage2")

    }
}


@Composable
fun EmailTextField1(
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
fun PasswordTextField1(
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


@Composable
fun PasswordTextField2(
    passwordValue: String,
    onPasswordValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(start = 50.dp)
            .padding(top = 0.dp),
        value = passwordValue,
        onValueChange = onPasswordValueChange,
        label = { Text(stringResource(R.string.rep_password)) },
        textStyle = MaterialTheme.typography.bodyMedium,
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
    )
}

@Preview
@Composable
fun EmailAndPasswordFieldsPreview() {
    Column {
        EmailTextField1(emailValue = "") { }
        Spacer(modifier = Modifier.height(16.dp))
        PasswordTextField1(passwordValue = "") { }
    }
}
