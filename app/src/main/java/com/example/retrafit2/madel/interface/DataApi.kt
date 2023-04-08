package com.example.retrafit2.madel.`interface`

import com.example.retrafit2.madel.data.Data
import com.example.retrafit2.madel.data.GetData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface DataApi {
    @GET("upcomingGuides/")
   suspend fun getData(): GetData

}