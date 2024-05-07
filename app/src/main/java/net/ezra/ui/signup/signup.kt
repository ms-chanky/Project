package net.ezra.ui.signup

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_TRAVELAPP
import net.ezra.ui.auth.SignupScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController) {
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
    modifier = Modifier
        .padding(11.dp)
        .fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Text(text = "Create an account", fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))

    var name by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = ""
            ,tint = Color.White) },
        label = { Text(text = "Username") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

    )

    Spacer(modifier = Modifier.height(14.dp))

    var email by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = ""
            , tint = Color.White) },
        label = { Text(text = "Email Address",color = Color.White) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
//        textStyle = TextStyle(Color.White)
    )
    Spacer(modifier = Modifier.height(14.dp))

    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "",
            tint = Color.White) },
        label = { Text(text = "Email Address",color = Color.White) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
//        textStyle = TextStyle(Color.White)
    )

    Spacer(modifier = Modifier.height(10.dp))

    OutlinedButton(
        onClick = {
            navController.navigate(ROUTE_TRAVELAPP) {
                popUpTo(ROUTE_TRAVELAPP) { inclusive = true }
            }
        },

        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )

    ) {

        Text(text = "Sign up")


    }


}



}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    SignupScreen(rememberNavController())
}

