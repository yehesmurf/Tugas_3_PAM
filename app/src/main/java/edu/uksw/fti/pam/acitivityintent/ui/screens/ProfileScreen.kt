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
fun ProfileScreen() {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#EFF4F9"
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(merahmuda2.toColorInt()))
            .verticalScroll(rememberScrollState())
    ) {
        Card(
            elevation = 4.dp,
            shape = RoundedCornerShape(size = 12.dp),
            modifier = Modifier.padding(horizontal = 15.dp).fillMaxWidth().padding(top = 10.dp)
        ) {
            Text(text = "Profile :", modifier = Modifier.padding(horizontal = 15.dp), Color(merahmuda.toColorInt()), style = MaterialTheme.typography.h5, fontWeight = FontWeight.SemiBold)
            Row(
                modifier = Modifier.padding(all = 12.dp).padding(top = 40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "First Name :",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = "...",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Row(
                modifier = Modifier.padding(all = 12.dp).padding(top = 70.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Last Name :",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = "...",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Row(
                modifier = Modifier.padding(all = 12.dp).padding(top = 100.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Username :",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = "...",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Row(
                modifier = Modifier.padding(all = 12.dp).padding(top = 130.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(width = 8.dp)) // gap between image and text
                Text(
                    text = "Password :",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(merahmuda.toColorInt())
                )
                Text(
                    text = "...",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        }
        Spacer(modifier = Modifier.height(100.dp))
    }
}