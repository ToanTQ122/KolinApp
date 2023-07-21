package com.hdt.learnapp.presentation.modules.splash

import androidx.lifecycle.viewModelScope
import com.hdt.learnapp.presentation.base.BaseViewModel
import com.hdt.learnapp.shared.utilities.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : BaseViewModel() {
    val navigateHomeObs = SingleLiveEvent<Boolean>()

    fun navigateToHome() {
        viewModelScope.launch(Dispatchers.IO) {
            delay(2000)
            navigateHomeObs.postValue(true)
        }
    }
}