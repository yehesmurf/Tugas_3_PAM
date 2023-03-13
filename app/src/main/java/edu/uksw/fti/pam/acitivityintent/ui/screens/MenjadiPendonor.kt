package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.core.graphics.toColorInt
import edu.uksw.fti.pam.acitivityintent.HomeActivity
import edu.uksw.fti.pam.acitivityintent.MPActivity
import edu.uksw.fti.pam.acitivityintent.MainActivity
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R
import java.util.Date

@RequiresApi(Build.VERSION_CODES.N)
@Composable
fun MenjadiPendonor() {
    val merahmuda = "#D93F3F"
    val merahmuda2 = "#EFF4F9"

    val lContext = LocalContext.current

    val mContext = LocalContext.current

    val mYear: Int
    val mMonth: Int
    val mDay: Int
    val mCalendar = Calendar.getInstance()

    mYear = mCalendar.get(Calendar.YEAR)
    mMonth = mCalendar.get(Calendar.MONTH)
    mDay = mCalendar.get(Calendar.DAY_OF_MONTH)

    mCalendar.time = Date()

    val mDate = remember { mutableStateOf("") }

    val mDatePickerDialog = DatePickerDialog(
        mContext,
        { _: DatePicker, mYear: Int, mMonth: Int, mDayOfMonth: Int ->
            mDate.value = "$mDayOfMonth/${mMonth+1}/$mYear"
        }, mYear, mMonth, mDay
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(merahmuda2.toColorInt()))
            .verticalScroll(rememberScrollState())
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 15.dp)
                .clickable { },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize()) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")
                    ClickableText(text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontSize = 18.sp, color = Color.Gray)) {
                            append(text = stringResource(id = R.string.menu_2_1))
                            append(text = " ")
                            append(text = stringResource(id = R.string.menu_2_2))
                        }
                    }, onClick = {
                        lContext.startActivity(
                            Intent(lContext, HomeActivity::class.java)
                        )
                    })
                }
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .padding(top = 15.dp)
                .clickable { },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.padding(15.dp)
            ) {
                Row(modifier = Modifier.fillMaxSize()) {
                    ClickableText(text = buildAnnotatedString {
                        withStyle(style = SpanStyle(fontSize = 20.sp)) {
                            append(text = stringResource(id = R.string.hai))
                            append(text = ", ")
                            withStyle(style = SpanStyle(color = Color(merahmuda.toColorInt())), ){
                                append(text = stringResource(id = R.string.label_username))
                            }
                        }
                    }, onClick = {
                        lContext.startActivity(
                            Intent(lContext, MPActivity::class.java)
                        )
                    })
                }
                Text(text = stringResource(id = R.string.penjelasan_4))
                Row(horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 30.dp)
                        .padding(horizontal = 40.dp)) {
                    OutlinedButton(onClick = { /*TODO*/ },
                        modifier= Modifier
                            .size(60.dp)
                            .padding(5.dp),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp),
                        border = BorderStroke(2.dp, Color.Red),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                        Text(text = "A", color = Color.Black, fontSize = 18.sp )
                    }
                    OutlinedButton(onClick = { /*TODO*/ },
                        modifier= Modifier
                            .size(60.dp)
                            .padding(5.dp),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp),
                        border = BorderStroke(2.dp, Color.Red),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                        Text(text = "B", color = Color.Black , fontSize = 18.sp )
                    }
                    OutlinedButton(onClick = { /*TODO*/ },
                        modifier= Modifier
                            .size(60.dp)
                            .padding(5.dp),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp),
                        border = BorderStroke(2.dp, Color.Red),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                        Text(text = "AB", color = Color.Black , fontSize = 18.sp )
                    }
                    OutlinedButton(onClick = { /*TODO*/ },
                        modifier= Modifier
                            .size(60.dp)
                            .padding(5.dp),
                        shape = CircleShape,
                        contentPadding = PaddingValues(0.dp),
                        border = BorderStroke(2.dp, Color.Red),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)) {
                        Text(text = "O", color = Color.Black , fontSize = 18.sp )
                    }
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 30.dp)
                            .padding(horizontal = 20.dp)){
                        Text(text = stringResource(id = R.string.tanggal), modifier = Modifier
                            .padding(top = 15.dp)
                            .padding(horizontal = 5.dp))
                        Button(onClick = {
                            mDatePickerDialog.show()
                        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())) ) {
                            Text(text = stringResource(id = R.string.tanggal_2), color = Color.White)
                        }
                    }
                    Row(modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 0.dp)
                        .padding(horizontal = 40.dp)){
                        Text(text = stringResource(id = R.string.lokasi), modifier = Modifier.padding(top = 15.dp))
                    }
                    var popup by remember { mutableStateOf(false) }
                    Spacer(modifier = Modifier.height(100.dp))
                    Button(shape = RoundedCornerShape(50), modifier = Modifier.width(240.dp),
                        onClick = {
                            popup = true
                    }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())) ) {
                        Text(text = stringResource(id = R.string.proses), color = Color.White)
                    }
                    if (popup) {
                        Popup(
                            popupPositionProvider = WindowCenterOffsetPositionProvider(),
                            onDismissRequest = { popup = false },
                        ) {
                            Surface(
                                border = BorderStroke(1.dp, MaterialTheme.colors.secondary),
                                shape = RoundedCornerShape(8.dp),
                                color = Color(0xCCEEEEEE),
                            ) {
                                Column(
                                    modifier = Modifier.padding(100.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Icon(imageVector = Icons.Filled.Check, contentDescription = "", modifier = Modifier.size(50.dp))
                                    Text(text = stringResource(id = R.string.penjelasan_5))
                                    Text(text = "Gol Darah  : B", fontSize = 20.sp, textAlign = TextAlign.Center)
                                    Text(text = "Tanggal    : ${mDate.value}", fontSize = 20.sp, textAlign = TextAlign.Center)
                                    Text(text = "Lokasi     : Puskesmas SITUBONDO, Jawa Timur", fontSize = 20.sp, textAlign = TextAlign.Center)
                                    Text(text = stringResource(id = R.string.penjelasan_3))
                                    Spacer(modifier = Modifier.height(32.dp))
                                    Button(shape = RoundedCornerShape(50), modifier = Modifier.width(240.dp),
                                        onClick = {
                                            lContext.startActivity(
                                                Intent(lContext, HomeActivity::class.java)
                                            )
                                        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(merahmuda.toColorInt())) ) {
                                        Text(text = stringResource(id = R.string.lanjut), color = Color.White)
                                    }
                                }
                            }
                        }
                    }
//                    Text(text = "Selected Date: ${glo}", fontSize = 30.sp, textAlign = TextAlign.Center)
//                    Text(text = "Selected Date: ${mDate.value}", fontSize = 30.sp, textAlign = TextAlign.Center)
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.N)
@Preview(showBackground = true)
@Composable
fun MenjadiPendonorPreview() {
    PAMAcitivityIntentTheme {
        MenjadiPendonor()
    }
}