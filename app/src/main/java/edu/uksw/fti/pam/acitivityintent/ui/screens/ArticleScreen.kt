package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun ArticleScreen() {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#EFF4F9"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(merahmuda.toColorInt()))
            .verticalScroll(rememberScrollState())
    ) {
        Image(painter = painterResource(id = R.drawable.image_2), contentDescription = "",
            modifier = Modifier.padding())
        Text(text = "Orang-Orang Baik :", modifier = Modifier.padding(horizontal = 15.dp), Color.White, style = MaterialTheme.typography.h5, fontWeight = FontWeight.SemiBold)
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier.padding(horizontal = 15.dp).fillMaxWidth().padding(top = 10.dp)
        ) {
            Row(
                modifier = Modifier.padding(all = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(size = 40.dp),
                    painter = painterResource(id = R.drawable.pp1),
                    contentDescription = "lucy pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Lucy :",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = " Donor darah itu sehat...",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier.padding(horizontal = 15.dp).fillMaxWidth().padding(top = 10.dp)
        ) {
            Row(
                modifier = Modifier.padding(all = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(size = 40.dp),
                    painter = painterResource(id = R.drawable.pp2),
                    contentDescription = "lucy pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Brian :",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = " pertama sih takut, tapi...",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier.padding(horizontal = 15.dp).fillMaxWidth().padding(top = 10.dp)
        ) {
            Row(
                modifier = Modifier.padding(all = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(size = 40.dp),
                    painter = painterResource(id = R.drawable.pp3),
                    contentDescription = "lucy pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Hezky :",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = " Donor darah bikin badan fresh...",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier.padding(horizontal = 15.dp).fillMaxWidth().padding(top = 10.dp)
        ) {
            Row(
                modifier = Modifier.padding(all = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(size = 40.dp),
                    painter = painterResource(id = R.drawable.pp4),
                    contentDescription = "lucy pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Septovan :",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = " Ayo temen temen, lekas donor...",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier.padding(horizontal = 15.dp).fillMaxWidth().padding(top = 10.dp)
        ) {
            Row(
                modifier = Modifier.padding(all = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(size = 40.dp),
                    painter = painterResource(id = R.drawable.pp5),
                    contentDescription = "lucy pic",
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Angel :",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = " Terima kasih orang baik...",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Text(text = "Artikel :", modifier = Modifier
            .padding(horizontal = 15.dp)
            .padding(top = 30.dp), Color.White, style = MaterialTheme.typography.h5, fontWeight = FontWeight.SemiBold)
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
                            append("Apakah Donor Darah Itu ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Sakit?")
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
                            append("Donor Darah Itu Banyak ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Manfaatnya Loh!")
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
                            append("Berapa Bulan Sekali Harus ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Donor Darah?")
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
                            append("Cek Puskesmas Terdekat Untuk ")
                            withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(merahmuda.toColorInt()))
                            ) {
                                append("Donor Darah")
                            }
                        }
                    )
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "")
                }
            }
        }
        Spacer(modifier = Modifier.height(100.dp))
    }
}


