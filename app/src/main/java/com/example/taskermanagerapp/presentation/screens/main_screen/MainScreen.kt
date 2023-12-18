package com.example.taskermanagerapp.presentation.screens.main_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.taskermanagerapp.R
import com.example.taskermanagerapp.data.fake_data.TaskerFakeData
import com.example.taskermanagerapp.presentation.components.BottomAppBar
import com.example.taskermanagerapp.presentation.components.main_screen.MainScreenTopBar
import com.example.taskermanagerapp.presentation.components.main_screen.TaskerItem
import com.example.taskermanagerapp.presentation.navigation.Screens
import com.example.taskermanagerapp.presentation.theme.ButtonGradientBlue
import com.example.taskermanagerapp.presentation.theme.ButtonGradientPurple

@Preview
@Composable
fun MainScreenPreview() {
    MaterialTheme {
        MainScreen(navController = rememberNavController())
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {
            MainScreenTopBar()
        },
        content = { innerpadding ->
            Column(
                modifier = modifier
                    .padding(innerpadding)
                    .padding(top = 30.dp)
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = stringResource(R.string.hi_avatar_txt),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = stringResource(R.string.tasks_availbale),
                    fontSize = 14.sp,
                    color= Color.Gray
                )
                Button(
                    onClick = {
                        navController.navigate(
                            Screens.TasksScreen.route.toString()
                        )
                    },
                    modifier = modifier
                        .fillMaxWidth()
                        .height(110.dp)
                        .padding(top = 25.dp)
                        .background(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    ButtonGradientPurple, ButtonGradientBlue
                                )
                            ),
                            shape = RoundedCornerShape(15.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Column(
                        modifier=modifier.fillMaxSize()
                    ) {
                        Text(
                            text = stringResource(R.string.information_architecture)
                        )
                        Text(
                            text = stringResource(R.string.saber_oro)
                        )
                        Row {
                            OutlinedCard(
                                modifier = modifier.size(24.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.avatar),
                                    contentDescription = null,
                                    modifier = modifier.fillMaxSize()
                                )
                            }
                            OutlinedCard(
                                modifier = modifier.size(24.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.avatar),
                                    contentDescription = null,
                                    modifier = modifier.fillMaxSize()
                                )
                            }
                        }
                    }
                }
                Text(
                    text = stringResource(R.string.monthly_preview),
                    modifier=modifier
                        .padding(top = 25.dp),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                LazyVerticalStaggeredGrid(
                    modifier= Modifier
                        .padding(top = 25.dp),
                    columns = StaggeredGridCells.Fixed(2),
                    content = {
                        items(TaskerFakeData()){item->
                            TaskerItem(taskerItemModel = item)
                        }
                    })
            }
        },
        bottomBar = {
            BottomAppBar(navController=navController,true)
        }
    )
}