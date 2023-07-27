package com.hdt.learnapp.presentation.modules.home

import androidx.navigation.NavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.hdt.learnapp.R
import com.hdt.learnapp.databinding.FragmentHomeBinding
import com.hdt.learnapp.presentation.base.BaseMVVMFragment
import com.hdt.learnapp.presentation.model.CourseModel
import com.hdt.learnapp.presentation.modules.splash.SplashFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import com.hdt.learnapp.shared.exts.getDrawable

@AndroidEntryPoint
class HomeFragment : BaseMVVMFragment<FragmentHomeBinding, HomeViewModel>() {
    companion object {
        fun navigateFromSplashScreen(navController: NavController) {
            navController.navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
        }
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

    private val courseAdapter by lazy {
        CourseAdapter(
            onCourseClicked = ::onCourseClicked
        )
    }
    private fun onCourseClicked(courseModel: CourseModel) {
        //EditNoteFragment.navigateFromHomeScreen(findNavController(), noteModel)
    }
    private fun initViews() {
        getViewBinding().listPopular.apply {
            adapter = courseAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
                R.drawable.divider_item_decoration.getDrawable(requireContext())?.let {
                    setDrawable(it)
                }
            })
        }
    }

    override fun registerViewEvent() {

    }

    override fun registerViewModelObs() {

    }
    override fun onResume() {
        super.onResume()
        getViewModel().getCourses()
    }


}