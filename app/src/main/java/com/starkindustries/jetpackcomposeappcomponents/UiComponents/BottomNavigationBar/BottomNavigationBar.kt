package com.starkindustries.jetpackcomposeappcomponents.UiComponents.BottomNavigationBar

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.HomeScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.NotificationScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.ProfileScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.SearchScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Fragments.SettingsScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Routes.Routes
import com.starkindustries.jetpackcomposeappcomponents.ui.theme.SeaFoam
import java.lang.reflect.Modifier

@Composable
fun BottomNavigationBarCompose(){
    var navController = rememberNavController()
    var context = LocalContext.current.applicationContext
    var coroutineScope = rememberCoroutineScope()
    var selectedItem by remember {
        mutableStateOf(Icons.Default.Home)
    }

    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = SeaFoam
            ) {
                IconButton(onClick = { 
                    selectedItem=Icons.Default.Home
                    navController.navigate(Routes.HomeScreen.route){
                        popUpTo(0)
                    }
                }
                , modifier = androidx.compose.ui.Modifier
                        .weight(1f)) {
                    Icon(imageVector = Icons.Default.Home
                        , contentDescription = ""
                    , tint = if(selectedItem==Icons.Default.Home)
                                Color.White
                            else
                                Color.DarkGray
                    )
                }
                IconButton(onClick = {
                    selectedItem=Icons.Default.Search
                    navController.navigate(Routes.SearchScreen.route){
                        popUpTo(0)
                    }
                }
                    , modifier = androidx.compose.ui.Modifier
                        .weight(1f)) {
                    Icon(imageVector = Icons.Default.Search
                        , contentDescription = ""
                        , tint = if(selectedItem==Icons.Default.Search)
                            Color.White
                        else
                            Color.DarkGray
                    )
                }

                Box(modifier = androidx.compose.ui.Modifier
                    .padding(10.dp)
                    .weight(1f)){
                    FloatingActionButton(onClick = {
                        Toast.makeText(context, "Opening Bottom Sheet", Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(imageVector = Icons.Default.Add
                            , contentDescription = ""
                        , tint = Color.Black
                        , modifier = androidx.compose.ui.Modifier
                                .size(30.dp))
                    }
                }

                IconButton(onClick = {
                    selectedItem=Icons.Default.Notifications
                    navController.navigate(Routes.NotificationScreen.route){
                        popUpTo(0)
                    }
                }
                    , modifier = androidx.compose.ui.Modifier
                        .weight(1f)) {
                    Icon(imageVector = Icons.Default.Notifications
                        , contentDescription = ""
                        , tint = if(selectedItem==Icons.Default.Notifications)
                            Color.White
                        else
                            Color.DarkGray
                    )
                }

                IconButton(onClick = {
                    selectedItem=Icons.Default.Person
                    navController.navigate(Routes.ProfileScreen.route){
                        popUpTo(0)
                    }
                }
                    , modifier = androidx.compose.ui.Modifier
                        .weight(1f)) {
                    Icon(imageVector = Icons.Default.Person
                        , contentDescription = ""
                        , tint = if(selectedItem==Icons.Default.Person)
                            Color.White
                        else
                            Color.DarkGray
                    )
                }

            }
        }
    ) {
        NavHost(navController = navController, startDestination = Routes.HomeScreen.route) {
            composable(route=Routes.HomeScreen.route){
                HomeScreen()
            }
            composable(route = Routes.ProfileScreen.route){
                ProfileScreen()
            }
            composable(route = Routes.SearchScreen.route){
                SearchScreen()
            }

            composable(route=Routes.NotificationScreen.route){
                NotificationScreen()
            }
        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun BottomNavigationBarPreview(){
    BottomNavigationBarCompose()
}