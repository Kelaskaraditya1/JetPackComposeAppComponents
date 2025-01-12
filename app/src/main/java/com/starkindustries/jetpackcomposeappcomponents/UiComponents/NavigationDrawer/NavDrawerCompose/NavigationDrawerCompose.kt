package com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.NavDrawerCompose

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.starkindustries.jetpackcomposeappcomponents.Fragments.HomeScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.ProfileScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.SettingsScreen
import com.starkindustries.jetpackcomposeappcomponents.Routes.Routes
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationDrawerCompose() {
    var navController = rememberNavController()
    var coroutineScope = rememberCoroutineScope()
    var drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = {
            ModalDrawerSheet {
                HeaderCompose()
                Spacer(modifier = Modifier.height(10.dp))

                NavigationDrawerItem(
                    label = {
                        Text(
                            text = "Home Screen",
                            fontWeight = FontWeight.W500,
                            fontSize = 18.sp
                        )
                    },
                    icon = {
                        Icon(imageVector = Icons.Default.Home, contentDescription = null)
                    },
                    selected = false,
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navController.navigate(Routes.HomeScreen.route) {
                            popUpTo(navController.graph.startDestinationId)
                        }
                    }
                )

                NavigationDrawerItem(
                    label = {
                        Text(
                            text = "Profile Screen",
                            fontWeight = FontWeight.W500,
                            fontSize = 18.sp
                        )
                    },
                    icon = {
                        Icon(imageVector = Icons.Default.Person, contentDescription = null)
                    },
                    selected = false,
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navController.navigate(Routes.ProfileScreen.route) {
                            popUpTo(navController.graph.startDestinationId)
                        }
                    }
                )

                NavigationDrawerItem(
                    label = {
                        Text(
                            text = "Settings Screen",
                            fontWeight = FontWeight.W500,
                            fontSize = 18.sp
                        )
                    },
                    icon = {
                        Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                    },
                    selected = false,
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navController.navigate(Routes.SettingScreen.route) {
                            popUpTo(navController.graph.startDestinationId)
                        }
                    }
                )
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(text = "Navigation Drawer")
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Transparent,
                        titleContentColor = Color.Black,
                        navigationIconContentColor = Color.Black
                    ),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    }
                )
            }
        ) {
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
            }        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestnavigationDrawer(){
    var coroutineScope = rememberCoroutineScope()
    var drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    var navController = rememberNavController()
    ModalNavigationDrawer(drawerState=drawerState
        , gesturesEnabled = true
            , drawerContent = {
                ModalDrawerSheet {
                    HeaderCompose()
                    Spacer(modifier = Modifier
                        .height(10.dp))
                    NavigationDrawerItem(label = { Text(text = "Home Screen"
                    , fontWeight = FontWeight.W500
                    , fontSize = 18.sp) }
                        , selected = false
                        , onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            navController.navigate(Routes.HomeScreen.route){
                                popUpTo(0)
                            }
                        }
                    , icon = {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "")
                        })

                    NavigationDrawerItem(label = { Text(text = "Profile Screen"
                    , fontSize = 18.sp
                    , fontWeight = FontWeight.W500) }
                        , selected = false
                        , onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            navController.navigate(Routes.ProfileScreen.route){
                                popUpTo(0)

                            }
                    }
                    , icon = {
                        Icon(imageVector = Icons.Default.Person, contentDescription = "")
                        })

                    NavigationDrawerItem(label = {
                        Text(text = "Settings Screen"
                        , fontWeight = FontWeight.W500
                        , fontSize = 18.sp)
                    }
                        , selected = false
                        , onClick = {
                            coroutineScope.launch {
                                drawerState.close()
                            }
                            navController.navigate(Routes.SettingScreen.route){
                                popUpTo(0)

                            }
                        }
                    , icon = {
                        Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                        })
                }
        }) {
        Scaffold(
            topBar = {
                TopAppBar(title = {
                    Text(text = "Navigation Drawer"
                    , fontWeight = FontWeight.W500
                    , fontSize = 18.sp)
                },
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    }
                , colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                    , navigationIconContentColor = Color.Black
                ))
            }
        ) {
            NavHost(navController = navController, startDestination = Routes.HomeScreen.route ){
                composable(Routes.HomeScreen.route){
                    HomeScreen()
                }
                composable(Routes.ProfileScreen.route){
                    ProfileScreen()
                }
                composable(Routes.SettingScreen.route){
                    SettingsScreen()
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewFunction(){
    TestnavigationDrawer()

}