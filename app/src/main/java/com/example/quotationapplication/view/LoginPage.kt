package com.example.quotationapplication.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.res.stringResource

import com.example.quotationapplication.R

import androidx.navigation.NavController
import com.example.quotationapplication.ui.theme.mulishFontFamily
import com.example.quotationapplication.view.details.BackButton
import com.example.quotationapplication.view.details.Header
import com.example.quotationapplication.view.details.NextButton



@ExperimentalFoundationApi
@Composable
fun LoginPage(navController: NavController) {

    Header(title1 = stringResource(R.string.enter), title2 = stringResource(R.string.inp1))

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

        BackButton(navController = navController)
        NextButton(navController = navController, nxt_page = "QuotationScreen")
    }


}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailTextField(
    emailValue: String,
    onEmailValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(top = 170.dp)
            .padding(start = 50.dp)
            .background(color = Color(0xFFEFF1F4))
        ,
        textStyle = MaterialTheme.typography.bodyMedium,
        value = emailValue,
        onValueChange = onEmailValueChange,
        label = { Text(stringResource(R.string.email), fontFamily = mulishFontFamily) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Убирает рамку, когда поле не в фокусе
            focusedBorderColor = Color.Transparent, // Убирает рамку, когда поле в фокусе
            disabledBorderColor = Color.Transparent // Убирает рамку, когда поле не активно
        )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(
    passwordValue: String,
    onPasswordValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(start=50.dp)
            .background(color = Color(0xFFEFF1F4)),
        value = passwordValue,
        onValueChange = onPasswordValueChange,
        label = { Text(stringResource(R.string.password), fontFamily = mulishFontFamily) },
        textStyle = MaterialTheme.typography.bodyMedium,
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent, // Убирает рамку, когда поле не в фокусе
            focusedBorderColor = Color.Transparent, // Убирает рамку, когда поле в фокусе
            disabledBorderColor = Color.Transparent // Убирает рамку, когда поле не активно
        )
    )
}


