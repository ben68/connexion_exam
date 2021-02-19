package com.connecxionone.exam.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

 class BlankViewModel: ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    fun setName(name: String){
        _text.value = "This is $name Fragment"
    }
}