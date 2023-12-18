package com.example.taskermanagerapp.data.fake_data

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.taskermanagerapp.R
import com.example.taskermanagerapp.data.models.TaskerModel

fun TaskerFakeData()= listOf<TaskerModel>(
    TaskerModel(
        count =22,
        title = "Done",
        isBig = true,
        colorNumber = 1
    ),

    TaskerModel(
        count =7,
        title = "In Progress",
        isBig = false,
        colorNumber = 2
    ),

    TaskerModel(
        count =12,
        title = "Ongoing",
        isBig = false,
        colorNumber = 3
    ),
    TaskerModel(
        count =14,
        title = "Waiting For Review",
        isBig = true,
        colorNumber = 4
    ),
)