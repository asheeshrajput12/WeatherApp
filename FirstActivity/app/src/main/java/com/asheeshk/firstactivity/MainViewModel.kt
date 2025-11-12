package com.asheeshk.firstactivity

import android.graphics.drawable.shapes.Shape
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel(){
    val strUderDate:LiveData<String>
    init {
        strUderDate= MutableLiveData<String>()
    }

}