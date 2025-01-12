package com.starkindustries.jetpackcomposeappcomponents.UiComponents.TabLayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.starkindustries.jetpackcomposeappcomponents.Fragments.HomeScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.NotificationScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.PostsScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.ProfileScreen
import com.starkindustries.jetpackcomposeappcomponents.Fragments.SearchScreen
import com.starkindustries.jetpackcomposeappcomponents.Navigation.NavigationCompose
import com.starkindustries.jetpackcomposeappcomponents.Routes.Routes
import com.starkindustries.jetpackcomposeappcomponents.Utility.Utility

@Composable
fun TablayoutCompose(){

    var navController = rememberNavController()
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

    var selectedtab by remember {
        mutableIntStateOf(0)
    }
    var pagerState = rememberPagerState {
        Utility.getTabItems().size
    }
    
    LaunchedEffect(selectedtab) {
        pagerState.animateScrollToPage(selectedtab)
    }
    LaunchedEffect(pagerState.currentPage) {
        selectedtab=pagerState.currentPage
    }

    Column(modifier = Modifier
        .fillMaxSize()) {
        TabRow(selectedTabIndex = selectedtab) {
            Utility.getTabItems().forEachIndexed{ index,item->
                Tab(selected = selectedtab==index,
                    onClick = {
                    selectedtab=index
                }
                , icon = {
                    Icon(imageVector = if(selectedtab==index)
                                            item.selectedIcon
                                        else
                                            item.unSelectedIcon
                        , contentDescription = "")
                    }
                , text = {
                    Text(text = item.title)
                    })

            }
        }

        HorizontalPager(state = pagerState
        , modifier = Modifier
                .fillMaxWidth()
                .weight(1f)) {  index->
            when(index){
                0->{
                    navController.navigate(Routes.HomeScreen.route)
                }
                1->{
                    navController.navigate(Routes.SearchScreen.route)
                }
                2->{
                    navController.navigate(Routes.ProfileScreen.route)
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TablayoutPreview(){
    TablayoutCompose()
}