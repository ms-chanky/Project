package net.ezra.ui.travelapp

//noinspection UsingMaterialAndMaterial3Libraries
import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.*
import net.ezra.R
import net.ezra.navigation.ROUTE_ADDTRAVEL
import net.ezra.navigation.ROUTE_BALI
import net.ezra.navigation.ROUTE_BANFF
import net.ezra.navigation.ROUTE_BEACH
import net.ezra.navigation.ROUTE_DESTINATION
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_ISTANBUL
import net.ezra.navigation.ROUTE_SETTINGS
import net.ezra.navigation.ROUTE_TRAVELAPP




@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TravelappScreen(navController: NavHostController) {

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Row() {

                    }
                },

                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, "backIcon")
                    }
                },

                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Outlined.Notifications, "backIcon")
                    }
                },

                backgroundColor = Color.LightGray





            )
        },

        content = {

            Box (
                Modifier.fillMaxSize()
            ) {

                Image(painter = painterResource(id = R.drawable.pintwo), contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize())

            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
            ){

                Spacer(modifier = Modifier.height(70.dp))

                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 20.dp)
                ) {

                    Row {
                        Text(
                            text = "Explore the",
                            fontWeight = FontWeight.ExtraLight,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            fontSize = 40.sp
                        )

                    }
                    Row {
                        Text(
                            text = "Beautiful world!",
                            fontWeight = FontWeight.ExtraBold,
                            color = Color.White,
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
                                placeholder = { Text("Search places",
                                    color = Color.White) },
                                textStyle = TextStyle(Color.White),
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(end = 20.dp),
                                trailingIcon = {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = "searchIcon",
                                        tint = Color.White
                                    )
                                },
                                colors = TextFieldDefaults.textFieldColors(
                                    containerColor = Color.Transparent,
                                    focusedPlaceholderColor = Color.White,
                                    unfocusedPlaceholderColor = Color.White,
                                    focusedTextColor = Color.White,
                                    unfocusedIndicatorColor = Color.Black,
                                    focusedIndicatorColor = Color.White
                                ))




                        }


                    }
                    Spacer(modifier = Modifier.height(14.dp))

                    Column(
                        Modifier.padding(start = 20.dp)
                    ) {
                        Row {
                            Text(text = "Categories",
                                fontSize = 24.sp,
                                color = Color.White)
                        }


                    }
                    LazyRow {
                        item {

                            OutlinedButton(onClick = {
                                                     navController.navigate(ROUTE_ADDTRAVEL) {
                                                         popUpTo(ROUTE_TRAVELAPP) {
                                                             inclusive = true
                                                         }
                                                     }

                            }, shape = CutCornerShape(10))
                            {
                                Image(
                                    painterResource(id = R.drawable.cactus),
                                    contentDescription = "Desert",
                                    modifier = Modifier.size(20.dp)
                                )

                                Text(text = "Desert",
                                    color = Color.White)
                            }
                            Spacer(modifier = Modifier.width(7.dp))

                            OutlinedButton(onClick = {
                                navController.navigate(ROUTE_BEACH) {
                                    popUpTo(ROUTE_TRAVELAPP) {
                                        inclusive = true
                                    }
                                }
                            }, shape = CutCornerShape(10))
                            {
                                Image(
                                    painterResource(id = R.drawable.beach),
                                    contentDescription = "Beach",
                                    modifier = Modifier.size(20.dp)
                                )

                                Text(text = "Beach",
                                    color = Color.White)
                            }


                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Column {
                        Row {
                            Text(text = "Popular Travel places", fontSize = 34.sp, color = Color.White)

                        }

                    }
                    Column {
                        LazyRow {
                            item {
                                Card(
                                    modifier = Modifier
                                        .clickable { navController.navigate(ROUTE_ISTANBUL){
                                            popUpTo(ROUTE_TRAVELAPP) { inclusive = true }

                                        } }
                                ){


                                    Column (
                                        Modifier

                                    ) {

                                        Image(
                                            contentScale = ContentScale.FillBounds,
                                            painter = painterResource(id = R.drawable.istanbul),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .size(200.dp)
                                                .padding(5.dp)
                                                .clip(RoundedCornerShape(10.dp))

                                        )
                                    }

                                    Column (
                                        Modifier
                                            .fillMaxWidth()
                                    ) {

                                        Row {
                                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                                            Text(text = "Istanbul")
                                        }
                                    }

                                }

                                Spacer(modifier = Modifier.width(20.dp))

                                Card(
                                    modifier = Modifier
                                        .clickable { navController.navigate(ROUTE_BALI){
                                            popUpTo(ROUTE_TRAVELAPP) { inclusive = true }

                                        } }
                                ){

                                    Column (
                                        Modifier

                                    ) {
                                        Image(
                                            contentScale = ContentScale.FillBounds,
                                            painter = painterResource(id = R.drawable.bali),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .size(200.dp)
                                                .padding(5.dp)
                                                .clip(RoundedCornerShape(10.dp))

                                        )
                                    }

                                    Column (
                                        Modifier
                                            .fillMaxWidth()
                                    ) {

                                        Row {
                                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                                            Text(text = "Bali")
                                        }
                                    }


                                }

                                Spacer(modifier = Modifier.width(20.dp))

                                Card(
                                    modifier = Modifier
                                        .clickable { navController.navigate(ROUTE_BANFF){
                                            popUpTo(ROUTE_TRAVELAPP) { inclusive = true }

                                        } }
                                ){

                                    Column {


                                        Image(
                                            contentScale = ContentScale.FillBounds,
                                            painter = painterResource(id = R.drawable.banff),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .size(200.dp)
                                                .padding(5.dp)
                                                .clip(RoundedCornerShape(10.dp))

                                        )
                                    }

                                    Column (
                                        Modifier
                                            .fillMaxWidth()
                                    ) {

                                        Row {
                                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                                            Text(text = "Banff")
                                        }
                                    }

                                }

                            }
                        }
                    }


                }


            }




        },

        bottomBar = { BottomBar(navController)}

        )

}

@SuppressLint("AutoboxingStateCreation")
@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color.White,
    modifier = Modifier
        .fillMaxWidth()) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                navController.navigate(ROUTE_HOME){
                    popUpTo(ROUTE_TRAVELAPP) { inclusive = true }

                }
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "My Destinations") }, selected = (selectedIndex.value == 1), onClick = {
                navController.navigate(ROUTE_DESTINATION) {
                    popUpTo(ROUTE_TRAVELAPP) { inclusive = true }
                }
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Settings, "")
        },
            label = { Text(text = "Settings") }, selected = (selectedIndex.value == 2), onClick = {
                navController.navigate(ROUTE_SETTINGS) {
                    popUpTo(ROUTE_TRAVELAPP) { inclusive = true }
            }

            })
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    TravelappScreen(rememberNavController())
}




