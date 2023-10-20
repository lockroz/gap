package com.example.myapplication.models

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.models.Category
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch



class SharedViewModel : ViewModel() {
    private val selectedCategories = MutableStateFlow<Array<Category>?>(null)


    fun getSelectedCategories(): StateFlow<Array<Category>?> {
        Log.d("fer", "getSelectedCategories: ${selectedCategories.value}")
        return selectedCategories
    }

    fun setSelectedCategories (categories: Array<Category>?) {

            selectedCategories.value = categories
            Log.d("fer", "getSelectedCategories: ${selectedCategories.value}")


    }
}