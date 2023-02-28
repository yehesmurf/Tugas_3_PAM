package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt
import edu.uksw.fti.pam.acitivityintent.HomeActivity
import edu.uksw.fti.pam.acitivityintent.MainActivity
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R

@Composable
fun SignUpForm(
    btnOnClickAction: (String?) -> Unit
) {
    val merahmuda = "#D93F3F"

    val lContext = LocalContext.current

    var firstnameInput by remember { mutableStateOf("") }
    var lastnameInput by remember { mutableStateOf("") }
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var passwordConfirInput by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.image_4), contentDescription = "")
        OutlinedTextField(
            value = firstnameInput,
            onValueChange = { firstnameInput = it },
            label = { Text(text = stringResource(R.string.label_firstname)) },
            modifier = Modifier
                .fillMaxWidth(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person, contentDescription = "",
                    tint = Color(merahmuda.toColorInt())
                )
            }
        )
        OutlinedTextField(
            value = lastnameInput,
            onValueChange = { lastnameInput = it },
            label = { Text(text = stringResource(R.string.label_lastname)) },
            modifier = Modifier
                .fillMaxWidth(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person, contentDescription = "",
                    tint = Color(merahmuda.toColorInt())
                )
            }
        )
        OutlinedTextField(
            value = usernameInput,
            onValueChange = { usernameInput = it },
            label = { Text(text = stringResource(R.string.label_username)) },
            modifier = Modifier
                .fillMaxWidth(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person, contentDescription = "",
                    tint = Color(merahmuda.toColorInt())
                )
            }
        )
        OutlinedTextField(
            value = passwordInput ,
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(R.string.label_password)) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock, contentDescription = "",
                    tint = Color(merahmuda.toColorInt())
                )
            }
        )
        OutlinedTextField(
            value = passwordConfirInput ,
            onValueChange = { passwordConfirInput = it },
            label = { Text(text = stringResource(R.string.label_password_confirm)) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth(),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock, contentDescription = "",
                    tint = Color(merahmuda.toColorInt())
                )
            }
        )
        Button(
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())),
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                btnOnClickAction(usernameInput)
                btnOnClickAction(passwordInput)
            }
        ) {
            Text(stringResource(R.string.btn_label_ok), color = Color.White, style = MaterialTheme.typography.h5)
        }
        ClickableText(text = buildAnnotatedString {
            append(text = stringResource(id = R.string.all_have_account))
            withStyle(style = SpanStyle(color = Color(merahmuda.toColorInt())), ) {
                append(text = stringResource(id = R.string.btn_title_login))
            }
        }, onClick = {
            lContext.startActivity(
                Intent(lContext, MainActivity::class.java)
            )
        })
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpFormPreview() {
    PAMAcitivityIntentTheme {
        SignUpForm({})
    }
}