package net.ezra.ui.travelapp

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme



@Composable
fun TravelappScreen(navController: NavHostController) {
   Column(
       modifier = Modifier
           .fillMaxSize()
   ){
       Row {
           Icon(imageVector = Icons.Default.Menu, contentDescription = "")

           Spacer(modifier = Modifier.width(300.dp))

           Icon(imageVector = Icons.Default.Notifications, contentDescription = "")




       }

       Spacer(modifier = Modifier.height(13.dp))

           Row {
               Text(text = "Explore the",
                   fontWeight = FontWeight.ExtraLight,
                   color = Color.Black,
                   textAlign = TextAlign.Center,
                   fontSize = 40.sp)

           }
           Row {
               Text(
                   text = "Beautiful world!",
                   fontWeight = FontWeight.ExtraBold,
                   color = Color.Black,
                   textAlign = TextAlign.Center,
                   fontSize = 40.sp)
           }
       }


























}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    TravelappScreen(rememberNavController())
}

