package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import edu.uksw.fti.pam.acitivityintent.*
import edu.uksw.fti.pam.acitivityintent.R
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

@Composable
fun HomeScreen(name: String) {
    val lContext = LocalContext.current
    
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#F7F7F7"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(merahmuda2.toColorInt()))
            .verticalScroll(rememberScrollState())
    ) {
        Column(modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()) {
            Row() {
                Column() {
                    Text(text = stringResource(id = R.string.halo),
                    fontWeight = FontWeight.Bold)
                    Text(
                        text = "admin",
                        color = Color(merahmuda.toColorInt()),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(Modifier.weight(1f))
                Image(painter = painterResource(id = R.drawable.pp1), contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(16.dp)))
            }
            Image(painter = painterResource(id = R.drawable.image_1), contentDescription = "",
                modifier = Modifier.padding(top = 15.dp))
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(fontWeight = FontWeight.Bold,
                            color = Color(merahmuda.toColorInt()),
                            fontSize = 20.sp)
                    )
                    {
                        append("2239")
                    }
                    append(" ")
                    append(stringResource(id = R.string.total_donor))
                }
            )
        }
        Text(text = "Menu :", modifier = Modifier.padding(horizontal = 15.dp), Color(merahmuda.toColorInt()), style = MaterialTheme.typography.h5, fontWeight = FontWeight.SemiBold)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable {
                    lContext.startActivity(
                        Intent(lContext, MPActivity::class.java)
                    )
                }
                .clip(RoundedCornerShape(25)),
            elevation = 10.dp,
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                ClickableText(text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontSize = 18.sp)) {
                        append(text = stringResource(id = R.string.menu_1_1))
                        append(text = " ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold,color = Color(merahmuda.toColorInt())), ) {
                            append(text = stringResource(id = R.string.menu_1_2))
                        }
                    }
                }, onClick = {
                    lContext.startActivity(
                        Intent(lContext, MPActivity::class.java)
                    )
                })
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable {
                    lContext.startActivity(
                        Intent(lContext, MP2Activity::class.java)
                    )
                }
                .clip(RoundedCornerShape(25)),
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                    ClickableText(text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontSize = 18.sp)) {
                            append(text = stringResource(id = R.string.menu_2_1))
                            append(text = " ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(merahmuda.toColorInt())), ) {
                                append(text = stringResource(id = R.string.menu_2_2))
                            }
                        }
                    }, onClick = {
                        lContext.startActivity(
                            Intent(lContext, MP2Activity::class.java)
                        )
                    })
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable { }
                .clip(RoundedCornerShape(25)),
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                    ClickableText(text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontSize = 18.sp)) {
                            append(text = stringResource(id = R.string.menu_3_1))
                            append(text = " ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(merahmuda.toColorInt())), ) {
                                append(text = stringResource(id = R.string.menu_3_2))
                            }
                        }
                    }, onClick = {
                        lContext.startActivity(
                            Intent(lContext, MP3Activity::class.java)
                        )
                    })
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 5.dp)
                .clickable { }
                .clip(RoundedCornerShape(25)),
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center) {
                    ClickableText(text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontSize = 18.sp)) {
                            append(text = stringResource(id = R.string.menu_4_1))
                            append(text = " ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(merahmuda.toColorInt())), ) {
                                append(text = stringResource(id = R.string.menu_4_2))
                            }
                        }
                    }, onClick = {
                        lContext.startActivity(
                            Intent(lContext, MP3Activity::class.java)
                        )
                    })
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Text(text = stringResource(id = R.string.cerita), modifier = Modifier
            .padding(horizontal = 15.dp)
            .padding(top = 30.dp), Color(merahmuda.toColorInt()), style = MaterialTheme.typography.h5, fontWeight = FontWeight.SemiBold)
        Image(painter = painterResource(id = R.drawable.gambar_1), contentDescription = "", modifier = Modifier.padding(horizontal = 15.dp))
        Row(modifier = Modifier.fillMaxSize()) {
            Image(painter = painterResource(id = R.drawable.gambar_3), contentDescription = "", modifier = Modifier
                .padding(15.dp)
                .width(200.dp))
            Image(painter = painterResource(id = R.drawable.gambar_2), contentDescription = "", modifier = Modifier
                .padding(15.dp)
                .width(150.dp))
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