package com.example.retrafit2.madel.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.retrafit2.madel.data.Data

@Database(entities = [Data::class], version = 1, exportSchema = true)
abstract class RoomDataBase : RoomDatabase() {
    abstract fun dataDao(): DaoData


    companion object {
        var INSTANCE: RoomDataBase? = null
        fun getInstance(context: Context): RoomDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDataBase::class.java,
                    "dodo_base"
                )
                    .build()
                INSTANCE = instance

                instance
            }

        }
    }


}