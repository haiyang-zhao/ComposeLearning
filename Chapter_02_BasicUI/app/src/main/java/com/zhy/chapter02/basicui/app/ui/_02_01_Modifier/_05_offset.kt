package com.zhy.chapter02.basicui.app.ui._02_01_Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Modifier_Offset() {
    Row {
        Box(
            modifier = Modifier.size(400.dp)
                .offset(x = 200.dp,y=150.dp)
//                .offset { IntOffset(100.dp.roundToPx(),100.dp.roundToPx()) }
                .background(Color.Red)
        ){
            Spacer(
                modifier = Modifier
                    .size(width = 100.dp, height = 10.dp)
                    .background(Color.Red)
            )
        }
    }
}