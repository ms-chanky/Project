package net.ezra.ui.beach


import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.ui.theme.AppTheme
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.OutlinedButton
import net.ezra.R.id.recyclerView
import net.ezra.navigation.ROUTE_BEACH
import net.ezra.navigation.ROUTE_ISTANBUL
import net.ezra.navigation.ROUTE_TRAVELAPP


@Composable
fun beachScreen(navController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
//            .padding(20.dp)
    ) {
        item {
            Row {

                IconButton(onClick = {
                    navController.navigate(ROUTE_TRAVELAPP) {
                        popUpTo(ROUTE_BEACH) { inclusive = true }

                    }
                }) {
                    Icon(
                        Icons.Filled.ArrowBack, "backIcon",
                        tint = Color.Black
                    )

                }

            }
            Row {
                Text(text = "Find your", fontWeight = FontWeight.Light, fontSize = 20.sp)
            }
            Row {
                Text(text = "Destination", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.gracebay),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Grace Bay Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Turks")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }
                Spacer(modifier = Modifier.width(1.dp))

                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.whitehaven),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Whitehaven")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Australia")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }



            }
            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.maldives),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Maldives Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Maldives")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }
                Spacer(modifier = Modifier.width(1.dp))
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.railay),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Railay Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Thailand")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }




            }
            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.cannon),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Cannon Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "United States")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }
                Spacer(modifier = Modifier.width(1.dp))
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.falassarna),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Falassarna")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Greece")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }




            }
            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.nungwi),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Nungwi Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Zanzibar")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }
                Spacer(modifier = Modifier.width(1.dp))
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.tulum),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Tulum Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Mexico")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }




            }
            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.horseshoe),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Horseshoe Bay")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Bermuda")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }
                Spacer(modifier = Modifier.width(1.dp))
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.eagle),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Eagle Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Aruba")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }




            }

            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.tahiti),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Tahiti Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "French Polynesia")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }
                Spacer(modifier = Modifier.width(1.dp))
                Card{

                    Column (
                        Modifier

                    ) {
                        Image(
                            contentScale = ContentScale.FillBounds,
                            painter = painterResource(id = R.drawable.sevenmile  ),
                            contentDescription = "",
                            modifier = Modifier
                                .size(180.dp)
                                .padding(5.dp)
                                .clip(RoundedCornerShape(10.dp))

                        )
                    }

                    Column  {
                        Row (
                            Modifier

                                .padding(5.dp)
                        ) {
                            Text(text = "Seven Mile Beach")
                        }
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Grand Cayman")
                        }
                        Row{
                            OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                            {
                                Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                                Text(text = "My Destination")
                            }


                        }
                    }


                }






            }






        }







    }















}

private fun Nothing?.updateDestinations(destinations: Any) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
     beachScreen(rememberNavController())
}

