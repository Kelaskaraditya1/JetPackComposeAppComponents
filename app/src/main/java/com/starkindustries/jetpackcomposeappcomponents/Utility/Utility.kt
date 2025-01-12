package com.starkindustries.jetpackcomposeappcomponents.Utility

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import com.starkindustries.jetpackcomposeappcomponents.Data.TabItem

class Utility {
    companion object{
        fun getTabItems():List<TabItem>{
            val tabItemsList=listOf(
                TabItem("Home",Icons.Outlined.Home,Icons.Filled.Home)
                ,TabItem("Search",Icons.Outlined.Search,Icons.Filled.Search)
                ,TabItem("Profile",Icons.Outlined.Person,Icons.Filled.Person)
            )
            return tabItemsList
        }
    }
}