package com.starkindustries.jetpackcomposeappcomponents.UiComponents.BottomSheet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetCompose(){

    var sheetState = rememberStandardBottomSheetState(initialValue = SheetValue.PartiallyExpanded)

    var scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )

    var coroutineScope = rememberCoroutineScope()

     BottomSheetScaffold(sheetContent ={
         // content for Bottom Sheet

         Box(modifier = Modifier
             .fillMaxWidth()
             .height(300.dp),
             contentAlignment = Alignment.Center){
             Text(text = "I am Ironman",
                 fontSize = 18.sp,
                 fontWeight = FontWeight.W500)
         }
     } ,
         sheetContainerColor = Color.LightGray,
         sheetShape = RoundedCornerShape(15.dp),
         sheetShadowElevation = 15.dp,
         sheetSwipeEnabled = true,
         modifier = Modifier.padding(start = 10.dp, end = 10.dp),
         scaffoldState = scaffoldState) {
        // Component to control the bottom sheet

         Box(modifier = Modifier.fillMaxSize(),
             contentAlignment = Alignment.Center){
             Button(onClick = {

                 coroutineScope.launch {
                     if (sheetState.currentValue == SheetValue.Expanded) {
                         sheetState.hide()
                     } else {
                         sheetState.expand()
                     }
                 }


             }, shape = RectangleShape) {
                 Text(text = "Toggle Sheet",
                     fontSize = 15.sp,
                     fontWeight = FontWeight.SemiBold)
             }
         }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewFunction(){
    BottomSheetCompose()
}
