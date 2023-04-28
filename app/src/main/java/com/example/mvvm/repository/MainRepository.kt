package com.example.mvvm.repository

import com.example.mvvm.model.FakeApi
import com.example.mvvm.model.FakeDatabase

class MainRepository {
    private val api = FakeApi()
    private val database = FakeDatabase()

    fun getCurrentUser() = database.getUserName()
    fun getRandomWisdom() = api.getWisdom()
}