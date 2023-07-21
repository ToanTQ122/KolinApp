package com.hdt.learnapp.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CourseModel(
    val id: Long,
    val time: Long,
    val title: String,
    val content: String,
    val colorHex: String
) : Parcelable