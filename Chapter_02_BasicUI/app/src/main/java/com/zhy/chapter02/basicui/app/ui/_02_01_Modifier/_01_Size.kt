package com.zhy.chapter02.basicui.app.ui._02_01_Modifier

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zhy.chapter02.basicui.app.R

@Composable
@Preview
fun ModifierSize() {
    Row {
        Image(
            painter = painterResource(id = R.drawable.aglaonema),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp) //width=height=200dp
                .clip(CircleShape)
        )
        Spacer(
            modifier = Modifier
                .width(10.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.aglaonema), contentDescription = null,
            modifier = Modifier
                .size(width = 500.dp, height = 600.dp)
                .clip(CircleShape)

        )
    }
}
