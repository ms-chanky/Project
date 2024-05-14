package net.ezra.ui.bali


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
import net.ezra.navigation.ROUTE_BALI
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_ISTANBUL
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_TRAVELAPP

@Composable
fun BaliScreen(navController: NavHostController) {

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
                    popUpTo(ROUTE_BALI) { inclusive = true }

                }
            }) {
                Icon(
                    Icons.Filled.ArrowBack, "backIcon",
                    tint = Color.White
                )

            }

        }
        Row (
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "Explore the", fontWeight = FontWeight.Light, fontSize = 19.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(9.dp))
        Row{

            Text(text = "ancient temples of Bali", fontSize = 19.sp, fontWeight = FontWeight.Bold, color = Color.White)

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
                        Text(text = "Bali ")
                    }
                }


            }
            Text(text = " Embark upon sizzling" +
                    " gastronomic experiences in Bali. ", color = Color.White, fontSize = 25.sp)

        }

        Spacer(modifier = Modifier.height(19.dp))

        Row {
            Text(text = "The tropical Indonesian island of Bali is a lush, tropical destination that should not be missed." +
                    " A bit of everything can be found here, from towering volcanoes and sun-kissed shores to lush jungles" +
                    " complete with mischievous monkeys." +
                    "Add in the cultural aspect of vibrant temples and" +
                    " the friendly Balinese people, it becomes very easy to" +
                    " spend longer here than you may have planned. Bali has a " +
                    "long list of interesting things to do including rice terrace tours," +
                    " volcano climbs, surfing lessons, and handicraft markets." +
                    "In the evening, enjoy the delights of Balinese dining with a" +
                    " tasty plate of Nasi Goreng or satay followed up by the rhythmic " +
                    "beats of a Kecak dance performance.", color = Color.White, fontSize = 25.sp)
        }







    }











}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    BaliScreen(rememberNavController())
}

