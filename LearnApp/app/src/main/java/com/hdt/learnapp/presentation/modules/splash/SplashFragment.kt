package com.hdt.learnapp.presentation.modules.splash

import com.hdt.learnapp.databinding.FragmentSplashBinding
import com.hdt.learnapp.presentation.base.BaseMVVMFragment
import com.hdt.learnapp.presentation.modules.home.HomeFragment
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseMVVMFragment<FragmentSplashBinding, SplashViewModel>() {
    override fun getViewModelClass(): Class<SplashViewModel> {
        return SplashViewModel::class.java
    }

    override fun getLayoutBinding(): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(layoutInflater)
    }

    override fun initialize() {
        getViewModel().navigateToHome()
    }

    override fun registerViewEvent() {
    }

    override fun registerViewModelObs() {
        getViewModel().navigateHomeObs.observe(this) {
            HomeFragment.navigateFromSplashScreen(findNavController())
        }
    }
}