package com.example.mvvm.ui.utils

import android.view.View
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.example.mvvm.R
import com.example.mvvm.model.domain.Colors

@BindingAdapter(value = ["colors"])
fun View.setColor(colors: Colors?){
    when(colors) {
        Colors.Red -> setBackgroundColor(ContextCompat.getColor(context,R.color.red))
        Colors.Yellow -> setBackgroundColor(ContextCompat.getColor(context,R.color.yellow))
        Colors.Blue -> setBackgroundColor(ContextCompat.getColor(context,R.color.blue))
        null -> setBackgroundColor(ContextCompat.getColor(context,R.color.black))
    }
}