package com.zhy.chapter02.basicui.app.ui._02_01_Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun Modifier_scope() {
    Row {
        Box(
            modifier = Modifier
                .size(400.dp)
                .offset(x = 200.dp, y = 150.dp)
//                .offset { IntOffset(100.dp.roundToPx(),100.dp.roundToPx()) }
                .background(Color.Red)
        ) {
            Spacer(
                modifier = Modifier
                    .size(width = 100.dp, height = 10.dp)
                    .background(Color.Red)
            )
        }
    }
}

class AScope {
    fun visitA() {}
}

class BScope {
    fun visitB() {}
}

fun funA(scope: AScope.() -> Unit) {
    scope(AScope())
}

fun funB(scope: BScope.() -> Unit) {
    scope(BScope())
}

fun test() {
    funA {
        funB {
            visitA() // 跨级访问
        }
    }
}


@Composable
@Preview
fun Modifier_Weight() {
    Column(
        modifier = Modifier
            .width(300.dp)
            .height(200.dp)
    ) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        )
    }
}