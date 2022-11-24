package com.example.zd5_sizov.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.zd5_sizov.Crime
import java.util.*
import java.util.concurrent.Executors

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): LiveData<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
    @Update
    fun updateCrime(crime: Crime)
    @Insert
    fun addCrime(crime: Crime)
}