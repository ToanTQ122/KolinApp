package com.hdit.learningapp.ui.view.stackhost

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hdit.learningapp.R
import com.hdit.learningapp.databinding.RootFavouriteBinding
import com.hdit.learningapp.databinding.RootHomeBinding
import com.hdit.learningapp.ui.base.BaseRootFragment

class FragmentStackHostFavourite(
    override var layoutResId: Int = R.layout.root_home
) : BaseRootFragment<RootFavouriteBinding>()