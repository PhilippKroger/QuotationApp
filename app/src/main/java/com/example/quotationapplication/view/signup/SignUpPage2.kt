package com.example.quotationapplication.core.presentation.signup

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

import androidx.navigation.NavController

import com.example.quotationapplication.R
import com.example.quotationapplication.ui.theme.mulishFontFamily
import com.example.quotationapplication.view.details.BackButton
import com.example.quotationapplication.view.details.Header
import com.example.quotationapplication.view.details.NextButton


@ExperimentalFoundationApi
@Composable
fun SignUpPage2(navController: NavController) {

    Header(title1 = stringResource(R.string.ldata), title2 = stringResource(R.string.enter_r_data))

    val (nameValue, setEmailValue) = remember { mutableStateOf("") }
    val (lastnameValue, setPasswordValue) = remember { mutableStateOf("") }
    val (birthValue, setPasswordValue1) = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(top = 20.dp)
    ) {
        NameTextField3(emailValue = nameValue, onEmailValueChange = setEmailValue)
        LastnameTextField3(emailValue = lastnameValue, onEmailValueChange = setPasswordValue)
        BirthdayTextField3(emailValue = birthValue, onEmailValueChange = setPasswordValue1)
    }


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {
        BackButton(navController = navController)
        NextButton(navController = navController, nxt_page = "SignUpPage3")
    }
}

@Composable
fun NameTextField3(
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
        label = { Text(stringResource(R.string.name), fontFamily = mulishFontFamily) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
    )
}@Composable
fun LastnameTextField3(
    emailValue: String,
    onEmailValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(top = 0.dp)
            .padding(start = 50.dp),
        textStyle = MaterialTheme.typography.bodyMedium,
        value = emailValue,
        onValueChange = onEmailValueChange,
        label = { Text(stringResource(R.string.lname), fontFamily = mulishFontFamily) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
    )
}

@Composable
fun BirthdayTextField3(
    emailValue: String,
    onEmailValueChange: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .padding(top = 0.dp)
            .padding(start = 50.dp),
        textStyle = MaterialTheme.typography.bodyMedium,
        value = emailValue,
        onValueChange = onEmailValueChange,
        label = { Text(stringResource(R.string.brth), fontFamily = mulishFontFamily)},
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),

    )
}

@Preview
@Composable
fun DataFieldsPreview() {
    Column {
        NameTextField3(emailValue = "") { }
        LastnameTextField3(emailValue = "") { }
        BirthdayTextField3(emailValue = "") { }

    }
}
