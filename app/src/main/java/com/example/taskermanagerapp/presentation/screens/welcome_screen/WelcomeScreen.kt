package com.example.taskermanagerapp.presentation.screens.welcome_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.taskermanagerapp.R
import com.example.taskermanagerapp.presentation.navigation.Screens
import com.example.taskermanagerapp.presentation.theme.ButtonGradientBlue
import com.example.taskermanagerapp.presentation.theme.ButtonGradientPurple
import com.example.taskermanagerapp.presentation.theme.TaskerBlue

@Preview
@Composable
fun WelcomeScreenPreview() {
    MaterialTheme {
        WelcomeScreen(rememberNavController())
    }
}

@Composable
fun WelcomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Surface(
        color = TaskerBlue,
        modifier = modifier.fillMaxSize()
    ) {
        Column {
            Spacer(modifier = modifier.height(10.dp))
            Image(
                painter = painterResource(id = R.drawable.welcome_screen_image),
                contentDescription = null
            )
            Card(
                colors = CardDefaults.cardColors(Color.White),
                modifier = modifier
                    .padding(top = 20.dp)
                    .fillMaxSize(),
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
            ) {
                Column(
                    modifier = modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = stringResource(R.string.welcome_screen_title),
                        textAlign = TextAlign.Center,
                        modifier = modifier.padding(top = 10.dp),
                        fontSize = 37.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(letterSpacing = 2.sp)
                    )
                    Text(
                        text = "Create a unique emotional story that \n describes better than words",
                        textAlign = TextAlign.Center,
                        color = Color.Gray,
                        modifier = modifier
                            .padding(top = 10.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        style = TextStyle(lineHeight = 24.sp)
                    )
                    Spacer(modifier = modifier.height(40.dp))
                    Button(
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        modifier = modifier
                            .fillMaxWidth(0.8f)
                            .height(50.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        ButtonGradientPurple, ButtonGradientBlue
                                    )
                                ),
                                shape = RoundedCornerShape(15.dp)
                            ),
                        onClick = {
                            navController.navigate(
                                Screens.MainScreen.route.toString()
                            )
                        },
                    ) {
                        Text(
                            text = stringResource(R.string.button_welcome_screen_title),
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}