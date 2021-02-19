package com.connecxionone.exam.ui.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.connecxionone.exam.repository.AppRepository

abstract class ListViewModel<T: Any>(private val repository: AppRepository): ViewModel() {

    abstract fun getData()

    val listData = MutableLiveData<List<T>>()
    val isEmpty = MutableLiveData<Boolean>()

    init {
        isEmpty.value = true
    }

    protected val callback =  object: AppRepository.Callback<T> {
        override fun onResult(items: List<T>) {
            mutableListOf<T>().apply {
                listData.value?.let {
                    addAll(it)
                }
                addAll(items)
            }.also {
                listData.postValue(it)
                isEmpty.postValue(it.count() == 0)
            }
        }
    }
}
