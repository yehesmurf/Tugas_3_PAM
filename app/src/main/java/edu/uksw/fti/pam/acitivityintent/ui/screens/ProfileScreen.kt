package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import edu.uksw.fti.pam.acitivityintent.*
import edu.uksw.fti.pam.acitivityintent.R

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun ProfileScreen() {
    val lContext = LocalContext.current

    val merahmuda = "#D93F3F"
    val merahmuda2 = "#F7F7F7"
    Surface(color = Color(merahmuda2.toColorInt()), modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(merahmuda2.toColorInt()))
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = Modifier.padding(10.dp),
                horizontalAlignment = CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(25.dp))
                Image(
                    painter = painterResource(id = R.drawable.pp1),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .align(CenterHorizontally)
                )
                Text(
                    text = "admin",
                    color = Color(merahmuda.toColorInt()),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                ClickableText(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(fontSize = 15.sp, color = Color.Gray)
                        ){
                            append(stringResource(id = R.string.profile_set))
                        }
                    },
                    onClick = {/*TODO*/}
                )
                Spacer(modifier = Modifier.height(50.dp))
                Card(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(size = 12.dp),
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .fillMaxWidth()
                        .padding(top = 25.dp)
                        .height(50.dp)
                ){
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontSize = 18.sp)) {
                                    append(stringResource(id = R.string.edit_p1))
                                    append(" ")
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color(merahmuda.toColorInt()),
                                            fontWeight = FontWeight.Bold
                                        ),
                                    ) {
                                        append(stringResource(id = R.string.edit_p2))
                                    }
                                }
                            },
                            onClick = {
                                lContext.startActivity(
                                    Intent(lContext, CameraActivity::class.java)
                                )
                            }
                        )
                    }
                }
                Card(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(size = 12.dp),
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .fillMaxWidth()
                        .padding(top = 25.dp)
                        .height(50.dp)
                ){
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontSize = 18.sp)) {
                                    append(stringResource(id = R.string.edit_p3))
                                    append(" ")
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color(merahmuda.toColorInt()),
                                            fontWeight = FontWeight.Bold
                                        ),
                                    ) {
                                        append(stringResource(id = R.string.edit_p2))
                                    }
                                }
                            },
                            onClick = {/*TODO*/ }
                        )
                    }
                }
                Card(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(size = 12.dp),
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .fillMaxWidth()
                        .padding(top = 25.dp)
                        .height(50.dp)
                ){
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontSize = 18.sp)) {
                                    append(stringResource(id = R.string.edit_p4))
                                    append(" ")
                                    withStyle(
                                        style = SpanStyle(
                                            color = Color(merahmuda.toColorInt()),
                                            fontWeight = FontWeight.Bold
                                        ),
                                    ) {
                                        append(stringResource(id = R.string.edit_p5))
                                    }
                                }
                            },
                            onClick = {/*TODO*/ }
                        )
                    }
                }
                Card(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(size = 12.dp),
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .width(100.dp)
                        .padding(top = 25.dp)
                        .height(50.dp)
                        .align(CenterHorizontally)
                        .clip(RoundedCornerShape(20)),
                    onClick = {
                        lContext.startActivity(
                            Intent(lContext, MainActivity::class.java)
                        )
                    }
                ){
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        ClickableText(
                            text = buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = Color(merahmuda.toColorInt()),
                                        fontWeight = FontWeight.Bold
                                    ),
                                ) {
                                    append(stringResource(id = R.string.logout))
                                }
                            },
                            onClick = {
                                lContext.startActivity(
                                    Intent(lContext, MainActivity::class.java)
                                )
                            }
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}