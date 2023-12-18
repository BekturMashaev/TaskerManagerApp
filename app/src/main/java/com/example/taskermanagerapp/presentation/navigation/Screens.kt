package com.example.taskermanagerapp.presentation.navigation

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import com.example.taskermanagerapp.R

@SuppressLint("SupportAnnotationUsage")
sealed class Screens(@StringRes val route: Int) {
    object MainScreen : Screens(R.string.main_screen_route)
    object WelcomeScreen : Screens(R.string.welcome_screen_route)
    object TasksScreen : Screens(R.string.tasks_screen_route)
}