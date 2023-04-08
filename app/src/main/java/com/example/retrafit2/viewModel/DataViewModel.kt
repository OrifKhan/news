package com.example.retrafit2.viewModel

import DataRetrofit
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrafit2.madel.data.Data
import com.example.retrafit2.madel.db.DaoData
import com.example.retrafit2.madel.db.RoomDataBase
import com.example.retrafit2.madel.`interface`.DataApi
import com.example.retrafit2.viewModel.app.DataBaseApplication
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class DataViewModel( application: Application) : AndroidViewModel(application) {
    private val mainApi: DataApi = DataRetrofit().retrofit.create(DataApi::class.java)
    private val db=RoomDataBase.getInstance(application)
    fun insert() {
        viewModelScope.launch {
            mainApi.getData().data.forEach() {
              db.dataDao().insert(it)
            }
        }
    }

    fun getAllItem(): LiveData<List<Data>> {
        return db.dataDao().getData()
    }
}