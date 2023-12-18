package com.example.taskermanagerapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taskermanagerapp.presentation.screens.main_screen.MainScreen
import com.example.taskermanagerapp.presentation.screens.tasks_screen.TasksScreen
import com.example.taskermanagerapp.presentation.screens.welcome_screen.WelcomeScreen

@Composable
fun TaskerNavigation() {
    val navController = rememberNavController()
    val mainScreenRoute = Screens.MainScreen.route.toString()
    val welcomeScreenRoute = Screens.WelcomeScreen.route.toString()
    val tasksScreenRoute = Screens.TasksScreen.route.toString()
    NavHost(
        navController = navController,
        startDestination = welcomeScreenRoute,
    ) {
        composable(mainScreenRoute) {
            MainScreen(navController=navController)
        }
        composable(welcomeScreenRoute) {
            WelcomeScreen(navController=navController)
        }
        composable(tasksScreenRoute) {
            TasksScreen(navController=navController)
        }
    }
}