package edu.uksw.fti.pam.acitivityintent

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import edu.uksw.fti.pam.acitivityintent.ui.screens.LoginForm
import edu.uksw.fti.pam.acitivityintent.ui.screens.MencariPendonor
import edu.uksw.fti.pam.acitivityintent.ui.screens.MenjadiPendonor
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme

class MP2Activity : ComponentActivity(){
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMAcitivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MenjadiPendonor()
                }
            }
        }
    }
}