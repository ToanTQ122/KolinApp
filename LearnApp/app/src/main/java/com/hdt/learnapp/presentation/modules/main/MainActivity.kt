package com.hdt.learnapp.presentation.modules.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.hdt.learnapp.R
import com.hdt.learnapp.databinding.ActivityMainBinding
import com.hdt.learnapp.presentation.base.BaseMVVMActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseMVVMActivity<ActivityMainBinding, MainViewModel>() {
    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun getLayoutBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initialize() {
    }

    override fun registerViewEvent() {
    }

    override fun registerViewModelObs() {
    }
}