package com.starkindustries.jetpackcomposeappcomponents.UiComponents.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.HomeScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.NotificationScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.PostsScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.ProfileScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.SearchScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Routes.Routes

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
        composable(route=Routes.SearchScreen.route){
            SearchScreen()
        }
        composable(route=Routes.NotificationScreen.route){
            NotificationScreen()
        }
        composable(route=Routes.PostsScreen.route){
            PostsScreen()
        }
    }
}

