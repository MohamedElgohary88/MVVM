package com.example.mvvm.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.domain.Colors
import com.example.mvvm.model.domain.User
import com.example.mvvm.model.domain.Wisdom
import com.example.mvvm.model.repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()
    private val _currentUser = MutableLiveData<User>()
    val currentUser: LiveData<User>
        get() = _currentUser

    private val _wisdom = MutableLiveData<Wisdom>()
    val wisdom: LiveData<Wisdom>
        get() = _wisdom

    val enterUserName = MutableLiveData<String>()

    val color = MutableLiveData<Colors?>()
    fun changeColor(){
        color.postValue(Colors.values().random())
    }
    init {
        getUserInfo()
    }

    fun getUserInfo() {
        _currentUser.postValue(repository.getCurrentUser())
    }

    fun getAWisdom() {
        _wisdom.postValue(repository.getRandomWisdom())
    }
}