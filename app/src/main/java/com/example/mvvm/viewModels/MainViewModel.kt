package com.example.mvvm.viewModels

import androidx.lifecycle.ViewModel
import com.example.mvvm.repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    fun getUserInfo() {
        val result = repository.getCurrentUser()
    }

    fun getAWisdom() {
        val result = repository.getRandomWisdom()
    }
}