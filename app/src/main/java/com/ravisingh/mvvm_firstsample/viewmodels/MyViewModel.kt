package com.ravisingh.mvvm_firstsample.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ravisingh.mvvm_firstsample.model.Car
import com.ravisingh.mvvm_firstsample.repository.MyRep
import kotlinx.coroutines.launch


/*
* ViewModel -> Provides data to view that user can see in app */

class MyViewModel : ViewModel() {

    val myRep: MyRep = MyRep()
    var car = MutableLiveData<Car>()

    fun getData() {
        viewModelScope.launch {
            car.value = myRep.getData() }
    }

}