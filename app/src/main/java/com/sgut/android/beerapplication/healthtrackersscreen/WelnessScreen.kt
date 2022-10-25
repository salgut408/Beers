package com.sgut.android.beerapplication.healthtrackersscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    welnessViewModel: WelnessViewModel = viewModel(),
) {
    Column(modifier = modifier) {
        StatefulCounter()

        WellnessTasksList(
            list = welnessViewModel.tasks,
            onCheckedTask = {task, checked ->
                welnessViewModel.changeTaskChecked(task, checked)
            },
            onCloseTask = { task -> welnessViewModel.remove(task) })
    }
}

