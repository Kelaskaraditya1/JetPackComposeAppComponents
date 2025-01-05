package com.starkindustries.jetpackcomposeappcomponents.UiComponents.NavigationDrawer.Compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposeappcomponents.R

@Composable
fun HeaderCompose() {
    Box(modifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
        .height(200.dp)
        .background(Color.Red),
        contentAlignment = Alignment.Center){
        Column {
            Image(painter = painterResource(id = R.drawable.batman),
                contentDescription ="",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(120.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Aditya",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.W500
            )
        }

    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HeaderPreviewCompose(){
    HeaderCompose()
}