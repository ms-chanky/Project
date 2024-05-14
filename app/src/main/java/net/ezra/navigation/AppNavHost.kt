package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.addtravel.addtravelScreen
import net.ezra.ui.bali.BaliScreen
import net.ezra.ui.banff.BanffScreen
import net.ezra.ui.contact.ContactScreen
import net.ezra.ui.evening.EveningScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.password.PasswordScreen
import net.ezra.ui.services.ServicesScreen
import net.ezra.ui.settings.SettingsScreen
import net.ezra.ui.shop.ShopScreen
import net.ezra.ui.students.AddStudents
import net.ezra.ui.travelapp.TravelappScreen
import net.ezra.ui.beach.beachScreen
import net.ezra.ui.istanbul.IstanbulScreen
import net.ezra.ui.login.LoginScreen
import net.ezra.ui.mydestinations.DestinationScreen
import net.ezra.ui.signup.SignUpScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {

    BackHandler {
        navController.popBackStack()
    }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {



        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }




        composable(ROUTE_SERVICES) {
            ServicesScreen(navController)
        }


        composable(ROUTE_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_EVENING) {
            EveningScreen(navController)
        }
        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_TRAVELAPP) {
            TravelappScreen(navController)
        }
        composable(ROUTE_SERVICES) {
            ServicesScreen(navController)
        }
        composable(ROUTE_SETTINGS) {
            SettingsScreen(navController)
        }
        composable(ROUTE_PASSWORD) {
            PasswordScreen(navController)
        }
        composable(ROUTE_ADDTRAVEL) {
            addtravelScreen(navController)
        }
        composable(ROUTE_BEACH) {
            beachScreen(navController)
        }
        composable(ROUTE_ISTANBUL) {
            IstanbulScreen(navController )
        }
        composable(ROUTE_BALI) {
            BaliScreen(navController )
        }
        composable(ROUTE_BANFF) {
            BanffScreen(navController )
        }
        composable(ROUTE_DESTINATION) {
            DestinationScreen(navController )
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController)

        }


        composable(ROUTE_SIGNUP) {
           SignUpScreen(navController = navController)

        }






































    }
}
