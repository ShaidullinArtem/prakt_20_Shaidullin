package com.bignerdranch.android.criminalintent.database

import com.bignerdranch.android.criminalintent.Crime
import androidx.room.Dao
import androidx.room.Query
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime?
}