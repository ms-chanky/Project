package net.ezra.ui.mydestinations


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import net.ezra.navigation.ROUTE_BALI
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_TRAVELAPP


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DestinationScreen(navController: NavHostController) {
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
                    tint = Color.Black
                )

            }

        }
        Row {
            Text(text = "My Favourites")
        }

    }











}
@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    DestinationScreen(rememberNavController())
}





