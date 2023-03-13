package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.graphics.Paint.Align
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import edu.uksw.fti.pam.acitivityintent.R

@Preview
@Composable
fun MessageScreen() {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#F7F7F7"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(merahmuda2.toColorInt()))
            .verticalScroll(rememberScrollState())
    ) {
        Column(modifier = Modifier.padding(15.dp)) {
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
            Spacer(Modifier.height(25.dp))
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
        Spacer(Modifier.height(25.dp))
        Card(
            elevation = 10.dp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
                .height(150.dp)
                .clip(RoundedCornerShape(15)),
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)) {
                        append(stringResource(id = R.string.pesan))
                        append("\n")
                        withStyle(
                            style = SpanStyle(
                                color = Color(merahmuda.toColorInt()),
                                fontWeight = FontWeight.Bold
                            ),
                        ) {
                            append(stringResource(id = R.string.pesan2))
                        }
                    }
                }, modifier = Modifier
                    .padding(10.dp)
            )
        }
    }
}