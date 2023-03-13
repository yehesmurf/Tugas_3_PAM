package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import edu.uksw.fti.pam.acitivityintent.*
import edu.uksw.fti.pam.acitivityintent.R
import kotlinx.coroutines.delay

//@Preview
//@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SplashScreen2(onSplashScreenFinished: () -> Unit){
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#F7F7F7"
    var isLoading by remember { mutableStateOf(true) }
    val lContext = LocalContext.current

    val mContext = LocalContext.current

    LaunchedEffect(Unit) {
        delay(3000L) // simulasi splash screen selama 3 detik
        isLoading = false
        onSplashScreenFinished()
    }

    Surface(color = Color(merahmuda2.toColorInt()), modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.donoreal3),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Spacer(modifier = Modifier.height(350.dp))
            Text(
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color(merahmuda.toColorInt()),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,)
                    ){
                        append(stringResource(id = R.string.info_1))
                    }
                    append("\n")
                    withStyle(
                        style = SpanStyle(fontSize = 15.sp, color = Color.Gray, )
                    ){
                        append(stringResource(id = R.string.info_1_1))
                    }
                }
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(shape = RoundedCornerShape(50), modifier = Modifier.width(240.dp),
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, Intro3Activity::class.java)
                    )
                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())) ) {
                Text(text = stringResource(id = R.string.lanjut), color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (isLoading) {

            }
        }
    }
}

@Composable
fun SplashScreen3(onSplashScreenFinished: () -> Unit){
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#F7F7F7"
    var isLoading by remember { mutableStateOf(true) }
    val lContext = LocalContext.current

    val mContext = LocalContext.current

    LaunchedEffect(Unit) {
        delay(3000L) // simulasi splash screen selama 3 detik
        isLoading = false
        onSplashScreenFinished()
    }

    Surface(color = Color(merahmuda2.toColorInt()), modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.donoreal3),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Spacer(modifier = Modifier.height(350.dp))
            Text(
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color(merahmuda.toColorInt()),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,)
                    ){
                        append(stringResource(id = R.string.info_2))
                    }
                    append("\n")
                    withStyle(
                        style = SpanStyle(fontSize = 15.sp, color = Color.Gray, )
                    ){
                        append(stringResource(id = R.string.info_2_2))
                    }
                }
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(shape = RoundedCornerShape(50), modifier = Modifier.width(240.dp),
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, Intro4Activity::class.java)
                    )
                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())) ) {
                Text(text = stringResource(id = R.string.lanjut), color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (isLoading) {

            }
        }
    }
}

@Composable
fun SplashScreen4(onSplashScreenFinished: () -> Unit){
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#F7F7F7"
    var isLoading by remember { mutableStateOf(true) }
    val lContext = LocalContext.current

    val mContext = LocalContext.current

    LaunchedEffect(Unit) {
        delay(3000L) // simulasi splash screen selama 3 detik
        isLoading = false
        onSplashScreenFinished()
    }

    Surface(color = Color(merahmuda2.toColorInt()), modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.donoreal3),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Spacer(modifier = Modifier.height(350.dp))
            Text(
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color(merahmuda.toColorInt()),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,)
                    ){
                        append(stringResource(id = R.string.info_3))
                    }
                    append("\n")
                    withStyle(
                        style = SpanStyle(fontSize = 15.sp, color = Color.Gray, )
                    ){
                        append(stringResource(id = R.string.info_3_3))
                    }
                }
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(shape = RoundedCornerShape(50), modifier = Modifier.width(240.dp),
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, MainActivity::class.java)
                    )
                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())) ) {
                Text(text = stringResource(id = R.string.lanjut), color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (isLoading) {

            }
        }
    }
}

@Composable
fun SplashScreen1(onSplashScreenFinished: () -> Unit) {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#F7F7F7"
    var isLoading by remember { mutableStateOf(true) }
    val lContext = LocalContext.current

    val mContext = LocalContext.current

    LaunchedEffect(Unit) {
        delay(3000L) // simulasi splash screen selama 3 detik
        isLoading = false
        onSplashScreenFinished()
    }

    Surface(color = Color(merahmuda2.toColorInt()), modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.donoreal3),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Spacer(modifier = Modifier.height(350.dp))
            Text(
                modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(fontSize = 15.sp, color = Color.Gray, )
                    ){
                        append(stringResource(id = R.string.wellcome))
                    }
                    append("\n")
                    withStyle(
                        style = SpanStyle(
                            color = Color(merahmuda.toColorInt()),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,)
                    ){
                        append("DONOREAL")
                    }
                }
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(shape = RoundedCornerShape(50), modifier = Modifier.width(240.dp),
                onClick = {
                    lContext.startActivity(
                        Intent(lContext, Intro2Activity::class.java)
                    )
                }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())) ) {
                Text(text = stringResource(id = R.string.lanjut), color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (isLoading) {
                CircularProgressIndicator(color = Color(merahmuda.toColorInt()))
            }
        }
    }
}