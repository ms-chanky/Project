package net.ezra.ui.signup

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_TRAVELAPP
import net.ezra.ui.auth.AuthHeader


@OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun SignUpScreen(navController: NavController) {
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


        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmPassword by remember { mutableStateOf("") }
        var error by remember { mutableStateOf<String?>(null) }
        var isLoading by remember { mutableStateOf(false) }
        val context = LocalContext.current



        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {



        Text("Sign Up", style = MaterialTheme.typography.h4, color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email", color = Color.White) },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(Color.White)
            )
            Spacer(modifier = Modifier.height(8.dp))


            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password", color = Color.White) },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(Color.White)
            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                label = { Text("Confirm Password", color = Color.White) },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(Color.White)
            )
            Spacer(modifier = Modifier.height(16.dp))

            if (isLoading) {
                CircularProgressIndicator(modifier = Modifier.size(48.dp))
            } else {
                Button(
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    onClick = {
                        if (email.isBlank()){
                            error = "Email is required"
                        } else if (password.isBlank()){
                            error = "Password is required"
                        } else if(confirmPassword.isBlank()) {
                            error = "Password Confirmation required"
                        } else if (password != confirmPassword) {
                            error = "Passwords do not match"
                        } else {
                            isLoading = true
                            signUp(email, password, {
                                isLoading = false
                                Toast.makeText(context, "Sign-up successful!", Toast.LENGTH_SHORT).show()
                                onSignUpSuccess(
                                    navController.navigate(ROUTE_TRAVELAPP) {
                                        popUpTo(ROUTE_SIGNUP) { inclusive = true }
                                    }
                                )
                            }) { errorMessage ->
                                isLoading = false
                                error = errorMessage
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Sign Up", color = Color.White)
                }


                androidx.compose.material3.Text(
                    modifier = Modifier

                        .clickable {
                            navController.navigate(ROUTE_LOGIN) {
                                popUpTo(ROUTE_SIGNUP) { inclusive = true }
                            }
                        },
                    text = "Login",
                    textAlign = TextAlign.Center,
                    color = Color.White
                )

            }

            error?.let {
                Text(
                    text = it,
                    color = MaterialTheme.colors.error,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }

fun onSignUpSuccess(navigate: Unit) {

}


private fun signUp(email: String, password: String, onSuccess: () -> Unit, onError: (String) -> Unit) {
        FirebaseAuth.getInstance().fetchSignInMethodsForEmail(email)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val signInMethods = task.result?.signInMethods ?: emptyList()
                    if (signInMethods.isNotEmpty()) {
                        onError("Email is already registered")
                    } else {
                        // Email is not registered, proceed with sign-up
                        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener { signUpTask ->
                                if (signUpTask.isSuccessful) {
                                    onSuccess()
                                } else {
                                    onError(signUpTask.exception?.message ?: "Sign-up failed")
                                }
                            }
                    }
                } else {
                    onError(task.exception?.message ?: "Failed to check email availability")
                }
            }
    }





@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    SignUpScreen(rememberNavController())
}

