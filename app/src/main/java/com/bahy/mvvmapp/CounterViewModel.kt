package com.bahy.mvvmapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private var liveCounter = MutableLiveData(0)

    val newCounter: LiveData<Int> = liveCounter

    fun increament(){
        liveCounter.value = liveCounter.value?.plus(1)
    }
}