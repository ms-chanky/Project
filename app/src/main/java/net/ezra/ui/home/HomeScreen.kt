 package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
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
                painter = painterResource(id = R.drawable.pintwo),
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
                     color = Color.White,
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
                     color = Color.White,
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
                     color = Color.White,
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
                             navController.navigate(ROUTE_SIGNUP) {
                                 popUpTo(ROUTE_HOME) { inclusive = true }
                             }
                         },
                         colors = ButtonDefaults.buttonColors(
                             containerColor = Color.White,
                             contentColor = Color.Black
                         )) {

                         Text(text = "Get started",
                             color = Color.Black,
                             fontWeight = FontWeight.ExtraBold
                         )

                     }
                 }


             }

             Row {
                 Text(text = "Already have an account", color = Color.White)
             }
             OutlinedButton(
                 onClick = {
                     navController.navigate(ROUTE_LOGIN) {
                         popUpTo(ROUTE_HOME) { inclusive = true }
                     }
                 },
                 colors = ButtonDefaults.buttonColors(
                     containerColor = Color.Transparent,
                     contentColor = Color.White
                 )                                     ) {

                 Text(text = "Log in")

             }





         }



     }







}
@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
    }

