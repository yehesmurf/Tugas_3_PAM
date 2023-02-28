package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
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
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R

@Composable
fun HomeScreen(name: String) {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#EFF4F9"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(merahmuda2.toColorInt()))
            .verticalScroll(rememberScrollState())
    ) {
        Image(painter = painterResource(id = R.drawable.image_1), contentDescription = "",
            modifier = Modifier.padding())
        Text(text = "Menu :", modifier = Modifier.padding(horizontal = 15.dp), Color(merahmuda.toColorInt()), style = MaterialTheme.typography.h5, fontWeight = FontWeight.SemiBold)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable { },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                    Text(
                        buildAnnotatedString {
                            append("Mencari ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Pendonor")
                            }
                        }
                    )
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable { },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                    Text(
                        buildAnnotatedString {
                            append("Menjadi ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Pendonor")
                            }
                        }
                    )
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable { },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                    Text(
                        buildAnnotatedString {
                            append("Cerita ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Pendonor")
                            }
                        }
                    )
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable { },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                    Text(
                        buildAnnotatedString {
                            append("Informasi ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Kesehatan")
                            }
                        }
                    )
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Text(text = "Cerita :", modifier = Modifier
            .padding(horizontal = 15.dp)
            .padding(top = 30.dp), Color(merahmuda.toColorInt()), style = MaterialTheme.typography.h5, fontWeight = FontWeight.SemiBold)
        Image(painter = painterResource(id = R.drawable.gambar_1), contentDescription = "", modifier = Modifier.padding(horizontal = 15.dp))
        Row(modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.gambar_3), contentDescription = "", modifier = Modifier.padding(15.dp).width(200.dp))
            Image(painter = painterResource(id = R.drawable.gambar_2), contentDescription = "", modifier = Modifier.padding(15.dp).width(150.dp))
        }
        Spacer(modifier = Modifier.height(100.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMAcitivityIntentTheme {
        HomeScreen("")
    }
}