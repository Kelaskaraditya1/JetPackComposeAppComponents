package com.starkindustries.jetpackcomposeappcomponents.UiComponents.TopAppBar

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.starkindustries.jetpackcomposeappcomponents.R
import com.starkindustries.jetpackcomposeappcomponents.ui.theme.Green
import com.starkindustries.jetpackcomposeappcomponents.ui.theme.SeaFoam

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarCompose(){
    
    var context = LocalContext.current.applicationContext

    TopAppBar(title = {
        Text(text = "Whatsapp")
    }
        , colors =TopAppBarDefaults.topAppBarColors(
            containerColor = Green
            , navigationIconContentColor = Color.White
            , titleContentColor = Color.White
        )
    , navigationIcon = {
        IconButton(onClick = {  }) {
            Image(painter = painterResource(id = R.drawable.whatsapp_without_bg)
                , contentDescription = ""
            , colorFilter = ColorFilter.tint(Color.White)
            , modifier = Modifier
                    .padding(5.dp))
        }
        }
    , actions={
        IconButton(onClick = {
            Toast.makeText(context, "Person", Toast.LENGTH_SHORT).show()
        }) {
            Icon(imageVector = Icons.Default.Person
                , contentDescription = ""
            , tint = Color.White)
        }

            IconButton(onClick = {
                Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.Search
                    , contentDescription = ""
                    , tint = Color.White)
            }

            IconButton(onClick = {
                Toast.makeText(context, "Settings", Toast.LENGTH_SHORT).show()
            }) {
                Icon(imageVector = Icons.Default.MoreVert
                    , contentDescription = ""
                    , tint = Color.White)
            }
        })
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun TopAppBarPreview(){
    TopAppBarCompose()
}