package com.starkindustries.jetpackcomposeappcomponents.UiComponents.BottomSheet.Compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposeappcomponents.R
import com.starkindustries.jetpackcomposeappcomponents.ui.theme.SeaFoam

@Composable
fun PostRowCompose(icon:ImageVector,title:String,onClick:()->Unit){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, top = 20.dp)
        .clickable {
            onClick()
        }
    , verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = icon
            , contentDescription =""
        , modifier = Modifier
                .size(40.dp)
        , tint = Color.Green)
        Spacer(modifier = Modifier
            .width(20.dp))
        Text(text = title
        , color = SeaFoam
        , fontWeight = FontWeight.SemiBold
            , fontSize =20.sp)
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PostRowPreview(){
    PostRowCompose(Icons.Default.ThumbUp,"Create a post"){

    }
}