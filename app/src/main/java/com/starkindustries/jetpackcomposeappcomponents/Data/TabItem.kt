package com.starkindustries.jetpackcomposeappcomponents.Data

import androidx.compose.ui.graphics.vector.ImageVector

data class TabItem(
    val title:String,
    val unSelectedIcon:ImageVector,
    val selectedIcon:ImageVector
)