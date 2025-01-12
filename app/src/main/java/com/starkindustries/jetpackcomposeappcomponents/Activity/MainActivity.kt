package com.starkindustries.jetpackcomposeappcomponents.Activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.BottomNavigationBar.BottomNavigationBarCompose
import com.starkindustries.jetpackcomposeappcomponents.UiComponents.TabLayout.TablayoutCompose
import com.starkindustries.jetpackcomposeappcomponents.ui.theme.JetPackComposeAppComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeAppComponentsTheme {
                TablayoutCompose()
            }
        }
    }
}

