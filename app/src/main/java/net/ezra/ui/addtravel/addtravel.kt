package net.ezra.ui.addtravel

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
import net.ezra.navigation.ROUTE_ADDTRAVEL
import net.ezra.navigation.ROUTE_BEACH
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_ISTANBUL
import net.ezra.navigation.ROUTE_TRAVELAPP
import net.ezra.ui.theme.AppTheme



@Composable
fun addtravelScreen(navController: NavHostController) {

LazyColumn(
    modifier = Modifier
        .fillMaxSize()
//        .padding(20.dp)
) {
    item {
        Row {

            IconButton(onClick = {
                navController.navigate(ROUTE_TRAVELAPP) {
                    popUpTo(ROUTE_ADDTRAVEL) { inclusive = true }

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
                        painter = painterResource(id = R.drawable.atacama),
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
                        Text(text = "Atacama Desert")
                    }
                    Row{
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "South America ")
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
                        painter = painterResource(id = R.drawable.sahara),
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
                        Text(text = "Sahara Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "North Africa")
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
                        painter = painterResource(id = R.drawable.namib),
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
                        Text(text = "Namib Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Namibia")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.arabian),
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
                        Text(text = "Arabian Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Asia")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.thar),
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
                        Text(text = "Thar Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "India")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.kalahari),
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
                        Text(text = "Kalahari Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Botswana")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.antarctica),
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
                        Text(text = "Antarctica")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Antarctica")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.gobi),
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
                        Text(text = "Gobi Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "China")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.wadirum),
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
                        Text(text = "Wadi Rum Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Jordan")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.whitedesert),
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
                        Text(text = "White Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Egypt")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "",tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.mojave),
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
                        Text(text = "Mojave Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "California")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
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
                        painter = painterResource(id = R.drawable.greatvictoria),
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
                        Text(text = "Great Victoria Desert")
                    }
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Australia")
                    }
                    Row{
                        OutlinedButton(onClick = {}, shape = CutCornerShape(10))
                        {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription = "", tint = Color.Red)
                            Text(text = "My destination")
                        }


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
    addtravelScreen(rememberNavController())
}

