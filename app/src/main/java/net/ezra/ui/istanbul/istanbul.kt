package net.ezra.ui.istanbul


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_BANFF
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_ISTANBUL
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_TRAVELAPP

@Composable
fun IstanbulScreen(navController: NavHostController) {
    Column {
        Box (
            Modifier.fillMaxSize()
        ) {

            Image(painter = painterResource(id = R.drawable.pintwo), contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize())

        }

    }
   
      
    Column(
        Modifier
            .padding(11.dp)
            .fillMaxSize()
    ){
        Row {

            IconButton(onClick = {
                navController.navigate(ROUTE_TRAVELAPP) {
                    popUpTo(ROUTE_ISTANBUL) { inclusive = true }

                }
            }) {
                Icon(
                    Icons.Filled.ArrowBack, "backIcon",
                    tint = Color.White
                )

            }

        }
        Row {
            Text(text = "Explore", fontWeight = FontWeight.Light, fontSize = 19.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(9.dp))
        Row {

            Text(text = "Istanbul", fontSize = 19.sp, fontWeight = FontWeight.Bold, color = Color.White)

        }
        Spacer(modifier =  Modifier.height(10.dp ))
        Row {
            Card{

                Column (
                    Modifier

                ) {
                    Image(
                        contentScale = ContentScale.FillBounds,
                        painter = painterResource(id = R.drawable.oneinstanbul),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(5.dp)
                            .clip(RoundedCornerShape(10.dp))

                    )
                }

                Column  {

                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Istanbul ")
                    }
                }


            }
            Text(text = "Istanbul, Turkey. A place where the Middle" +
                    " East meets Asia. ", color = Color.White, fontSize = 25.sp)

        }

        Spacer(modifier = Modifier.height(19.dp))

        Row {
            Text(text = "Istanbul is a major city in Turkey that straddles Europe" +
                    " and Asia across the Bosphorus Strait. Its Old City reflects" +
                    " cultural influences of the many empires that once ruled here." +
                    " In the Sultanahmet district, the open-air, Roman-era Hippodrome " +
                    "was for centuries the site of chariot races, and Egyptian obelisks also" +
                    " remain. The iconic Byzantine Hagia Sophia features" +
                    " a soaring 6th-century dome and rare " +
                    "Christian mosaics.", color = Color.White, fontSize = 25.sp)
        }







    }









}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    IstanbulScreen(rememberNavController())
}

