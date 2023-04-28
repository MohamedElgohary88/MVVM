package com.example.mvvm.model

import com.example.mvvm.model.domain.User

class FakeDatabase {
    fun getUserName(): User {
        return User("Mohamed Elgohary", 2002)
    }
}