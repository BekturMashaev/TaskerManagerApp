package com.example.taskermanagerapp.data.models

import androidx.compose.ui.graphics.painter.Painter
import java.io.Serial
import java.io.Serializable

data class TaskerModel (
    val count:Int,
    val title:String,
    val isBig:Boolean,
    val colorNumber:Int
):Serializable