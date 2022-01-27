package com.luk.biketracker.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.luk.biketracker.database.Ride
import com.luk.biketracker.reps.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {

    val runsSortedbydata = mainRepository.getAllRunsSortedByDate()


    fun insertRun(ride: Ride) = viewModelScope.launch {
        mainRepository.insertRun(ride)
    }

}