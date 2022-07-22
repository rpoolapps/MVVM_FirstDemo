package com.ravisingh.mvvm_firstsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ravisingh.mvvm_firstsample.viewmodels.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

/*
* MVVM Source -> https://www.geeksforgeeks.org/mvvm-model-view-viewmodel-architecture-pattern-in-android/
*
* */

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MyViewModel::class.java]


        show_toast_btn.setOnClickListener{
            viewModel.getData()

            viewModel.car.observe(this) {
                Toast.makeText(
                    this@MainActivity,
                    "name = ${it.name}\n number = ${it.number}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }
}