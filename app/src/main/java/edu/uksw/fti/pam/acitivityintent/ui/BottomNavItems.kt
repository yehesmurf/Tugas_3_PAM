package edu.uksw.fti.pam.acitivityintent.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import edu.uksw.fti.pam.acitivityintent.R

const val home = R.string.rumah
const val story = R.string.cerita_1
const val message = R.string.pesan
const val profile = R.string.profil

sealed class BottomNavItems(
    val title: String,
    val icon: ImageVector,
    val screen_route: String
) {
    object Home: BottomNavItems("home", Icons.Default.Home, "home")
    object Article: BottomNavItems("story", Icons.Default.List, "article")
    object Profile: BottomNavItems("profile", Icons.Default.Settings, "profile")
    object Message: BottomNavItems("Message", Icons.Default.Email, "message")
}