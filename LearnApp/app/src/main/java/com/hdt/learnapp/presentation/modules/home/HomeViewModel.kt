package com.hdt.learnapp.presentation.modules.home

import androidx.lifecycle.viewModelScope
import com.hdt.learnapp.domain.usecases.GetCourseUseCase
import com.hdt.learnapp.presentation.base.BaseViewModel
import com.hdt.learnapp.presentation.base.ProcessState
import com.hdt.learnapp.presentation.model.CourseModel
import com.hdt.learnapp.presentation.modules.mappers.CourseMapper
import com.hdt.learnapp.shared.utilities.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getCoursesUseCase: GetCourseUseCase,
    //private val courseMapper: CourseMapper
) : BaseViewModel() {
    val getCourseObs = SingleLiveEvent<ProcessState<List<CourseModel>>>()

    fun getCourses() {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                getCoursesUseCase.invoke()
            }
                .onSuccess {
                    //getCourseObs.postValue(ProcessState.success(courseMapper.transformList(it)))
                }
                .onFailure {
                    getCourseObs.postValue(ProcessState.error(it))
                }
        }
    }
}