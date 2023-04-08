package com.example.retrafit2.madel.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.retrafit2.madel.data.Data

@Dao
interface  DaoData {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(data: Data)

    @Query("SELECT * FROM newdata ")
    fun getData(): LiveData<List<Data>>
}