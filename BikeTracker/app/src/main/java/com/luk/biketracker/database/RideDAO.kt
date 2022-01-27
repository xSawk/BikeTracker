package com.luk.biketracker.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RideDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(ride: Ride)

    @Delete
    suspend fun deleteRun(ride: Ride)

    @Query("SELECT * FROM ride_table ORDER BY timestamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Ride>>




}










