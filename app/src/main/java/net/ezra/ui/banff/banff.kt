package net.ezra.ui.banff


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
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_ISTANBUL
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_TRAVELAPP

@Composable
fun BanffScreen(navController: NavHostController) {

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
            Text(text = "Visit Banff as ", fontWeight = FontWeight.Light, fontSize = 19.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(9.dp))
        Row {

            Text(text = "one of your destinations", fontSize = 19.sp, fontWeight = FontWeight.Bold, color = Color.White)

        }
        Spacer(modifier =  Modifier.height(10.dp ))
        Row {
            Card{

                Column (
                    Modifier

                ) {
                    Image(
                        contentScale = ContentScale.FillBounds,
                        painter = painterResource(id = R.drawable.onebali),
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
                        Text(text = "Banff ")
                    }
                }


            }
            Text(text = " An Alberta town full of acclaimed restaurants," +
                    "breweries, boutiques and art galleries, Banff makes" +
                    " for an exciting vacation in every season ", color = Color.White, fontSize = 25.sp)

        }

        Spacer(modifier = Modifier.height(19.dp))

        Row {
            Text(text = ". Vacationers can spend their days hiking, relaxing in hot springs and boating on " +
                    "scenic lakes. Banff's location within the Canadian Rockies also makes it easy for " +
                    "visitors to access Banff National Park, which boasts some of the world's " +
                    " beautiful vistas. Inside the park, travelers can admire sweeping views of " +
                    "the Bow Valley from the Banff Gondola or while schussing the slopes at the park's" +
                    " three ski resorts.", color = Color.White, fontSize = 25.sp)
        }







    }
















}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    BanffScreen(rememberNavController())
}

