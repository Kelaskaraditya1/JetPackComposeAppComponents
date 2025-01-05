package com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Routes

import com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Keys.Keys

sealed class Routes(var route:String){
    object HomeScreen:Routes(Keys.HOME_SCREEN_ROUTE)
    object SettingScreen:Routes(Keys.SETTINGS_SCREEN_ROUTE)
    object ProfileScreen:Routes(Keys.PROFILE_SCREEN_ROUTE)
}