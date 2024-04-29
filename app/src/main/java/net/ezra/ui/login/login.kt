package net.ezra.ui.login

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.outlinedTextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_TRAVELAPP
import net.ezra.ui.auth.AuthHeader
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.theme.AppTheme
import net.ezra.ui.theme.spacing


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
) {
   
    
}


        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .padding(11.dp)
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Log in " , fontSize = 16.sp)
            Spacer(modifier = Modifier.height(28.dp))

            var name by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") },
                label = { Text(text = "Username") }

            )



            Spacer(modifier = Modifier.height(14.dp))


            var email by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
                label = { Text(text = "Email Address") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                textStyle = TextStyle(Color.White)
            )

            Spacer(modifier = Modifier.height(14.dp))


            var password by remember {
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
              label = {Text(text = "Telephone No.")},
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.DarkGray,
                    unfocusedBorderColor = Color.DarkGray,
                    focusedLabelColor = Color.DarkGray,
                    unfocusedLabelColor = Color.DarkGray,
                    cursorColor = Color.Black,
                    unfocusedLeadingIconColor = Color.DarkGray
                )
            )
            Spacer(modifier = Modifier.height(10.dp))

            OutlinedButton(
                onClick = {
                    navController.navigate(ROUTE_TRAVELAPP) {
                        popUpTo(ROUTE_TRAVELAPP) { inclusive = true }
                    }
                }) {

                Text(text = "Log in", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Don't have an account?")


            OutlinedButton(
                onClick = {
                    navController.navigate(ROUTE_SIGNUP) {
                        popUpTo(ROUTE_SIGNUP) { inclusive = true }
                    }
                }) {

                Text(text = "Sign up", color = Color.Black)

        }



    }















}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    LoginScreen(rememberNavController())
}

