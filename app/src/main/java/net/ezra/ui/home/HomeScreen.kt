package net.ezra.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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


@Composable
fun HomeScreen(navController: NavHostController) {
    Box (
        modifier = Modifier
            .fillMaxSize()

    ) {
        androidx.compose.foundation.Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop

        )
    }



        LazyColumn (
        modifier = Modifier
            .fillMaxSize()
    ){
        item {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
//                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row{
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    
                    Spacer(modifier = Modifier.width(94.dp))
                    Spacer(modifier = Modifier.height(300.dp))

                    Column {
                        Row {
                            Text(text = "Current Location")
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        }
                    }
                    Spacer(modifier = Modifier.width(115.dp))
                    
                    Icon(imageVector = Icons.Default.Face, contentDescription = "")

                }
            }
        }
    }
    Spacer(modifier = Modifier.height(2090.dp))
    
    Column {

        var location by remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(
            value = location, onValueChange = { location = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            textStyle = TextStyle(Color.Black)
        )
        Icon(imageVector = Icons.Default.Search, contentDescription = "")

    }


                Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){

        Row {
            Text(text = stringResource(id = R.string.mit))
            Text(text = "Home")
            Spacer(modifier = Modifier.width(45.dp))

        }

Spacer(modifier = Modifier.height(1000.dp))

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "about"
        )

        Button(onClick = {
            navController.navigate(ROUTE_ABOUT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }
        }) {

            Text(text = "sketchy about")

        }

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CONTACT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "Contact"
        )

        Card(
            colors = CardDefaults.cardColors(Color(0xffE52C04)),
            elevation = CardDefaults.cardElevation(5.dp)

        ) {



        }


        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_PRODUCTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to products screen"

        )

        Button(onClick = {
            navController.navigate(ROUTE_MIT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }}) {

            Text(text = "fuurye")

        }

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to mit",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_SHOP) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to shop screen",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
        
        Spacer(modifier = Modifier.height(10.dp))


        
        OutlinedButton(onClick = {

            navController.navigate(ROUTE_ADD_STUDENTS) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

        }) {

            Text(text = "Add Students")

        }







    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

