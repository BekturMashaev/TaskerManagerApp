package com.example.taskermanagerapp.presentation.components.calendar_tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.taskermanagerapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasksScreenTopBar(
    modifier: Modifier = Modifier,
) {
    CenterAlignedTopAppBar(
        navigationIcon = {
            OutlinedIconButton(
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)
            }
        },
        actions = {
            OutlinedIconButton(
                onClick = { }) {
                Card(
                    modifier= modifier
                        .size(56.dp)
                        .clip(RoundedCornerShape(50.dp))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.avatar),
                        contentDescription = null,
                        modifier=modifier.fillMaxSize())
                }
            }
        },
        title = {}
    )
}