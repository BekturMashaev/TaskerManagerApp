package com.example.taskermanagerapp.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.taskermanagerapp.R
import com.example.taskermanagerapp.presentation.theme.LightBlueIcon
import com.example.taskermanagerapp.presentation.theme.TaskerBlue

@Composable
fun BottomAppBar(
    isMainScreen: Boolean
) {
    BottomAppBar(
        actions = {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            ) {
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.home
                        ), contentDescription = null, tint = if (isMainScreen) TaskerBlue
                        else LightBlueIcon
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { }) {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.calendar
                        ), contentDescription = null, tint = if (!isMainScreen) TaskerBlue
                        else LightBlueIcon
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.chat
                        ), contentDescription = null,
                        tint = LightBlueIcon
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(
                            id = R.drawable.profile
                        ),
                        contentDescription = null,
                        tint = LightBlueIcon
                    )
                }
                Spacer(modifier = Modifier.weight(1f))
            }

        })
}