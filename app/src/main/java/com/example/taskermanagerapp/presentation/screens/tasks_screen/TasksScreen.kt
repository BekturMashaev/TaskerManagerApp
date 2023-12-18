package com.example.taskermanagerapp.presentation.screens.tasks_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.taskermanagerapp.presentation.components.BottomAppBar
import com.example.taskermanagerapp.presentation.components.calendar_tasks.TasksScreenTopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasksScreen(
    navController: NavController
) {
    Scaffold(
        topBar = {
            TasksScreenTopBar(navController=navController)
        },
        content = {
            Column {
                Row {
                }
            }
        },
        bottomBar = {
            BottomAppBar(navController=navController,isMainScreen = false)
        }
    )
}