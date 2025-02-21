package com.jacrosdevs.counterlivedata.counter.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.jacrosdevs.counterlivedata.counter.viewmodel.CounterViewModel

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {

    val counterViewModel: CounterViewModel = CounterViewModel(LocalContext.current)
    Scaffold { innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            CounterValue(counterViewModel = counterViewModel)

            CounterButtons(counterViewModel = counterViewModel)
        }
    }
}

