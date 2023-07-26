package com.hdt.learnapp.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CourseModel(
    val id: Int = 0,
    val title: String,
    val description: String,
    val metaKeywords: String,
    val avatar: String,
    val type: Int,
    val time: Long,
    val favourite : Int = 0
) : Parcelable