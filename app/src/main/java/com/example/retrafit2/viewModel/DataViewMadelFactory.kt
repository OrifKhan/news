package com.example.retrafit2.viewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrafit2.madel.db.DaoData
import com.example.retrafit2.viewModel.DataViewModel as DataViewModel

class DataViewMadelFactory(private val dataDao:DaoData,): ViewModelProvider.Factory {
   /* override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DataViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return DataViewModel(dataDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }*/
}