 package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP


 @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {


    Column {
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.mylogo),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.FillHeight
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
            )
            {
                Icon(imageVector = Icons.Default.Home, contentDescription = "")

            }
        }
    }

     Column (
         Modifier.fillMaxSize(),
         horizontalAlignment = Alignment.CenterHorizontally
     ) {

         Column(
             modifier = Modifier
                 .fillMaxSize(),
             horizontalAlignment = Alignment.CenterHorizontally,
             verticalArrangement = Arrangement.Center
         ){
             Row(
                 horizontalArrangement = Arrangement.Center,
                 verticalAlignment = Alignment.CenterVertically

             ) {
                 Text(
                     text = "Let's make",
                     fontWeight = FontWeight.ExtraLight,
                     color = Color.Black,
                     textAlign = TextAlign.Center,
                     fontSize = 40.sp)
             }
             Row(
                 horizontalArrangement = Arrangement.Center,
                 verticalAlignment = Alignment.CenterVertically

             ) {
                 Text(
                     text = "your dream",
                     fontWeight = FontWeight.ExtraBold,
                     color = Color.Black,
                     textAlign = TextAlign.Center,
                     fontSize = 40.sp)
             }
             Row(
                 horizontalArrangement = Arrangement.Center,
                 verticalAlignment = Alignment.CenterVertically


             ) {
                 Text(
                     text = "vacation",
                     fontWeight = FontWeight.ExtraBold,
                     color = Color.Black,
                     textAlign = TextAlign.Center,
                     fontSize = 40.sp)
             }

             Spacer(modifier = Modifier.height(100.dp))

             Column () {
                 Row(
//             horizontalArrangement = Arrangement.Center,
//             verticalAlignment = Alignment.CenterVertically
                 ) {

                     Button(
                         onClick = {
                             navController.navigate(ROUTE_LOGIN) {
                                 popUpTo(ROUTE_HOME) { inclusive = true }
                             }
                         }) {

                         Text(text = "Get started",
                             color = Color.Black,
                             fontWeight = FontWeight.ExtraBold
                         )

                     }
                 }
             }








         }



     }







}
@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
    }

