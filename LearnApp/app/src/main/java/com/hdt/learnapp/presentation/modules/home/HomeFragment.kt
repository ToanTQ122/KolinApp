package com.hdt.learnapp.presentation.modules.home

import androidx.navigation.NavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.hdt.learnapp.R
import com.hdt.learnapp.databinding.FragmentHomeBinding
import com.hdt.learnapp.presentation.base.BaseMVVMFragment
import com.hdt.learnapp.presentation.model.CourseModel
import com.hdt.learnapp.presentation.modules.splash.SplashFragmentDirections
import com.hdt.learnapp.shared.widget.CommonDialog
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseMVVMFragment<FragmentHomeBinding, HomeViewModel>() {
    companion object {
        fun navigateFromSplashScreen(navController: NavController) {
            navController.navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
        }
    }

    private val CourseAdapter by lazy {
        CourseAdapter(
            onCourseClicked = ::onCourseClicked
        )
    }

    private val infoDialog by lazy {
        CommonDialog(
            context = requireContext(),
            title = getString(R.string.msg_info),
            positiveText = getString(R.string.thanks),
            positiveBackgroundColor = R.color.colorGreenJungle,
        )
    }

    override fun getViewModelClass(): Class<HomeViewModel> {
        return HomeViewModel::class.java
    }

    override fun getLayoutBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun initialize() {
        initViews()
    }

    override fun onResume() {
        super.onResume()
        getViewModel().getCourses()
    }

    private fun initViews() {
        getViewBinding().rvCourses.apply {
            adapter = CourseAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
                R.drawable.divider_item_decoration.getDrawable(requireContext())?.let {
                    setDrawable(it)
                }
            })
        }
    }



    private fun onCourseClicked(CourseModel: CourseModel) {
        //EditCourseFragment.navigateFromHomeScreen(findNavController(), CourseModel)
    }
}