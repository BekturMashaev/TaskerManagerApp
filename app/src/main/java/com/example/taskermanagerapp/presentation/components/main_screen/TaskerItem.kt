package com.example.taskermanagerapp.presentation.components.main_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskermanagerapp.data.models.TaskerModel

@Composable
fun TaskerItem(
    modifier: Modifier = Modifier,
    taskerItemModel: TaskerModel
) {
    val randomColor = Color(
        red = (Math.random() * 0.8 + 0.2).toFloat(),
        green = (Math.random() * 0.8 + 0.2).toFloat(),
        blue = (Math.random() * 0.8 + 0.2).toFloat(),
        alpha = 1f
    )
    Card(
        colors = CardDefaults.cardColors(containerColor = randomColor),
        modifier = modifier
            .width(162.dp)
            .padding(5.dp)
            .height(
                if (taskerItemModel.isBig) 150.dp
                else 105.dp
            )
    ) {
        Column(
            modifier = modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = taskerItemModel.count.toString(),
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 10.sp
            )
            Text(
                text = taskerItemModel.title,
                color =  Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 14.sp
            )
        }
    }
}