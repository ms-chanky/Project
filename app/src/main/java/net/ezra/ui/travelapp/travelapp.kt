package net.ezra.ui.travelapp

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_TRAVELAPP
import net.ezra.ui.theme.AppTheme
import androidx.compose.material3.CardDefaults.cardElevation



@Composable
fun TravelappScreen(navController: NavHostController) {
   Column(
       modifier = Modifier
           .fillMaxSize()
   ){

       Column {

           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(20.dp)
           ) {
               Icon(imageVector = Icons.Default.Menu, contentDescription = "")

               Spacer(modifier = Modifier.width(300.dp))

               Icon(imageVector = Icons.Default.Notifications, contentDescription = "")




           }
       }

       Column (
           modifier = Modifier
               .fillMaxSize()
               .padding(start = 20.dp)
       ) {

           Row {
               Text(
                   text = "Explore the",
                   fontWeight = FontWeight.ExtraLight,
                   color = Color.Black,
                   textAlign = TextAlign.Center,
                   fontSize = 40.sp
               )

           }
           Row {
               Text(
                   text = "Beautiful world!",
                   fontWeight = FontWeight.ExtraBold,
                   color = Color.Black,
                   textAlign = TextAlign.Center,
                   fontSize = 40.sp
               )
           }
           Spacer(modifier = Modifier.height(17.dp))
           Column(
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
               Row {
                   var searchText by remember {
                       mutableStateOf(TextFieldValue())
                   }
                   OutlinedTextField(value = searchText, onValueChange = { searchText = it },
                       placeholder = { Text("Search places") },
//                       modifier = Modifier
//                           .fillMaxWidth(),
                       trailingIcon = {
                           Icon(
                               imageVector = Icons.Default.Search,
                               contentDescription = "searchIcon"
                           )
                       })
                   Spacer(modifier = Modifier.width(10.dp))
                   OutlinedButton(
                       onClick = {
                           navController.navigate(ROUTE_SIGNUP) {
                               popUpTo(ROUTE_SIGNUP) { inclusive = true }
                           }
                       }) {

                       Text(text = "Go", color = Color.Black)

                   }


               }


           }
           Spacer(modifier = Modifier.height(14.dp))

           Column(
               Modifier.padding(start = 20.dp)
           ) {
               Row {
                   Text(text = "Categories", fontSize = 24.sp)
               }


           }
           LazyRow {
               item {
                   OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                   {
                       Image(
                           painterResource(id = R.drawable.baloon),
                           contentDescription = "Hot air balloon",
                           modifier = Modifier.size(20.dp)
                       )

                       Text(text = "Sky Tour")
                   }

                   Spacer(modifier = Modifier.width(7.dp))

                   OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                   {
                       Image(
                           painterResource(id = R.drawable.cactus),
                           contentDescription = "Desert",
                           modifier = Modifier.size(20.dp)
                       )

                       Text(text = "Desert")
                   }
                   Spacer(modifier = Modifier.width(7.dp))

                   OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                   {
                       Image(
                           painterResource(id = R.drawable.beach),
                           contentDescription = "Beach",
                           modifier = Modifier.size(20.dp)
                       )

                       Text(text = "Beach")
                   }
                   Spacer(modifier = Modifier.width(7.dp))

                   OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                   {
                       Image(
                           painterResource(id = R.drawable.skydiving),
                           contentDescription = "Skydiving",
                           modifier = Modifier.size(20.dp)
                       )

                       Text(text = "Sky diving")
                   }

               }
           }
           Spacer(modifier = Modifier.height(20.dp))
           Column {
               Row {
                   Text(text = "Travel places", fontSize = 34.sp)
                   Spacer(modifier = Modifier.width(43.dp))
                   OutlinedButton(onClick = {}) {
                       Text(text = "View all",
                            modifier = Modifier
                               .clickable {
                                   navController.navigate(ROUTE_TRAVELAPP) {
                                       popUpTo(ROUTE_TRAVELAPP) { inclusive = true }
                                   }
                               }
                           )

                   }

               }

       }
           Column {
               LazyRow {
                  item {
                      Card (
                          elevation = CardDefaults.cardElevation(35.dp),
//                    border = BorderStroke(1.dp, Color.Black)
                          modifier = Modifier
                              .size(200.dp)
                              .fillMaxWidth()
                      )
                      {

                              Image(
                                  painter = painterResource(id = R.drawable.pyramid),
                                  contentDescription = "",
                                  modifier = Modifier.fillMaxWidth()
                              )

                              Text(text = "Thiksey Monastery",)

                      }
                  }
               }
           }






       }
       
       
       
       
       
       
       
       
       
       
       
       
       


   }






























}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    TravelappScreen(rememberNavController())
}

