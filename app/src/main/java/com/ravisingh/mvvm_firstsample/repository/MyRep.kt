package com.ravisingh.mvvm_firstsample.repository

import com.ravisingh.mvvm_firstsample.model.Car
import kotlinx.coroutines.delay

/*
* Repository -> Work as a Abstraction layer and provide data to ViewModel
*               Here once Work is done then data is transmitted to the ViewModel
* Like -> fetching data from database or API  */

class MyRep {

    /*
    * Suspend function -> is a function that could be started, paused, and resume. One of the most important points
    * to remember about the suspend functions is that they are only allowed to be called from a coroutine or
    * another suspend function */

    suspend fun getData(): Car {

        delay(1000)

        return Car("BMW", "MH AV 1901")
    }
}