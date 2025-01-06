package com.starkindustries.jetpackcomposeappcomponents.UiComponents.Routes

import com.starkindustries.jetpackcomposeappcomponents.UiComponents.Keys.Keys

sealed class Routes(var route:String){
    object HomeScreen: Routes(Keys.HOME_SCREEN_ROUTE)
    object SettingScreen: Routes(Keys.SETTINGS_SCREEN_ROUTE)
    object ProfileScreen: Routes(Keys.PROFILE_SCREEN_ROUTE)
    object SearchScreen: Routes(Keys.SEARCH_SCREEN_ROUTE)
    object NotificationScreen: Routes(Keys.NOTIFICATION_SCREEN_ROUTE)
    object PostsScreen:Routes(Keys.POSTS_SCREEN_ROUTE)
}