package com.hdt.learnapp.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListCourseModel(
    val page: Int,
    val totalPage: Int,
    val courses: List<CourseModel>? = null
) : Parcelable