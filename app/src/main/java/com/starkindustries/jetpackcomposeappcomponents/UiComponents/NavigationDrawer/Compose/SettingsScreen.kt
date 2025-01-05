package com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun SettingsScreen(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "Settings Screen",
            fontSize = 25.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
    }
}