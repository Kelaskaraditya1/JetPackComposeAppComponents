package com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Navigation

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
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Compose.HeaderCompose
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Compose.HomeScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Compose.ProfileScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Compose.SettingsScreen
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Routes.Routes
import kotlinx.coroutines.launch



@Composable
fun NavigationCompose(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.HomeScreen.route){
        composable(route=Routes.HomeScreen.route){
            HomeScreen()
        }
        composable(route=Routes.ProfileScreen.route){
            ProfileScreen()
        }
        composable(route=Routes.ProfileScreen.route){
            ProfileScreen()
        }
    }
}

