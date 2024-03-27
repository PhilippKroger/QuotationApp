package com.example.quotationapplication.core.presentation.signup




import android.annotation.SuppressLint
import android.widget.DatePicker
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TimePicker
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotationapplication.R
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusState
import kotlinx.coroutines.launch
import java.io.DataInput

import java.time.LocalDate
import java.util.Date


@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalFoundationApi
@Composable
fun SignUpPage2() {
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
            text = "Личные данные",
            color = Color(0xFF283C63),
        )

        Text(modifier = Modifier
            .padding(top = 100.dp)
            .align(Alignment.TopCenter),
            fontSize = 16.sp,
            text = "Укажите настоящие имя, фамилию и дату  рождения",
            textAlign = TextAlign.Center,
            color = Color(0xFFA7AAAE)
        )
    }


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
        label = { Text("Имя") },
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
        label = { Text("Фамилия") },
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
        label = { Text("Дата рождения")},
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

/*
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun datePicket() {
    // Decoupled snackbar host state from scaffold state for demo purposes.
    val snackState = remember { SnackbarHostState() }
    val snackScope = rememberCoroutineScope()
    SnackbarHost(hostState = snackState, Modifier)
    val openDialog = remember { mutableStateOf(true) }
    if (openDialog.value) {
        val datePickerState = rememberDatePickerState()
        val confirmEnabled = remember {
            derivedStateOf { datePickerState.selectedDateMillis != null }
        }
        DatePickerDialog(
            onDismissRequest = {
                // Dismiss the dialog when the user clicks outside the dialog or on the back
                // button. If you want to disable that functionality, simply use an empty
                // onDismissRequest.
                openDialog.value = false
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        openDialog.value = false
                        snackScope.launch {
                            snackState.showSnackbar(
                                "Selected date timestamp: ${datePickerState.selectedDateMillis}"
                            )
                        }
                    },
                    enabled = confirmEnabled.value
                ) {
                    Text("OK")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        openDialog.value = false
                    }
                ) {
                    Text("Cancel")
                }
            }
        ) {
            DatePicker(state = datePickerState)
        }
    }
}

 */