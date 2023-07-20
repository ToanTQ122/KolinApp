package com.hdit.learningapp.ui.viewmodel.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CourseViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Course Fragment"
    }
    val text: LiveData<String> = _text
}