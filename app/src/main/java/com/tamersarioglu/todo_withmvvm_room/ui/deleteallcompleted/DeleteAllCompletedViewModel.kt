package com.tamersarioglu.todo_withmvvm_room.ui.deleteallcompleted

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.tamersarioglu.todo_withmvvm_room.data.TaskDao
import com.tamersarioglu.todo_withmvvm_room.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class DeleteAllCompletedViewModel @ViewModelInject constructor(
        private val taskDao: TaskDao,
        @ApplicationScope private val applicationScope: CoroutineScope
) : ViewModel() {
    fun onConfirmClick() = applicationScope.launch {
        taskDao.deleteCompletedTask()
    }
}