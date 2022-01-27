package com.luk.biketracker.reps

import com.luk.biketracker.database.Ride
import com.luk.biketracker.database.RideDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val rideDao: RideDAO
) {
    suspend fun insertRun(ride: Ride) = rideDao.insertRun(ride)

    suspend fun deleteRun(ride: Ride) = rideDao.deleteRun(ride)

    fun getAllRunsSortedByDate() = rideDao.getAllRunsSortedByDate()





}