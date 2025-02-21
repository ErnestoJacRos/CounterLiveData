package com.jacrosdevs.counterlivedata.counter.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.jacrosdevs.counterlivedata.counter.viewmodel.CounterViewModel

@Composable
fun CounterButtons(modifier: Modifier = Modifier, counterViewModel: CounterViewModel) {
    Row(

        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        CounterButton(
            imageVector = Icons.Default.KeyboardArrowDown,
            onClick = {
                counterViewModel.decrmeent()
            }
        )

        CounterButton(
            imageVector = Icons.Default.KeyboardArrowUp,
            onClick = {
                counterViewModel.increment()
            }
        )


    }
}

@Composable
fun CounterButton(imageVector: ImageVector, onClick: () -> Unit) {
    FilledIconButton(onClick = onClick) {
        Icon(
            imageVector = imageVector,
            contentDescription = imageVector.toString()
        )
    }
}