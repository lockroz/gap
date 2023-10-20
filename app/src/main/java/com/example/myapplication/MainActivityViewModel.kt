package com.example.myapplication
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val searchQuery = MutableLiveData<String?>(null)
}
