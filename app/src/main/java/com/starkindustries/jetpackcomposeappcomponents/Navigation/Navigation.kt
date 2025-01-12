package com.starkindustries.jetpackcomposeappcomponents.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.starkindustries.jetpackcomposeappcomponents.Fragments.HomeScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.NotificationScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.PostsScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.ProfileScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.SearchScreen
import com.starkindustries.jetpackcomposeappcomponents.Routes.Routes

@Composable
fun NavigationCompose(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.HomeScreen.route){
        composable(route= Routes.HomeScreen.route){
            HomeScreen()
        }
        composable(route= Routes.ProfileScreen.route){
            ProfileScreen()
        }
        composable(route= Routes.ProfileScreen.route){
            ProfileScreen()
        }
        composable(route= Routes.SearchScreen.route){
            SearchScreen()
        }
        composable(route= Routes.NotificationScreen.route){
            NotificationScreen()
        }
        composable(route= Routes.PostsScreen.route){
            PostsScreen()
        }
    }
}

