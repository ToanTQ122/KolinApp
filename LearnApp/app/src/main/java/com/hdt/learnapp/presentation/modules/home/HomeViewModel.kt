package com.hdt.learnapp.presentation.modules.home

import androidx.lifecycle.viewModelScope
import com.hdt.learnapp.domain.usecases.course.DeleteCourseUseCase
import com.hdt.learnapp.domain.usecases.course.GetCourseUseCase
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
    private val deleteCoursesUseCase: DeleteCourseUseCase,
    private val CourseMapper: CourseMapper
) : BaseViewModel() {
    val getCourseObs = SingleLiveEvent<ProcessState<List<CourseModel>>>()
    val deleteCourseObs = SingleLiveEvent<ProcessState<CourseModel>>()

    fun getCourses() {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                getCoursesUseCase.invoke()
            }
                .onSuccess {
                    getCourseObs.postValue(ProcessState.success(CourseMapper.transformList(it)))
                }
                .onFailure {
                    getCourseObs.postValue(ProcessState.error(it))
                }
        }
    }

    fun deleteCourse(CourseModel: CourseModel) {
        viewModelScope.launch(Dispatchers.IO) {
            kotlin.runCatching {
                deleteCoursesUseCase.invoke(CourseModel.id)
            }
                .onSuccess {
                    deleteCourseObs.postValue(ProcessState.success(CourseModel))
                }
                .onFailure {
                    deleteCourseObs.postValue(ProcessState.error(it))
                }
        }
    }
}