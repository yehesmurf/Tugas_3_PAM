package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import edu.uksw.fti.pam.acitivityintent.HomeActivity
import edu.uksw.fti.pam.acitivityintent.contracts.SignUpContract
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R
import kotlin.text.Typography

internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (username.equals(username) && password.equals(password))
}

val Comic = FontFamily(
    Font(R.font.comic)
)

val Typography = Typography (
    h5 = TextStyle(
        fontFamily = Comic,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp
    )
        )

@Composable
fun LoginForm() {
    val merahmuda = "#D93F3F"

    val lContext = LocalContext.current
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignedUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!! })
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .padding(top = 100.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.image_3), contentDescription = "")
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
            value = passwordInput,
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
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                onClick = {
                    val isAuthenticated = doAuth(usernameInput, passwordInput)
                    if (isAuthenticated) {
                        lContext.startActivity(
                            Intent(lContext, HomeActivity::class.java)
                                .apply {
                                    putExtra("username", usernameInput)
                                }
                        )
                    }
                }
            ) {
                Text(text = stringResource(R.string.btn_title_login), color = Color.White, style = MaterialTheme.typography.h5)
            }
        }
        ClickableText(text = buildAnnotatedString {
            append(text = stringResource(id = R.string.not_have_account))
            withStyle(style = SpanStyle(color = Color(merahmuda.toColorInt())), ) {
                append(text = stringResource(id = R.string.btn_title_signup))
            }
        }, onClick = {
            getUsernameFromSignedUpForm.launch("")
        })
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    PAMAcitivityIntentTheme {
        LoginForm()
    }
}