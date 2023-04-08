package com.example.retrafit2.madel.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.IdentityHashMap

@Entity(tableName = "newdata")
data class Data(
   @PrimaryKey(autoGenerate = true)
   val id: Int,
   val  url: String,
   val startDate: String,
   val endDate:String,
   val name:String,
   val icon:String,
   val objType:String,
   val loginRequired: Boolean=false
)

